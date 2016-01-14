package syd;

public class GrajdanskoDelo extends Delo {
	private Zasedatel zasedateli[];

	GrajdanskoDelo(Sydiq sydiq, Obvinqem obvieqm) {
		super(sydiq, obvieqm);
		this.zasedateli = new Zasedatel[3];
	}
}
