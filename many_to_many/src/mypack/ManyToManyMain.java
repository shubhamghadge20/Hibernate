package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class ManyToManyMain {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session= factory.openSession();
		Transaction t=session.beginTransaction();

		Emp e1=new Emp();
		e1.setEid(103);
		e1.setEname("Raghav");
		
		Emp e2=new Emp();
		e2.setEid(104);
		e2.setEname("Shreyashi");
		
		
		Project p1=new Project();
		p1.setPid(12);
		p1.setProj_name("Emp Mgt");
		
		
		Project p2=new Project();
		p2.setPid(23);
		p2.setProj_name("Online Exam");
		
		
		List <Emp>l1=new ArrayList<Emp>();
		l1.add(e1);
		l1.add(e2);
		
		List<Project>l2=new ArrayList<Project>();
		l2.add(p1);
		l2.add(p2);
		
	
		e1.setProjects(l2);
		e2.setProjects(l2);
		p2.setEmps(l1);
		p1.setEmps(l1);
		
		session.save(e1);
		session.save(e2);
		
		session.save(p1);
		session.save(p2);
		t.commit();
		session.close();
		System.out.println("Done..");
		
	}

}