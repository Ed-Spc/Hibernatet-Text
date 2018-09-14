package hibernate.text;

public class Book {
	private Long id;
	private String title;
	private String description;
	
	private String publisher;
	
	private String author;

	
	
	public Book() {
		
	}
	


	public Book(String title, String description, String publisher, String author) {
		super();
		this.title = title;
		this.description = description;
		this.publisher = publisher;
		this.author = author;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", publisher=" + publisher
				+ ", author=" + author + "]";
	}
	

	

}
