package HButils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HButils {
	private static SessionFactory factory=null;
	private static Session session=null;
	
	static{
		// 1.加载加载当前项目的cfg配置文件
				Configuration cfg = new Configuration().configure();
		//2.创建SessionFactory 
			ServiceRegistry serviceRegistry =
						new ServiceRegistryBuilder().applySettings(cfg.getProperties())
						.buildServiceRegistry();
			
			factory=cfg.buildSessionFactory(serviceRegistry);
	}
	
	public static Session getSession() {
		//如果已经有一个session就再开一个
		if (session!=null && session.isOpen()) {
			return session;
		}
		session=factory.openSession();
		return session ;
	}
}
