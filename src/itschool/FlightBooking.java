package itschool;

import java.time.LocalDateTime;
import java.util.List;

public class FlightBooking {
    public static void main(String[] args) {

        Customer name = new Customer();
        name.setCustomerFirstName("Nechifor ");
        System.out.printf(name.getCustomerFirstName());

        Customer name1 = new Customer();
        name1.setCustomerLastName("Adrian");
        System.out.printf(name1.getCustomerLastName());

        System.out.println();

        Customer address = new Customer();
        address.setCustomerAddress("Timisoara");
        System.out.println(address.getCustomerAddress());

        Customer email = new Customer();
        email.setCustomerEmail("adrian@yahoo.com");
        System.out.println(email.getCustomerEmail());

    }

    private int flightNumber;
    private String destination;
    private LocalDateTime boardingTime;
    private List<Customer> customerList;

    public int getFlightNumber(){
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    public String getDestination(){
        return destination;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public LocalDateTime getBoardingTime(){
        return boardingTime;
    }
    public void setBoardingTime(LocalDateTime boardingTime){
        this.boardingTime = boardingTime;
    }
    public List<Customer> getCustomerList(){
        return customerList;
    }
    public void setCustomerList(List<Customer> customerList){
        this.customerList = customerList;
    }

}
class Customer{
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private String customerEmail;

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName(){
        return customerLastName;
    }
    public void setCustomerLastName(String customerLastName){
        this.customerLastName = customerLastName;
    }

    public String getCustomerAddress(){
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress){
        this.customerAddress = customerAddress;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }
}

