package model;

public abstract class EntiteReservable<F extends Formulaire> {
	private CalendrierAnnuel carnetReservation;
	private int identification;
	
	protected EntiteReservable(CalendrierAnnuel carnetReservation, int identification) {
		this.carnetReservation = carnetReservation;
		this.identification = identification;
	}

	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return carnetReservation.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}
