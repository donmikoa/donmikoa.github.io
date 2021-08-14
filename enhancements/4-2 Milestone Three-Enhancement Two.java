public class Passenger {

    // Declaring the variables to be used in the Passenger Class
    private String passengerName;
    private String passengerCruise;
    private String passengerRoomType;


    // Constructor - default
    Passenger() {
    }

    // Constructor - full
    Passenger(String pName, String pCruise, String pRoomType) {
        passengerName = pName;
        passengerCruise = pCruise;
        passengerRoomType = pRoomType; // should be BAL, OV, STE, or INT
    }

    // Accessors
    public String getPassengerName() {
        return passengerName;
    }
    // This is for getting the type of passenger cruise
    public String getPassengerCruise() {
        return passengerCruise;
    }

    // This is for getting the passenger's room type
    public String getPassengerRoomType() {
        return passengerRoomType;
    }

    // Mutators
    // This is for setting/modifying the passengers name
    public void setPassengerName(String newPassengerName) {
        passengerName = newPassengerName;
    }

    // This is for setting/modifying the passengers cruise
    public void setPassengerCruise(String newPassengerCruise) {
        passengerCruise = newPassengerCruise;
    }

    // This is for setting the passenger's room type
    public void setPassengerRoomType(String newPassengerRoomType) {
        passengerRoomType = newPassengerRoomType;
    }

    // print method
    public void printPassenger() {
        int spaceCount;
        String spaces = "";

        // This is to identify the space need for the passengerName string
        spaceCount = 20 - passengerName.length();

        // This is used for determining the spaces which will be between passengerName and passengerCruise
        for (int i = 1; i <= spaceCount; i++) {
            spaces = spaces + " ";
        }

        // This prints out the passengerName, passengerCruise and passengerRoomType
        System.out.println(passengerName + spaces + passengerCruise + spaces +
                passengerRoomType);
    }

    public void welcomePassenger(){
        System.out.println("Hi" + " " + passengerName + ". " + "You are welcome to Michael's Cruise Ship");
    }

    // method added to print passenger's name vice memory address
    @Override
    public String toString() {
        return passengerName;
    }

}
