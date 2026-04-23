package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	public Reservation(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Le ");
		sb.append(jour);
		sb.append("/");
		sb.append(mois);
		return sb.toString();
	}
	
}
