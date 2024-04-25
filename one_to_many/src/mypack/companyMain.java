package mypack;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class companyMain {
	public static void main(String args[])
	{
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
			
		Employee e=new Employee();
		e.setName("Raj");
		e.setSalary(40000);
		
		Employee e1=new Employee();
		e1.setName("Rahul");
		e1.setSalary(45000);
		
		Employee e2=new Employee();
		e2.setName("Aarti");
		e2.setSalary(45000);
		
		Employee e3=new Employee();
		e3.setName("Raghav");
		e3.setSalary(45000);
		
		List<Employee> li1=new ArrayList<Employee>();
		li1.add(e);li1.add(e1);
		
		Department d1=new Department();
		d1.setDname("Sales");
		d1.setEmp(li1);
		
		
		List<Employee> li2=new ArrayList<Employee>();
		li2.add(e2);li2.add(e3);
		
		Department d2=new Department();
		d2.setDname("IT");
		d2.setEmp(li2);
		
		s.save(d1);
		s.save(d2);
		
		t.commit();
		s.close();
		
		System.out.println("Done");
		
	}

}