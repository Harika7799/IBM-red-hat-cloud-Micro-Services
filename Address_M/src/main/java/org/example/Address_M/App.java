package org.example.Address_M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
/**
 * Hello world!
 *
 */
import javax.persistence.Query;

import org.example.demo.Addres;
import org.example.demo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        Logger logger =Logger.getLogger("org.example.Address_M.App.clas");
        try {
        	SessionFactory sf =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(Addres.class).buildSessionFactory();
        	Session session =sf.getCurrentSession();
        	User user =new User();
        	Addres address =new Addres();
        	user.setU_Name("Honey Rai");
        	address.setStreet("losvegas");
        	address.setCity("US");
        	user.setA_Details(address);
        	address.setU_Details(user);
        	session.getTransaction().begin();
        	session.persist(address);
        	session.persist(user);
        	session.getTransaction().commit();
        	logger.info("Done...");
        	
        }catch(Exception e) {
        	e.printStackTrace();
        	
        }
    }
}
