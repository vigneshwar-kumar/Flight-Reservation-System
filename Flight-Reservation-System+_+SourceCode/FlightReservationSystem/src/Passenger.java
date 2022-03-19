import java.util.ArrayList;

public class Passenger {
    String Username,Email,City,State,Country;
    long Contact;
    ArrayList<String> PassengerDetails = new ArrayList<String>();
    public Passenger(String name, long phone, String email, String city, String state, String country){
        this.Username = name;
        this.Contact = phone;
        this.Email = email;
        this.City = city;
        this.State = state;
        this.Country = country;
    }

    void PrintPassengerDetails(){
        PassengerDetails.add(Username);
        PassengerDetails.add(String.valueOf(Contact));
        PassengerDetails.add(Email);
        PassengerDetails.add(City);
        PassengerDetails.add(State);
        PassengerDetails.add(Country);
        System.out.print("Passenger Detail Updated Successful : ");
        System.out.println(PassengerDetails);
    }

}
