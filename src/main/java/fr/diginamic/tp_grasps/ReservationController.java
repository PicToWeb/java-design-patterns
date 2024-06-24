package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.ReservationFactory;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

/**
 * Controlleur qui prend en charge la gestion des réservations client
 * 
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

	/** DAO permettant d'accéder à la table des clients */
	private static ClientDao clientDao = new ClientDao();

	/** DAO permettant d'accéder à la table des types de réservation */
	private static TypeReservationDao typeReservationDao = new TypeReservationDao();

	/**
	 * Méthode qui créée une réservation pour un client à partir des informations
	 * transmises
	 * 
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
	public Reservation creerReservation(Params params) {

		// 5) Création de la réservation
//		Reservation reservation = new Reservation(UtilsDate.toDate(params.getDateReservation()));
//		reservation.setNbPlaces(params.getNbPlaces());
//		reservation.setClient(chercherClient(params));
		Reservation reservation = ReservationFactory.getInstance(params);

		return montantReservation(reservation, params);
	}

	public static Reservation montantReservation(Reservation reservation, Params params) {

		// 4) Extraction de la base de données des infos concernant le type de la
		// réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(params.getTypeReservation());
		int nbPlace = reservation.getNbPlaces();

		// 7) Calcul du montant total de la réservation qui dépend:
		// - du nombre de places
		// - de la réduction qui s'applique si le client est premium ou non
		double total = type.getMontant() * nbPlace;
		if (reservation.getClient().isPremium()) {
			reservation.setTotal(total * (1 - type.getReductionPourcent() / 100.0));
		} else {
			reservation.setTotal(total);
		}
		return reservation;
	}

	public static Client chercherClient(Params params) {

		return clientDao.extraireClient(params.getIdentifiantClient());

	}

}
