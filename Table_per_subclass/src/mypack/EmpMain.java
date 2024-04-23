package mypack;
//Hibernate Inheritance - Table per concrte class
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session= factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e=new Employee();
		e.setEname("Shree");
		
		Regular_Emp re=new Regular_Emp();
		re.setEname("Raj");
		re.setSalary(20000);
		re.setBonus(5000);
		
		Contract_Emp ce=new Contract_Emp();
		ce.setEname("Ram");
		ce.setPay_per_hour(2000);
		ce.setContract_duration(3);
		
		session.persist(e);
		session.persist(re);
		session.persist(ce);
		t.commit();
		session.close();
		System.out.println("Commit");
	


	}

}