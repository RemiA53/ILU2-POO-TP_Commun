package model;

public class CentraleReservation<F extends Formulaire, E extends EntiteReservable<F>> {
	private E[] entites;
	private int nbEntite;
	
	public CentraleReservation(E[] entites) {
		this.entites = entites;
	}
	
	public int ajouterEntite(E entite) {
		entites[nbEntite] = entite;
		return nbEntite++;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] possibilites = new int[nbEntite];
		for (int i = 0; i < nbEntite; i++) {
			boolean estLibre = entites[i].estLibre(formulaire);
			if (estLibre) {
				possibilites[i] = 1;
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
	public Reservation Reservation(int numEntite, F formulaire) {
		E entite = entites[numEntite-1];
		formulaire.setIdentificationEntite(numEntite);
		return entite.reserver(formulaire);
	}
}
