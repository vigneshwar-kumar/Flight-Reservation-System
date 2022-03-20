import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class TicketType {
    int TicketChoice;
    String choice;
    Scanner getInput = new Scanner(System.in);
    ArrayList<String> Addon = new ArrayList<String>();
    public TicketType(int TicketType){
        this.TicketChoice = TicketType;

        if (TicketType == 1){TicketRegular();}
        else if (TicketType == 2){TicketTourist();}
    }

    protected void TicketRegular(){
        String item;
        System.out.print("You Like to Add Special Service [Y/N] : ");
        choice = getInput.next().toUpperCase();
        if (Objects.equals(choice,"Y")){

        System.out.println("Please Choose Your Addon [Food / Water / Snacks] : ");
        while(Objects.equals(choice,"Y"))
        {
            System.out.print("Enter Your Choice : ");
            item = getInput.next();
            Addon.add(item);
            System.out.print("You Want to more [Y/N] : ");
            choice = getInput.next().toUpperCase();
        }
        }
        else {
            choice = "NIL";
        }

            if (Addon.isEmpty())
            {
                System.out.println("Special Service Skipped..");
            }
            else {
                choice = "YES";
                System.out.print("Item Added in Service : ");
                System.out.println(Addon);
            }

        }


    protected void TicketTourist(){}

}
