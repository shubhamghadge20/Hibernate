package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudMain {

    public static void main(String[] args) {
        
        Configuration c = new Configuration();
        c.configure("hibernate.cfg.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Student student = new Student(); // Changed from "mypack.student student = new mypack.student();"
        student.setSname("shubh");
        student.setAddress("Satara");
        
        s.save(student);
        t.commit();
        s.close();
        System.out.print("Done");
    }
}
