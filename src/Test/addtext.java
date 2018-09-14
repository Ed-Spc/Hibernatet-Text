package Test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.internal.StandardServiceRegistryImpl;
import org.junit.Test;

import hibernate.text.Book;

/**
 * 方法2 
 * 
 * 建表和添加数据
 * 
 * 
 * */


public class addtext {
	
	@Test	//使用session添加数据
	public void add() {
		
		// 1.加载加载当前项目的cfg配置文件
		Configuration cfg = new Configuration().configure();
		
		//2.创建SessionFactory 
		ServiceRegistry serviceRegistry =
				new ServiceRegistryBuilder().applySettings(cfg.getProperties())
				.buildServiceRegistry();
			
		
		SessionFactory sessionFactory=cfg.buildSessionFactory(serviceRegistry);
		
		//3.创建session
		Session session =sessionFactory.openSession();
		
		//4.添加对象
		Book book =new Book("西游记","野外、人兽、有马", "人民出版社", "罗贯中");
		session.save(book);
		
		//hibernate默认不提交事务
		session.beginTransaction().commit();
	}
}
