package org.example.config;

import org.example.model.entity.Member;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private static Configuration configuration = new Configuration();

    public static SessionFactory getSessionFactory(){
        if (null == sessionFactory){
            configuration.configure();
            configuration.addAnnotatedClass(Member.class);
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }


}
