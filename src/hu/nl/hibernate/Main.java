package hu.nl.hibernate;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hu.nl.hibernate.dao.ReizgerDaoOracle;
import hu.nl.hibernate.dao.ReizigerDaoImpl;
import hu.nl.hibernate.pojo.Reiziger;

public class Main {
  //private static SessionFactory factory;
  public static void main(String[] args) throws SQLException, ParseException {
	  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	  java.util.Date d = sdf.parse("09-09-1999");
	  java.sql.Date d1 = new java.sql.Date(d.getTime());

      Reiziger reiziger = new Reiziger(0,"b","a","p5",d1);
      ReizigerDaoImpl dao = new ReizgerDaoOracle();
      dao.saveReiziger(reiziger);
      Reiziger reiziger1 = dao.getReizigerbyID(5);
     
      System.out.println(reiziger1);
      reiziger1.setAchternaam("alto");
      System.out.println(dao.updateReiziger(reiziger1));
      Reiziger reiziger2 = dao.getReizigerbyID(37);
      System.out.println(dao.deleteReiziger(reiziger2));
  }
}
