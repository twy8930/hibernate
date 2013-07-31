package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.PNum;
import pojo.Person;
import util.HibernateSessionFactory;

public class PNumDao {

	/**
	 * 添加
	 */
	public void addPNum() {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = session.beginTransaction();

		Person person = new Person();
		person.setName("一对一单主键关联单向");
		person.setAge(18);
		person.setCid(1);
		PNum pNum = new PNum();
		pNum.setDetail("测试一对一单主键关联单向");
		pNum.setPerson(person);

		session.save(pNum);
		trans.commit();
		HibernateSessionFactory.closeSession();
	}

	/**
	 * 删除
	 */
	public void deletePNum() {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = session.beginTransaction();
		
		PNum pNum=new PNum();
		pNum.setId(5l);
		session.delete(pNum);//为什么不行？
		
//		Query query = session.createQuery("from PNum where id=:id");
//		query.setParameter("id", 5l);
//		PNum pNum=(PNum)query.uniqueResult();
//		session.delete(pNum);
		
		trans.commit();
		HibernateSessionFactory.closeSession();
	}

	/**
	 * 查询
	 */
	public void getPNum() {
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from PNum where id=:id");
		query.setParameter("id", 5l);
		PNum pnum=(PNum)query.uniqueResult();
		System.out.println(pnum.getId()+":"+pnum.getDetail());
		System.out.println(pnum.getPerson().getName());
	}

}
