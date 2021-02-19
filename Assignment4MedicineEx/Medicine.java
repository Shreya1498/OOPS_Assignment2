package Assignment4MedicineEx;
import java.sql.Date;

public abstract class Medicine {
	int price;
	int expiryDate;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}
	void getDetails() {
		System.out.println("The Price of the medicine is "+price);
		System.out.println("The Expiry Date of the medicine is " +expiryDate);
	}
	abstract void displayLabel();
	
	

}