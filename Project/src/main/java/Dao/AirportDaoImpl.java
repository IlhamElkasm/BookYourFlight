package Dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import Classes.Airport;



public class AirportDaoImpl implements AirportDao {

	@Override
	public void SaveAirport(Airport airport) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(airport);
			transaction.commit();
		}catch(Exception e){
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}

	@Override
	public void Recharcher() {
		// TODO Auto-generated method stub
		
	}

}
