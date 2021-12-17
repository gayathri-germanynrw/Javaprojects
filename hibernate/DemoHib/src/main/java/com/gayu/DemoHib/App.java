package com.gayu.DemoHib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate small project which is create class as Table and objects as Rows in DB
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Alien obj=new Alien();
    	obj.setAid(53);
    	obj.setAname("god");
    	obj.setColor("Red");
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    
    	SessionFactory sessFact=con.buildSessionFactory(reg);
    	
    	Session session=sessFact.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	session.save(obj);
    	tx.commit();
    }
}
