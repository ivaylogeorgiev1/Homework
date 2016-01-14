package syd;

public abstract class Urist extends Person {
	private int staj;
	private int broiDela;

	Urist(String name, String adres, int staj, int broiDela) {
		super(name, adres);
		if (staj > 0) {
			this.staj = staj;
		} else {
			this.staj = 0;
		}
		if (broiDela > 0) {
			this.broiDela = broiDela;
		} else
			broiDela = 0;
	}

	public void zadai(Grajdanin grajdanin) {
		System.out.println(this.getName() + " zadade wypros na " + grajdanin);
	}

	public void zapishiVBelejnik() {
		System.out.println(this.getName() + " si zapisa w belejnika ");
	}

	public int getBroiDela() {
		return broiDela;
	}

	public void setBroiDela(int broiDela) {
		this.broiDela = broiDela;
	}

}
