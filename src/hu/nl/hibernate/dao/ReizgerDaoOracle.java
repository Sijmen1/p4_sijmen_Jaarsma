package hu.nl.hibernate.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import hu.nl.hibernate.pojo.Reiziger;

public class ReizgerDaoOracle extends OracleHibernateBaseDao implements ReizigerDaoImpl {
	//made with help of https://www.tutorialspoint.com/hibernate/
	@Override
	public boolean saveReiziger(Reiziger r) {
		boolean b = false;
		try (SessionFactory factory = getFactory()) {

			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			//this function saves a new reiziger
			session.save(r);
			t.commit();
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
			b = false;
		}
		return b;
	}

	@Override
	public boolean updateReiziger(Reiziger r) {
		// TODO Auto-generated method stub

		try (SessionFactory factory = getFactory()) {
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			//this function updates the reiziger that is inserted.
			session.update(r);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public boolean deleteReiziger(Reiziger r) {
		// TODO Auto-generated method stub

		try (SessionFactory factory = getFactory()) {
			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			//this function deletes the object that is the same as the one loaded in the pojo
			session.delete(r);
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public Reiziger getReizigerbyID(int id) {
		Reiziger r=null;
		try(SessionFactory factory = getFactory()){
		Session session = factory.openSession();
		//this function loads a reiziger by looking for it's id
		r = session.get(Reiziger.class, id);}
		catch(Exception e) {
			e.printStackTrace();
		}
		return r;
	}

}
