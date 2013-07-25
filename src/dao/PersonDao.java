package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Person;
import util.HibernateSessionFactory;

public class PersonDao {

	/**
	 * 添加
	 * 
	 * @param person
	 * @return boolean
	 */
	public boolean addPerson(Person person) {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = session.beginTransaction();
		session.save(person);
		trans.commit();
		HibernateSessionFactory.closeSession();
		return true;
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return boolean
	 */
	public boolean deletePerson(int id) {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = session.beginTransaction();
		Person person = new Person();
		person.setId(id);
		session.delete(person);
		trans.commit();
		HibernateSessionFactory.closeSession();
		return true;
	}

	/**
	 * 
	 * @param person
	 * @return boolean
	 */
	public boolean updatePerson(Person person) {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = session.beginTransaction();

		// 这种方式，如果person的某些字段为空，会将数据库中的记录的相应字段更新为空
		session.update(person);

		// 这种方式，值更新必要的字段
		// Person updatePerson=(Person)session.get(Person.class,
		// person.getId());
		// updatePerson.setName(person.getName());
		// session.save(updatePerson);

		trans.commit();
		HibernateSessionFactory.closeSession();
		return true;
	}

	/**
	 * 查询
	 * 
	 * @return List<Person>
	 */
	public List<Person> getPersons() {
		Session session = HibernateSessionFactory.getSession();
		 List list=null;

		/**
		 * Criteria c = session.createCriteria(Person.class); //过滤条件 //
		 * c.add(Restrictions.eq("name","小王")); //
		 * c.add(Restrictions.between("age", 18, 21)); //
		 * c.add(Restrictions.in("name", new String[]{"小王","小李"})); //
		 * c.add(Restrictions.like("name", "小")); //排序条件 //
		 * c.addOrder(Order.asc("age")); // c.addOrder(Order.desc("age"));
		 * //翻页条件 // c.setFirstResult(1); // c.setFetchSize(10); // List<Person>
		 * list = c.list(); // for(int i=0;i<list.size();i++){ //
		 * System.out.println(list.get(i).getId()+":"+list.get(i).getName()); //
		 * }
		 **/

		// Query query = session.createQuery("from Person");
		// List<Person> list = query.list();
		// for(Person person:list){
		// System.out.println(person.getId()+":"+person.getName());
		// }

//		Query query = session.createQuery("from Person where id=:id");
//		query.setLong("id", 2l);
//		List<Person> list = query.list();
//		for (Person person : list) {
//			System.out.println(person.getId() + ":" + person.getName());
//		}

		// 多表联查
		// Query query =
		// session.createQuery("select a.name,b.cname from Person a,PClass b where a.cid=b.id");
		// list = query.list();
		// for(int i=0;i<list.size();i++){
		// Object[] cols=(Object[])list.get(i);
		// for(int j = 0; j < cols.length; j++) {
		// System.out.print(cols[j]+" ");
		// }
		// System.out.println();
		// }

		HibernateSessionFactory.closeSession();
		return list;
	}

}
