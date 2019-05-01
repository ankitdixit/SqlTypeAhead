package com.sql.parser.hibernate;

import com.sql.parser.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Timestamp;

import static com.sql.parser.hibernate.HibernateUtil.getSessionFactory;

public class ManageQuery
{
    private static SessionFactory factory;

    public ManageQuery()
    {
        factory = getSessionFactory();
    }

    /* Method to CREATE an employee in the database */
    public Integer addQuery(String queryText, String user, Timestamp timestamp, String database){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer queryId = null;

        try {
            tx = session.beginTransaction();
            Query query = new Query() ;
            query.setDatabase(database);
            query.setTimeStamp(timestamp);
            query.setUser(user);
            query.setQueryText(queryText);
            queryId = (Integer) session.save(query);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return queryId;
    }
}
