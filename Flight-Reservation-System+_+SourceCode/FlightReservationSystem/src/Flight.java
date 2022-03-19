import java.util.*;

public class Flight {
    String SourceAirport, DestinationAirport;
    int FlightCount,TicketCount,TicketClass;
    String answer, ticketClass;
    ArrayList<String> FlightDetail = new ArrayList<String>();
    Scanner getInput = new Scanner(System.in);
    void PrintDetails(){
        FlightDetail.add(SourceAirport);
        FlightDetail.add(DestinationAirport);
        FlightDetail.add(String.valueOf(FlightCount));
        FlightDetail.add(String.valueOf(TicketCount));
        System.out.println(FlightDetail);
    }

    public Flight(String O1, String D1) {
        this.SourceAirport = O1;
        this.DestinationAirport = D1;
    }

}

class FlightAvailability extends Flight{

    public FlightAvailability(String O1, String D1, int FC) {
        super(O1, D1);
        this.FlightCount = FC;
    }
}

class TicketAvailability extends FlightAvailability{
    public TicketAvailability(String O1, String D1, int FC, int TC) {
        super(O1, D1, FC);
        this.TicketCount = TC;
    }
}

class ConfirmationBooking extends TicketAvailability{
    public ConfirmationBooking(String O1, String D1, int FC, int TC) {
        super(O1, D1, FC, TC);

        if (TC != 0){
            System.out.print("You like to book ticket [Y/N] :");
            answer = getInput.next().toUpperCase();
            if (Objects.equals(answer, "Y")){
                System.out.println("Booking Initiated :");
                System.out.print("Choose Your Ticket [Regular / Tourist]: ");
                ticketClass = getInput.next().toUpperCase();

                if (Objects.equals(ticketClass,"REGULAR"))
                {
                    TicketClass = 1;
                }
                else if (Objects.equals(ticketClass,"TOURIST")){
                    TicketClass = 2;
                }
            }
            else if (Objects.equals(answer,"N"))
            {
                System.out.println("Booking Cancelled");
            }
            else {
                System.out.println("Invalid data");
            }
        }
        else {
            System.out.println("No Tickets...");
        }

    }
}

