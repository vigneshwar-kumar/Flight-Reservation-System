public class GenerateFlightNumber extends Flight {
    public GenerateFlightNumber(String O1, String D1) {
        super(O1, D1);
    }

    static String FlightNumber(int lenFlightNumber) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789";
        StringBuilder sb = new StringBuilder(lenFlightNumber);

        for (int i = 0; i < lenFlightNumber; i++) {
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }

}
