import jdk.swing.interop.SwingInterOpUtils;

import javax.management.Descriptor;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Source {

    public static void main(String[] args) {
        String SourceAirport, DestinationAirport;
        int FlightCount = 1, TicketCount;
        String Username = null, Email = null, City = null, State = null, Country = null;
        long Contact = 0;
        Date today = new Date();
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));


        Scanner getInput = new Scanner(System.in);
        System.out.println("Welcome to Flight Reservation System");
        System.out.print("Enter Origin : ");
        SourceAirport = getInput.next();
        System.out.print("Enter Destination : ");
        DestinationAirport = getInput.next();
        System.out.println("Available Flight For Tomorrow : " + FlightCount);

        Random ran = new Random();
        TicketCount = ran.nextInt(50);

        System.out.println("Ticket Availability : " + TicketCount);

        ConfirmationBooking Obj1 = new ConfirmationBooking(SourceAirport, DestinationAirport, FlightCount, TicketCount);
        Passenger Obj2 = null;
        if (Objects.equals(Obj1.answer, "Y")) {
            System.out.println("Register Your Details To Book Ticket Further :");
            System.out.print("Enter Name : ");
                try
                {
                    Username = getInput.next();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.print("Enter Contact Number : ");
                try
                {
                    Contact = getInput.nextLong();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.print("Enter Email ID : ");
                try
                {
                    Email = getInput.next();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.print("Enter City : ");
                try
                {
                    City = getInput.next();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.print("Enter State : ");
                try
                {
                    State = getInput.next();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                System.out.print("Enter Country : ");
                try
                {
                    Country = getInput.next();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }

            Obj2 = new Passenger(Username, Contact, Email, City, State, Country);
            Obj2.PrintPassengerDetails();


        } else {
            System.out.println("Thanks for choosing us.. ComeBack again!");
        }

        TicketType Obj3 = new TicketType(Obj1.TicketClass);


        System.out.println("Your Booking Details Below : ");
        System.out.println("Origin : " + Obj1.SourceAirport + ", Destination : " + Obj1.DestinationAirport + ", On : " + tomorrow + ", Class : " + Obj1.ticketClass);
        System.out.print("Confirm to Book [Y/N]: ");
        String BookingConfirmation = getInput.next().toUpperCase();
        TicketConfirmation Obj4 = new TicketConfirmation(BookingConfirmation);
        int lenPnrNumber = 8, lenSeat = 2, lenFlightNumber = 6;
        if (Objects.equals(BookingConfirmation, "Y")) {
            assert Obj2 != null;

            System.out.println("---------------------------");
            System.out.printf("Name : " +Obj2.Username );
            System.out.println();
            System.out.println("---------------------------");

            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%10s %15s %15s %15s %10s %20s %15s %30s", "PNR", "FLIGHT", "ORIGIN", "DESTINATION", "SEAT", "SPECIAL SERVICE","STATUS", "DATETIME");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.format("%10s %15s %15s %15s %10s %20s %15s %30s",TicketConfirmation.RandomString.PNR(lenPnrNumber),GenerateFlightNumber.FlightNumber(lenFlightNumber),Obj1.SourceAirport,Obj1.DestinationAirport,TicketConfirmation.RandomStringForSeat.seatAllocation(lenSeat),Obj3.choice,Obj4.BookingConfirmation,tomorrow);


        }


    }
}
