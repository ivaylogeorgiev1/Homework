package syd;

public abstract class Delo {
	private Sydiq sydiq;
	private Svidetel[] svideteli;
	private Obvinqem obvinqem;

	Delo(Sydiq sydiq, Obvinqem obvieqm) {
		if (sydiq != null) {
			this.sydiq = sydiq;
		} else {
			throw new IllegalArgumentException("Nqmash sydiq");
		}
	}

	// da napravq ... throw exception i za obvinqm...
	public abstract void provedi();

	public Sydiq getSydiq() {
		return sydiq;
	}

	public Obvinqem getObvinqem() {
		return obvinqem;
	}

	public Svidetel[] getSvideteli() {
		return svideteli;
	}


}
