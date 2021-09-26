package first;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class app
{
	public static void main(String[]args)
	{
		System.out.println("started");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
	
		SessionFactory Factory=cfg.buildSessionFactory();
		simple  sm=new simple();
		sm.setId(1);
		sm.setName("Anjali");
		sm.setCity("Solapur");
		System.out.println(sm);
		
		
		Session session= Factory.openSession();
		session.beginTransaction();
		session.save(sm);
		session.getTransaction().commit();
		session.close();
		
	}

}
