package com.ttn.util;

import com.ttn.entity.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    static {
        try {
            loadSessionFactory();
        } catch (Exception e) {
            System.err.println("Exception while initializing hibernate util.. ");
            e.printStackTrace();
        }
    }

    public static void loadSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Person.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession() throws HibernateException {
        Session session = null;
        try {
            session = sessionFactory.openSession();
        } catch (Throwable t) {
            System.err.println("Exception while getting session.. ");
            t.printStackTrace();
        }
        if (session == null) {
            System.err.println("session is discovered null");
        }
        return session;
    }
}
