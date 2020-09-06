package Interfaces;

public class Book {
private String bname, author;
	
	private float price;
	
	public Book(String bname, String author, float price)
	{
		
		this.bname=bname;
		this.author=author;
		this.price=price;
		


	}

	public String getName() {
		return bname;
	}


	public String getAuthor() {
		return author;
	}



	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}

