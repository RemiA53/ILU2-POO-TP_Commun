package model;


public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}

	public int getNumService() {
		return numService;
	}

	public int getNumTable() {
		return numTable;
	}
	
	@Override
	public String toString() {
		String service = (numService==1) ? "premier service" : "deuxième service";
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\nTable ");
		sb.append(numTable);
		sb.append(" pour le ");
		sb.append(service);
		sb.append(".");
		return sb.toString();
	}
}
