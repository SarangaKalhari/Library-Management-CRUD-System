package org.example.repository;

import org.example.config.HibernateUtil;
import org.example.model.entity.Book;
import org.example.model.entity.Member;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookRepository {


    public void addBook(Book book){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(book);
        tx.commit();

        session.close();
    }

    public void updateBook(Book book){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.merge(book);
        tx.commit();

        session.close();
    }

    public void deleteBook(String id){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.remove(session.find(Book.class, id));

        tx.commit();

    }

    public Book searchBook(String id){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

        return session.find(Book.class, id);
    }
}
