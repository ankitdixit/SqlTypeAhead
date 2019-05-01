package com.sql.parser.hibernate;

import com.sql.parser.User;
import org.hibernate.Session;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setUserId(1);
        user.setUsername("Mukesh");
        user.setCreatedBy("Google");
        user.setCreatedDate(new Date());

        session.save(user);
        session.getTransaction().commit();

    }

}
