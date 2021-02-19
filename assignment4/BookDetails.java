package assignment4;

import java.util.Scanner;

class Book{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String Title) {
		this.title = Title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}

class EngineeringBook extends Book{
	private String category;
	
	public void print(Book b) {
		
	System.out.println(b.getBookNo());
	System.out.println(b.getTitle());
	System.out.println(b.getAuthor());
	System.out.println(b.getPrice());
	
	}
}


public class BookDetails {

	public static void main(String[] args) {
		Book b=new Book();
		EngineeringBook b1=new EngineeringBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bookNo");
		b.setBookNo(sc.nextInt());
		System.out.println("Enter Book title");
		b.setTitle(sc.next());
		System.out.println("Enter Author");
		b.setAuthor(sc.next());
		System.out.println("Enter Price");
		b.setPrice(sc.nextFloat());
		
		b1.print(b);

		

	}

}
