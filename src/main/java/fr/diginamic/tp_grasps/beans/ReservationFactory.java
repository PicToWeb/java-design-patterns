package fr.diginamic.tp_grasps.beans;

import fr.diginamic.tp_grasps.Params;
import fr.diginamic.tp_grasps.UtilsDate;

public class ReservationFactory {

	public static Reservation getInstance(Params params) {
		Reservation reservation = new Reservation(UtilsDate.toDate(params.getDateReservation()));
		reservation.setNbPlaces(params.getNbPlaces());
		reservation.setClient(chercherClient(params));
	}
	
}
