package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant> {
	private CentraleReservation<FormulaireRestaurant, EntiteReservable<FormulaireRestaurant>> centrale;

	public Restaurant(CentraleReservation<FormulaireRestaurant, EntiteReservable<FormulaireRestaurant>> centrale) {
		this.centrale = centrale;
	}

	private static class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService;

		private Table(CalendrierAnnuel carnetReservation, int identification, int nbChaises) {
			super(carnetReservation, identification);
			this.nbChaises = nbChaises;
		}
		
		@Override
		private boolean compatible(FormulaireRestaurant f) {
			boolean estLibre = estLibre(f);
			boolean estBonneTaille = (f.getNombrePersonnes()-nbChaises)<1
		}
		

	}
}
