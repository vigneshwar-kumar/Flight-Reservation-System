import jdk.swing.interop.SwingInterOpUtils;

import java.util.Objects;
import java.util.Random;

public class TicketConfirmation {
    String BookingConfirmation;
    String BookingConfirmationAck;
    int Seat;
    public TicketConfirmation(String Bc) {
        if (Objects.equals(Bc, "Y")) {
            this.BookingConfirmationAck = Bc;
            System.out.println("Booking Initiated : ");
            Random ran = new Random();
            Seat = ran.nextInt(50);
            BookingConfirmation = "Confirmed";
        }
    }

    public static class RandomString extends TicketConfirmation {

        public RandomString(String Bc) {
            super(Bc);
        }

        static String PNR(int lenPnrNumber) {
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789";
            StringBuilder sb = new StringBuilder(lenPnrNumber);

            for (int i = 0; i < lenPnrNumber; i++) {
                int index
                        = (int) (AlphaNumericString.length()
                        * Math.random());
                sb.append(AlphaNumericString
                        .charAt(index));
            }
            return sb.toString();
        }
    }

    public static class RandomStringForSeat extends TicketConfirmation{
        public RandomStringForSeat(String Bc) {
            super(Bc);
        }

        static String seatAllocation(int lenSeat){
            lenSeat = lenSeat/2;
            Random r = new Random();
            String[] AlphaString = {"A", "B", "C", "D", "E", "F"};
            String[] NumString={"1", "2", "3", "4", "5", "6"};
            StringBuilder sb = new StringBuilder(lenSeat);

            for (int i = 0; i < lenSeat; i++) {
                int letter = r.nextInt(AlphaString.length);
                int randomNumber=r.nextInt(NumString.length);
                sb.append(NumString[randomNumber]).append(AlphaString[letter]);
            }
            return sb.toString();
        }
    }
}
