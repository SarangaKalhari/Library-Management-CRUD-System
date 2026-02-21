package org.example.repository;

import org.example.config.HibernateUtil;
import org.example.model.entity.Member;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MemberRepository {

    public void addMember(Member member){


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.persist(member);
        tx.commit();

        session.close();
    }

    public void updateMember(Member member){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.merge(member);
        tx.commit();

        session.close();
    }

    public void deleteMember(String id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Member member = session.find(Member.class, id);

        if(member != null){
            session.remove(member);

        }

        tx.commit();
        session.close();


    }


    public Member searchMember(String id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        return session.find(Member.class, id);
    }
}
