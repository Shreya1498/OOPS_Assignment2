package assignment4;

import java.util.*;

class Address{
    private String addressLine;
    private String city;
    public Address() {}

    public String getAddressLine() {
        return this.addressLine;
    }
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public Address(String add, String city) {
        this.addressLine = add;
        this.city = city;
    }

    public String getAddressDetails(Customer c)
    {
        
       String addr1 = getAddressLine();
       String addr2 = getCity();

       String addr = getAddressLine()+","+getCity();
        c.setResidentialAddress(addr);
        return String.valueOf(c.getResidentialAddress());
    }
}
class Customer{

    private String customerName;
    private String residentialAddress;
    public Customer()
    {

    }
   

    public Customer(String cust, String resident)
    {
        this.customerName = cust;
        this.residentialAddress = resident;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getResidentialAddress() {
        return this.residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getCustomerDetails(Address a)
    {

        Customer c = new Customer();

        String str1 = "Customer: "+getCustomerName();
        String str2 = "Residential Address: "+ a.getAddressDetails(c);

        return str1+"\n"+str2;
    }

}




public class TestCustomer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO Auto-generated method stub


        System.out.println("Enter Name");
        String name = sc.nextLine();


        System.out.println("Enter the AddressLine");
        String addr = sc.nextLine();


        Customer c = new Customer();
        c.setCustomerName(name);

        System.out.println("Enter the City");

        String city = sc.nextLine();

        Address a = new Address();
        a.setAddressLine(addr);
        a.setCity(city);

        System.out.println(c.getCustomerDetails(a));


    }

}
