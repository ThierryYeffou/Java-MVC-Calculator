package model;

public class Carre implements Formes {
	
	private float cote;
	
	public Carre(float cote) {
		this.cote=cote;
	}

	public float getCote() {
		return cote;
	}

	public void setCote(float cote) {
		this.cote = cote;
	}

	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return cote * 4;
	}

	@Override
	public float surface() {
		// TODO Auto-generated method stub
		return cote * cote;
	}

}
