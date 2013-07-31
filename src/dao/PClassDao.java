package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import pojo.PClass;
import pojo.Person;
import util.HibernateSessionFactory;

public class PClassDao {
	
	public void getClassInfo(){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from PClass where id=:id");
		query.setLong("id", 1l);
		PClass pClass = (PClass)query.uniqueResult();
		for (Person person : pClass.getPersons()) {
			System.out.println(person.getId() + ":" + person.getName()+":"+person.getpClass().getCname());
		}
		HibernateSessionFactory.closeSession();
	}

}
