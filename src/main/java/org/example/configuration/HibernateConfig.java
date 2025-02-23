package org.example.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    public static SessionFactory getSessionFactory(){return sessionFactory;}

    private static final SessionFactory sessionFactory= build();
    private static SessionFactory build(){

        try {
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        }catch(ExceptionInInitializerError eiie){
            throw new ExceptionInInitializerError(eiie);
        }

    }
}
