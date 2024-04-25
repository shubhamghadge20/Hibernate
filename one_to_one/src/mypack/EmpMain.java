
package mypack;

import org.hibernate.Session;   
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {
		Configuration  c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEname("Sanket");
		e1.setEmail("sanket2002@gmail.com");

		Address a=new Address();
		a.setCity("Nagpur");
		a.setState("maharashtra");
		a.setCountry("India");
		
		//bi-directional association
				e1.setAddress(a);
				a.setEmployee(e1);
				
				session.persist(e1);
				t.commit();
				session.close();
				
				System.out.println("Inserted.");
		
		
	}

}
