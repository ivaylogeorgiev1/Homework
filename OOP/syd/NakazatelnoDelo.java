package syd;

public class NakazatelnoDelo extends Delo {
	private Zasedatel zasedateli[];
	private Prokuror prokuror;
	private int countVinoven;
	private int countNevinen;

	NakazatelnoDelo(Sydiq sydiq, Obvinqem obvieqm, Prokuror prokuror) {
		super(sydiq, obvieqm);
		this.zasedateli = new Zasedatel[13];
		this.prokuror = prokuror;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void provedi() {
		getSydiq().setBroiDela(getSydiq().getBroiDela() + 1);
		this.prokuror.setBroiDela(prokuror.getBroiDela() + 1);
		for (int i = 0; i < zasedateli.length; i++) {
			if (zasedateli[i] != null) {
				zasedateli[i].setBroiDela(zasedateli[i].getBroiDela() + 1);
			}
		}
		// NE STAVA S FOR EACH ??
		// for(Zasedatel z:zasedateli){
		// if(z!=null){
		//
		// }
		// }

		for (int i = 0; i < 5; i++) {
			this.prokuror.zadai(getObvinqem());
		}

		for (Svidetel s : getSvideteli()) {
			for (int i = 0; i < 5; i++) {
				this.prokuror.zadai(s);
			}

		}
		for (Svidetel s : getSvideteli()) {
			for (Advokat a : getObvinqem().getAdvokati()) {
				for (int i = 0; i < 5; i++) {
					a.zadai(s);
				}
			}
		}
		for (Zasedatel z : zasedateli) {
			boolean decision = z.takeDecision();
			if (decision) {
				countVinoven++;
			} else {
				countNevinen++;
			}
		}
		if (countVinoven > countNevinen) {
			System.out.println(this.getObvinqem()
					+ " shte leji ei tolkova godini "
					+ getSydiq().otsydiGodini());
		} else {
			System.out.println("Nevinen");
		}
	}
}