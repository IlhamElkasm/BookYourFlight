package Dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration config = new Configuration().configure("hibernate.cfg.xml");
            return config.buildSessionFactory(new StandardServiceRegistryBuilder()
            		.applySettings(config.getProperties()).build());
        } catch (Throwable ex) {
            System.err.println("Initialisation de la SessionFactory a échoué : " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
