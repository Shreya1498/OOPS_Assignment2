package assignment4Prob1;
public class Customer {
	public String customerName;
	Address ad;
	public Customer() {
		super();
	}
	public Customer(String customerName, Address ad) {
		super();
		this.customerName = customerName;
		this.ad = ad;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public void getCustomerDetails() {
		System.out.println("Customer:"+" "+customerName);
		System.out.println("Residential Address: "+ad.getStreetName()+" "
		+ad.getCity());
		
	}
}