package com.epam.ryazan.taxi.dba;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.epam.ryazan.taxi.dba.pojo.Role;
import com.epam.ryazan.taxi.dba.util.HibernateSessionFactory;

public class FirstTry {

   public static void main(String[] args) {
      SessionFactory factory = HibernateSessionFactory.getSessionFactory();
      Session session = factory.openSession();
      Role role = session.get(Role.class, 3);
      System.err.println(role);
      factory.close();
      session.close();
   }

}
