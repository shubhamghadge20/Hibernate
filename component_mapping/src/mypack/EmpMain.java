package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {
	Configuration c=new Configuration();
	c.configure("hibernate.cfg.xml");
	SessionFactory factory=c.buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	Address a=new Address();
	a.setCity("Pune");
	a.setState("Maharashtra");
	a.setCountry("India");
	
	Employee e=new Employee();
	e.setEname("Aman");
	e.setEaddress(a);
	
	session.save(e);
	t.commit();
	session.close();
	System.out.println("Done");
}
}