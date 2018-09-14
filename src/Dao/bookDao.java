package Dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.text.Book;

public class bookDao {
	public int deleteByTitle(String title,Session session) {
	
	//	String sql ="delete from books where title =?";
			
		//String hql ="delete from books where title = ?";
		String hql ="delete from books where title = :title";
	
		Query query=session.createSQLQuery(hql);
		
		//query.setString(0, title);		
		query.setParameter("title", title);
		
	// 模糊查询	query.setParameter("title", "%"+title+"%");
				
		return query.executeUpdate();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Book> selectAll(Session session){
		
		String hql="select * from books";
	
		Query query = session.createSQLQuery(hql);
/*		分页  
 * 
		query.setFirstResult(1)   第几条数据开始
			 .setMaxResults(5)		一次查询几条
			 .list();			打包
	*/	
		return query.list();   //返回多个数据的时候自动打包添加到集合
	
	}
	
	public Book findById(Session session,long id) {
		
		String hql="select * from books where id= :id";
		
	Query query=session.createSQLQuery(hql);
		
		
		query.setParameter("id", id);
		
		
		return (Book) query.uniqueResult();  //返回单个数据的时候
		
	}
	
	
	
}
