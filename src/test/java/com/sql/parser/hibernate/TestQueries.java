package com.sql.parser.hibernate;

import com.sql.parser.User;
import org.hibernate.Session;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.Date;

public class TestQueries
{
    public static void main(String[] args) {
        int userId = 2;
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setUserId(userId);
        user.setUsername("Akshay");
        user.setCreatedBy("Cypress");
        user.setCreatedDate(new Date());

        session.save(user);
        session.getTransaction().commit();

    }

    @Test
    public void testQuery()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ManageQuery manageQuery = new ManageQuery();
        session.beginTransaction();
        manageQuery.addQuery("show tables", "ankit", new Timestamp(new Date().getTime()), "database");
        session.close();
    }
}
