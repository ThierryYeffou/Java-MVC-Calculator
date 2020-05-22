package model;

public class Rond implements Formes{
	
	private float rayon;
	
	public Rond(float rayon) {
		this.rayon=rayon;
	}

	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return (float) (2* rayon * Math.PI);
	}
	
	@Override
	public float surface() {
		// TODO Auto-generated method stub
		return (float) (Math.PI * rayon * rayon);
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}

	

}
