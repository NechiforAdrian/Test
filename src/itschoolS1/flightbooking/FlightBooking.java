package itschoolS1.flightbooking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlightBooking {
    public static void main(String[] args) {

        Customer customerAlex = new Customer();
        customerAlex.setFirstName("Alexandru");
        customerAlex.setLastName("Alex");
        customerAlex.setAddress("Iasi");
        customerAlex.setEmail("alex@gmail.com");
        System.out.println("First name: " + customerAlex.getFirstName());
        System.out.println("Last name: " + customerAlex.getLastName());
        System.out.println("Address: " + customerAlex.getAddress());
        System.out.println("Email: " + customerAlex.getEmail());

        System.out.println("-------------------");

        UserFlightDetails alexBoardingTicket = new UserFlightDetails();
        alexBoardingTicket.setFlightNumber(1);
        alexBoardingTicket.setDestination("Austria");
        alexBoardingTicket.setBoardingTime(LocalDateTime.now());
        System.out.println("Flight number: " + alexBoardingTicket.getFlightNumber());
        System.out.println("Destination: " + alexBoardingTicket.getDestination());
        System.out.println("Date/Time: " + alexBoardingTicket.getBoardingTime());


        System.out.println("########################################################");

        Customer customerAdrian = new Customer();
        customerAdrian.setFirstName("Adrian");
        customerAdrian.setLastName("Adi");
        customerAdrian.setAddress("Timisoara");
        customerAdrian.setEmail("adi@gmail.com");
        System.out.println("First name: " + customerAdrian.getFirstName());
        System.out.println("Last name: " + customerAdrian.getLastName());
        System.out.println("Address: " + customerAdrian.getAddress());
        System.out.println("Email: " + customerAdrian.getEmail());

        System.out.println("--------------------");

        UserFlightDetails adrianBoardingTicket = new UserFlightDetails();
        adrianBoardingTicket.setFlightNumber(7);
        adrianBoardingTicket.setDestination("Germany");
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("2023-02-28 18-30-22");
        System.out.println("Flight number: " + adrianBoardingTicket.getFlightNumber());
        System.out.println("Destination: " + adrianBoardingTicket.getDestination());
        System.out.println("Date/Time: " + localDateTimeNow.format(dateTimeFormatter));


    }


}


