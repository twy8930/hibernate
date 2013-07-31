package servlet;

import util.HibernateSessionFactory;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;

import pojo.PNum;
import pojo.Person;

import dao.PClassDao;
import dao.PNumDao;
import dao.PersonDao;

/**
 * 测试servlet
 * @author twy
 *
 */
public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = -43056013192749039L;

	public TestServlet() {
		super();
	}
	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		//添加
//		Person person=new Person();
//        person.setName("小周");
//        person.setAge(18);
//		new PersonDao().addPerson(person);
		
		//删除
//		int id=3;
//		new PersonDao().deletePerson(id);
		
		//更新
//		Person person=new Person();
//        person.setId(2);
//		person.setName("小wang");
//        person.setAge(20);
//        new PersonDao().updatePerson(person);
		
//		new PersonDao().getPersons();
		
		new PClassDao().getClassInfo();
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
	}

}
