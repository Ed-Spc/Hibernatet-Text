package Test;



import java.util.List;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dao.bookDao;
import HButils.HButils;
import hibernate.text.Book;

/**
 * 方法2 
 * 
 * 数据增删改查
 * 
 * 
 * */


public class addtext {
	private Session Session=null;
	
	@Before		//测试前执行
	public void before() {
		Session=HButils.getSession(); //hibernate默认不提交事务
	}
	
	@After		//测试后执行
	public void after() {
		Session.beginTransaction().commit();
	}
	
	
	@Test	
	public void add() {			
		Book book =new Book("西游记","野外、人兽、有马", "人民出版社", "罗贯中");
		//Session.save(book);		
	}
	
	@Test
	public void delete() {
		Book book =new Book();
		book.setId(1L);
		//Session.delete(book);  //只能通过ID删除
		
	}
	@Test
	public void select() {
		
	//	Book book=(Book) Session.get(Book.class, 1L);
	//	Book book=(Book) Session.load(Book.class, 1L);  load懒加载
		
	
	}
	
	@Test
	public void update() {
		
	//	Book book=(Book) Session.get(Book.class, 1L);
	//Session.update(book);
	}
	@Test
	public void savaORupdate() {
		Book book=new Book("水浒传","108和3","不知名出版社","是来按");		
		
		//如果book id为空则为添加 如果不为空就是修改
		// Session.saveOrUpdate(book);
		
	}
	@Test
	public void deleteByTitle() {
		bookDao bDao=new bookDao();
		Book book=bDao.findById(Session, 2L);
		

	}
	
}
