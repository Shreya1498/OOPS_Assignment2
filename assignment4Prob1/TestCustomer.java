package assignment4Prob1;

public class TestCustomer {

	public static void main(String[] args) {

		Customer customer1=new Customer(); //creating a default constructor
		customer1.setCustomerName("Shreya"); //using setter with default constructor object
		Address address=new Address("Silver Orchards","Dharwad"); // using parameterized constructor

		System.out.println(address.getStreetName()); //using getters
		System.out.println(address.getCity());
		System.out.println(customer1.getCustomerName());

		address.getAddressDetails(); //calling method

		Customer customer2=new Customer("Shruti",address);
		System.out.println(customer2.getCustomerName());
		//System.out.println(customer2.getAd());

		customer2.getCustomerDetails();// calling customer details method

		customer2.setCustomerName("Shreya Adhallikar");
		System.out.println(customer2.getCustomerName());









	}

}

