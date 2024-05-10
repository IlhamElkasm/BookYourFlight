package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Classes.Airport;
import Classes.Passager;
import Classes.Réservation;
import Classes.Siège;
import Classes.Utilisateur;
import Classes.Vol;



public class Main {

	public static void main(String[] args) {
		 Airport airport = new Airport("Airport","Marakech","Paris","Maroc"); 
		 Vol vol= new Vol("Compagnie", "09/05/2024", "15/05/2024", 1200);
			/*
			 * Siège siège = new Siège(vol, 1, true); Passager passager = new
			 * Passager("ilham"); Utilisateur utilisateur = new Utilisateur("ilham",
			 * "ilhamelkasmi@gmail.com"); Réservation réservation = new
			 * Réservation(utilisateur,siège,"ilhamelkasmi@gmail.com");
			 */

		Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(vol);
        session.save(airport);
		/*
		 * session.save(siège); session.save(passager); session.save(utilisateur);
		 * session.save(réservation);
		 */
        tx.commit();
        session.close();
        System.out.println("Record Saved Successfully!");
		

	}

}
