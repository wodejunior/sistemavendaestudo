package com.wjcs.sistemavenda;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
   
   private static final SessionFactory session = buildSessionFactory();
   
   private static SessionFactory buildSessionFactory() {
      try {
         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         return cfg.buildSessionFactory();
      } catch (Throwable e) {
         System.out.println("Não foi possivel conectar ao Bando de Dados!\n "+ e);
         throw new ExceptionInitializerError();
      }
   }
   
   public static SessionFactory getSession() {
      return session;
   }
}
