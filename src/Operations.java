import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Operations implements Functions {

    public List<Flight> flight = new ArrayList<Flight>();
    public List<PassengerDetails> passengerDetails = new ArrayList<PassengerDetails>();
    public List<BookingLog> bookingLog = new ArrayList<BookingLog>();
    public  List<History> history = new ArrayList<History>();
    int economyClassSeat;
    int businessClassSeat ;
    @Override
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        FileManagement fm = new FileManagement();

        //Load data from file
        passengerDetails = fm.readPassengerDetailsFromFile("PassengerDetails.txt");
        bookingLog = fm.readBookingLogFromFile("BookingLog.txt");
        flight = fm.readFlightDataFromFile("Flight.txt");
       // history = fm.readHistoryFromFile("History.txt");


        int inp;
        while (true) {
            System.out.println("\n\n\n\n!!!!Welcome to the flight booking system!!!!");
            System.out.println("\nplease select from the following menu.....");
            System.out.println("\n 1. Press 1 if you are a customer." +
                    "\n 2. Press 2 if you are a Admin Person" +
                    "\n 3. Press 3 to exit");
            inp = in.nextInt();
            if (inp == 1) {
                //calling customer menu function
                CustomerMenu();

            } else if (inp == 2) {
                //Calling ADMIN MENU function
                AdminMenu();
            } else if (inp == 3) {
                //Closing the program
                System.out.println("!!!!Welcome Back Again!!!!");
                System.exit(0);
            } else {
                System.out.println("Input is not Correct!!! Try Again");
            }
        }
    }

    //Admin menus

    public void AdminMenu() {
        Scanner in = new Scanner(System.in);
        int inp = 0;

        while(inp != 12) {
            System.out.println("****Welcome Admin****");
            System.out.println("Please Select from the following menu");
            System.out.println("1. Press 1 to available flight.");//CHOOSE FLIGHT
            System.out.println("2. Press 2 to add a flight.");
            System.out.println("3. Press 3 to check all flights:");
            System.out.println("4. Press 4 to check all customer.");
            System.out.println("5. Press 5 to see all booking in booking log.");
            System.out.println("6. Press 6 to delete a passenger");
            System.out.println("8. Press 8 to see available booking.");
            System.out.println("9. Press 9 to check all register customers");
            System.out.println("10. Press 10 to delete a flight.");
            System.out.println("11. Press 11 to delete all flight");
            System.out.println("12. Press 12 to exit.");

            inp = in.nextInt();
            if (inp == 1) {
                //searchFlight();
            } else if (inp == 2) {
                addFlight();
            } else if (inp == 3) {
                checkAllFlight();
            } else if (inp == 4) {
               showAllRegisteredPassenger();
            } else if (inp == 5) {
               showAllBooking();
            } else if (inp == 6) {
                //editFlight();
            } else if (inp == 7) {
                //editFlight();
            } else if (inp == 8) {
                //editFlight();
            } else if (inp == 9) {
                //editFlight();
            } else if (inp == 10) {
                //editFlight();
            } else if (inp == 11) {
                deleteAllFlight();
            } else if (inp == 10) {
                System.out.println("getting out from admin menu ........!!!!");
            }

        }
    }


   // adding new flight by admin
    public void addFlight() {
        Scanner in = new Scanner(System.in);
        Flight fl = new Flight();
        FileManagement fm = new FileManagement();

        String date;
        String flightNumber;
        String deptCity;
        String destCity;
        String airlines;
        int availEconomyClassSeat;
        double economyClassPrice;
        int availBusinessClassSeat;
        double businessClassPrice;

        System.out.println("Enter date of the flight");
        date = in.nextLine();
        fl.setDate(date);

        System.out.println("Enter flight number:");
        flightNumber = in.nextLine();
        fl.setFlightNumber(flightNumber);

        System.out.println("Enter City of departure:");
        deptCity = in.nextLine();
        fl.setDeptCity(deptCity);

        System.out.println("Enter City of destination:");
        destCity = in.nextLine();
        fl.setDestCity(destCity);

        System.out.println("Enter name of the Airlines");
        airlines = in.nextLine();
        fl.setAirlinesName(airlines);

        System.out.println("Enter number of economy class seat:");
        availEconomyClassSeat = in.nextInt();
        fl.setAvailableEconomyClassSeat(availEconomyClassSeat);

        System.out.println("Enter economy class price per seat:");
        economyClassPrice = in.nextDouble();
        fl.setEconomyClassPrice(economyClassPrice);

        System.out.println("Enter number of business class seat:");
        availBusinessClassSeat = in.nextInt();
        fl.setAvailableBusinessClassSeat(availBusinessClassSeat);

        System.out.println("Enter business class price per seat:");
        businessClassPrice = in.nextDouble();
        fl.setBusinessClassPrice(businessClassPrice);

        flight.add(fl);

        //saving in the file
        try{
            fm.saveFlightDataInFile(flight);
            System.out.println("Flight Data saved in file .....");
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }
    }

    // check all register customer
    private void showAllRegisteredPassenger(){

        System.out.println("\n***************** Check all register customer *****************");

        for (int i = 0; i < passengerDetails.size(); i++) {
            System.out.println(passengerDetails.get(i).getPassengerId());
            System.out.println(passengerDetails.get(i).getPassengerName());
            System.out.println(passengerDetails.get(i).getPassEmail());
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
    //CHECK ALL THE BOOKING
    private void showAllBooking(){

        System.out.println("\n***************** ALL THE BOOKING *****************");

        for (int i = 0; i < bookingLog.size(); i++) {
            System.out.println(bookingLog.get(i).getPassengerId());
            System.out.println(bookingLog.get(i).getPassengerName());
            System.out.println(bookingLog.get(i).getPassengerEmail());
            System.out.println(bookingLog.get(i).getFlightDate());
            System.out.println(bookingLog.get(i).getFlightNumber());
            System.out.println(bookingLog.get(i).getFlightAirlinesName());
            System.out.println(bookingLog.get(i).getFlightDeptCity());
            System.out.println(bookingLog.get(i).getFlightDestCity());
            System.out.println(bookingLog.get(i).getEconomyClassSeat());
            System.out.println(bookingLog.get(i).getTotalEconomyClassPrice());
            System.out.println(bookingLog.get(i).getBusinessClassSeat());
            System.out.println(bookingLog.get(i).getTotalBusinessClassPrice());
            System.out.println("--------------------------------------------------------------------------------------");

        }
    }

    private void deleteAllFlight(){
        FileManagement fm = new FileManagement();
        for (int i = 0; i < flight.size(); i++) {
            flight.remove(i);
            System.out.println("flight data removed..");
        }
        // saving in the file
        try{
            fm.saveFlightDataInFile(flight);
            System.out.println("Flight Data saved in file .....");
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }
    }

    /*
    public void canselFlight(){
        Scanner in = new Scanner(System.in);

        String date;
        String from ;
        String to;
        String fligthStatus = "cancel";


        System.out.println("\n****Search the destination you intend to travel to ****");

        System.out.println("\n please desire date wanna travel :");
        date = in.nextLine();

        System.out.println("\nplease ente Flight Depart from : ");
        from = in.nextLine();

        System.out.println("\nplease enter Flight Destination : ");
        to = in.nextLine();

        System.out.println("\nplease enter Flight Status : ");

        for (int i = 0; i < flight.size(); i++) {
            if (date.equals(flight.get(i).getDate()) && from.equals(flight.get(i).getDeptCity()) && to.equals(flight.get(i).getDestCity()))
            {
               // System.out.println("\nplease enter Flight Status : ");
               // fligthStatus = in.nextLine();
                //flight.get(i).setFligthStatus(fligthStatus);
            }
        }

    }
*/
    public void checkAllFlight(){
        System.out.println("All the flight listed below:");
        for (int i = 0; i < flight.size(); i++) {
            System.out.println("\nFlight number : "+flight.get(i).getFlightNumber());
            System.out.println("Flight Date :"+ flight.get(i).getDate());
            System.out.println("Flight Depart from :"+ flight.get(i).getDeptCity());
            System.out.println("Flight Destination :"+ flight.get(i).getDestCity());
            System.out.println("Available Economy Class Seat :"+ flight.get(i).getAvailableEconomyClassSeat());
            System.out.println("Economy class seat price :"+ flight.get(i).getEconomyClassPrice());
            System.out.println("Available Business Class Seat:"+ flight.get(i).getAvailableBusinessClassSeat());
            System.out.println("Business class seat price:"+ flight.get(i).getBusinessClassPrice());
            System.out.println("-------------------------------------------------------------------------------------\n");

        }

    }


    //--------------------------------------------------------------------------------------
    //                                         Customer Menu
   //-----------------------------------------------------------------------------------
    public void CustomerMenu() {
        FileManagement fm = new FileManagement();

       // Load data from file

        Scanner in = new Scanner(System.in);
        int inp = 0;

        while(inp != 6) {
            System.out.println("****Welcome Valued Customer****");
            System.out.println("Please Select from the following menu");
            System.out.println("1. Press 1 to search a flight.");//CHOOSE FLIGHT
            System.out.println("2. Press 2 to book a flight.");
            System.out.println("3. Press 3 to check your flight booking status.");
            System.out.println("4. Press 4 to cancel a flight.");
            System.out.println("5. Press 5 to edit your flight.");
            System.out.println("6. Press 6 to exit.");


            inp = in.nextInt();
            if (inp == 1) {
                searchFlight();
            } else if (inp == 2) {
                //bookingFlight();
                saveInBookingLog();
            } else if (inp == 3) {
                passengerBookingStatus();
            } else if (inp == 4) {
                //cancelFlight();
            } else if (inp == 5) {
                test();
            } else if (inp == 6) {
                //editFlight();
            }
        }

    }
   public void test(){
       BookingLog bl = new BookingLog();
       FileManagement fm = new FileManagement();


       Scanner in = new Scanner(System.in);
       System.out.println("FLIGHT NUMBER");
       String flightNumber = in.nextLine();
       System.out.println("PassengerName");
       String bookingPassengerName = in.nextLine();
       System.out.println("PassengerEmail");
       String bookingPassengerEmail = in.nextLine();
       System.out.println("PassengerId");
       String bookingPassengerId = in.nextLine();
       System.out.println("FlightDate");
       String bookingFlightDate = in.nextLine();
       System.out.println("FlightDeptCity");
       String bookingFlightDeptCity = in.nextLine();
       System.out.println("FlightDestCity");
       String bookingFlightDestCity = in.nextLine();
       System.out.println("FlightAirlinesName");
       String bookingFlightAirlinesName = in.nextLine();
       System.out.println("EconomyClassSeat");
       int bookingEconomyClassSeat = in.nextInt();
       System.out.println("totalEconomyClassPrice");
       double totalEconomyClassPrice= in.nextInt();
       System.out.println("BusinessClassSeat");
       int bookingBusinessClassSeat = in.nextInt();
       System.out.println("totalBusinessClassPrice");
       double totalBusinessClassPrice = in.nextInt();

       bl.setFlightNumber(flightNumber);
       bl.setFlightDate(bookingFlightDate);
       bl.setPassengerName(bookingPassengerName);
       bl.setPassengerEmail(bookingPassengerEmail);
       bl.setPassengerId(bookingPassengerId);
       bl.setFlightDeptCity(bookingFlightDeptCity);
       bl.setFlightDestCity(bookingFlightDestCity);
       bl.setFlightAirlinesName(bookingFlightAirlinesName);


       bl.setEconomyClassSeat(bookingEconomyClassSeat);
       bl.setTotalEconomyClassPrice(totalEconomyClassPrice);
       bl.setBusinessClassSeat(bookingBusinessClassSeat);
       bl.setTotalBusinessClassPrice(totalBusinessClassPrice);

       bookingLog.add(bl);
       try {
           fm.saveBookingLogDataInfile(bookingLog);
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }
       System.out.println("Booking data saved in the booking log file....");

    }
          //--------------------------------------------------------------------
          //             Customer  Search a suitable flight
          //--------------------------------------------------------------------
    private void searchFlight() {

        Scanner in = new Scanner(System.in);

        //String date;
        String from ;
        String to;

        System.out.println("\n****Search the destination you intend to travel to ****");

        // System.out.println("\n please desire date you wanna travel :");
        //date = in.nextLine();

        System.out.println("\nplease enter your Flight Depart from : ");
        from = in.nextLine();

        System.out.println("\nplease enter your Flight Destination : ");
        to = in.nextLine();

        for (int i = 0; i < flight.size(); i++) {
            if ( from.equals(flight.get(i).getDeptCity()) && to.equals(flight.get(i).getDestCity()))
            {
                System.out.println("\nFlight Number"+flight.get(i).getFlightNumber());
                System.out.println("Flight Date :"+ flight.get(i).getDate());
                System.out.println("Flight Depart from :"+ flight.get(i).getDeptCity());
                System.out.println("Flight Destination :"+ flight.get(i).getDestCity());
                System.out.println("Available Economy Class Seat :"+ flight.get(i).getAvailableEconomyClassSeat());
                System.out.println("Economy class seat price :"+ flight.get(i).getEconomyClassPrice());
                System.out.println("Available Business Class Seat:"+ flight.get(i).getAvailableBusinessClassSeat());
                System.out.println("Business class seat price:"+ flight.get(i).getBusinessClassPrice());
                System.out.println("----------------------------------------------------------------------------------\n");
            }else{
                System.out.println("No Flight exist..... :");
            }
        }
    }

             //------------------------------------------------------------------------
                                         //Register New Customer
            //-------------------------------------------------------------------------


    private void  registerPassenger () {

        Scanner in = new Scanner(System.in);
        PassengerDetails pd = new PassengerDetails();
        //BookingLog bl = new BookingLog();
        FileManagement fm = new FileManagement();

        System.out.println("\n**** Please enter the following info ****");
        System.out.println("please enter your name: ");
        String passengerName = in.nextLine();
        pd.setPassengerName(passengerName);

        System.out.println("Please enter your email: ");
        String passEmail = in.nextLine();
        pd.setPassEmail(passEmail);

        System.out.println("Please enter your Id");
        String passengerId = in.nextLine();
        pd.setPassengerId(passengerId);

        passengerDetails.add(pd);

        try {
            fm.savePassengerDetailsDataInFile(passengerDetails);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Passenger data saved in file .....");

        System.out.println("Thank you " + passengerName + "!" + " Registration Successful\n\n");

    }
    //-------------------------------------------------------------------------
    //                               Customer book a flight
    //-------------------------------------------------------------------------

    private void saveInBookingLog(){

        BookingLog bl = new BookingLog();
        FileManagement fm = new FileManagement();

        History hs = new History();
        Scanner in = new Scanner(System.in);

        //storing extracted passenger info
        String id ;
        String flightNumber ;



            System.out.println("1. New customer " + "\n2. Already a customer"+"\n3. Cancel");
            int inpt = in.nextInt();
            if (inpt == 1){
                registerPassenger ();
              }else if(inpt == 2) {
                System.out.println("Enter your Id:");
                Scanner myId = new Scanner(System.in);
                id = myId.nextLine();

                for (int i = 0; i < passengerDetails.size(); i++) {
                    if (passengerDetails.get(i).getPassengerId().equals(id)) {
                        bl.setPassengerName(passengerDetails.get(i).getPassengerName());
                        bl.setPassengerId(passengerDetails.get(i).getPassengerId());
                        bl.setPassengerEmail(passengerDetails.get(i).getPassEmail());
                        // saving the booking to the history
                        //hs.setPassName(passengerDetails.get(i).getPassengerName());
                        // hs.setPassEmail(passengerDetails.get(i).getPassEmail());

                    }
                }

//extracting flight info
                System.out.println("Enter the flight number:");
                Scanner myFlight = new Scanner(System.in);

                flightNumber = myFlight.nextLine();

                for (int k = 0; k < flight.size(); k++) {
                    if (flight.get(k).getFlightNumber().equals(flightNumber)) {
                        bl.setFlightNumber(flight.get(k).getFlightNumber());
                        bl.setFlightDate(flight.get(k).getDate());
                        bl.setFlightAirlinesName(flight.get(k).getAirlinesName());
                        bl.setFlightDeptCity(flight.get(k).getDeptCity());
                        bl.setFlightDestCity(flight.get(k).getDestCity());
                        bl.setEconomyClassSeat(flight.get(k).getAvailableEconomyClassSeat());
                        bl.setBusinessClassSeat(flight.get(k).getAvailableBusinessClassSeat());


                       //  economyClassPrice = flight.get(k).getEconomyClassPrice();
                        System.out.println("Enter number of economy seat:");
                        economyClassSeat = in.nextInt();
                        //updating the total economy seat cost
                        bl.setTotalEconomyClassPrice(flight.get(k).getEconomyClassPrice() * economyClassSeat);
                        hs.setTotalEcoSeatCost(flight.get(k).getEconomyClassPrice() * economyClassSeat);
                        System.out.println("Enter number of business seat");
                        businessClassSeat = in.nextInt();
                        bl.setTotalBusinessClassPrice(flight.get(k).getBusinessClassPrice() * businessClassSeat);
                        hs.setTotalBussSeatCost(flight.get(k).getBusinessClassPrice() * businessClassSeat);
                        bookingLog.add(bl);
                        try {
                            fm.saveBookingLogDataInfile(bookingLog);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Booking data saved in the booking log file....");

                        System.out.println("Flight data extracted.");

                       /* hs.setFlightNumber(flightNumber);
                        hs.setFlightDate(flight.get(k).getDate());
                        hs.setAirlines(flight.get(k).getAirlinesName());
                        hs.setEcoSeat(economyClassSeat);
                        hs.setBussSeat(businessClassSeat);


                         history.add(hs);
                        try {
                            fm.saveHistoryDataInFile(history);
                        }catch (FileNotFoundException e){
                            e.printStackTrace();
                        }*/
                        System.out.println("History data saved in the history file....");
                    }
                }


                // deducting booked seat number from the airlines
                for (int j = 0; j < flight.size(); j++) {
                    if (flight.get(j).getFlightNumber().equals(flightNumber)) {
                        flight.get(j).setAvailableEconomyClassSeat(flight.get(j).getAvailableEconomyClassSeat() - economyClassSeat);
                        flight.get(j).setAvailableBusinessClassSeat(flight.get(j).getAvailableBusinessClassSeat() - businessClassSeat);

                        System.out.println("Seat deducted ...");
                    }
                }

// saving the booking to the booking log
                bookingLog.add(bl);
                try {
                    fm.saveBookingLogDataInfile(bookingLog);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println("Booking data saved in the booking log file....");

            }else if(inpt == 2){}


    }

    /*------------------------------------------------------------------------------------------------------
                         passengerBookingStatus passengerBookingStatus passengerBookingStatus
     -------------------------------------------------------------------------------------------------------
     */
    private void passengerBookingStatus(){
        Scanner in = new Scanner(System.in);
        String email ;

        System.out.println("Enter your email:");
        email = in.nextLine();

        for (int i = 0; i < bookingLog.size(); i++) {
               if (email.equals(bookingLog.get(i).getPassengerEmail())) {

                   System.out.println("\n******* YOUR BOOKING DETALIS *******");
                   System.out.println("Name: " + bookingLog.get(i).getPassengerName());
                   System.out.println("Email: " + bookingLog.get(i).getPassengerEmail());
                   System.out.println("ID: " + bookingLog.get(i).getPassengerId());
                   System.out.println("Dept City: " + bookingLog.get(i).getFlightDeptCity());
                   System.out.println("Dest City: " + bookingLog.get(i).getFlightDestCity());
                   System.out.println("Flight Date: " + bookingLog.get(i).getFlightDate());
                   System.out.println("Airlines Name: " + bookingLog.get(i).getFlightAirlinesName());
                   System.out.println("Flight Number: " + bookingLog.get(i).getFlightNumber());
                   System.out.println("Total Business Class Price for " + businessClassSeat + " tacet: " + bookingLog.get(i).getTotalBusinessClassPrice());
                   System.out.println("Total Economy Class Price for " + economyClassSeat + " tacet: " + bookingLog.get(i).getTotalEconomyClassPrice());

                   System.out.println("\n------------------------------------------------------------------------------------");
               }
        }
    }
    //------------------------------------------------------------------------------------
    //                           Cancel a  booking
    //------------------------------------------------------------------------------------

    private void cancelFlight(){
        FileManagement fm = new FileManagement();
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Enter your ID");
        String PassengerId = in.nextLine();
        System.out.println("Enter your Flight number");
        String FlightNumber = in.nextLine();

        for ( i = 0; i < bookingLog.size();i++);{
            if (PassengerId.equals(bookingLog.get(i).getPassengerId()) && FlightNumber.equals(bookingLog.get(i).getFlightDate())){
                bookingLog.remove(bookingLog.get(i));
            }else {
                System.out.println("there's been an error in the entry or there's no reservation for that ID.....");
            }
            System.out.println("Your booking are cancel..");
        }

    }
    //----------------------------------------------------------------------------------------------






   /* private void fligthInf(){

        Scanner in = new Scanner(System.in);
        System.out.println("\n**** Choose the number of the trip you want to booking ****");
        for (int i = 0; i < flight.size(); i++) {
            {
                System.out.println((i+1)+"-"+"Flight Date :"+ flight.get(i).getDate());
                System.out.println("Flight Depart from :"+ flight.get(i).getDeptCity());
                System.out.println("Flight Destination :"+ flight.get(i).getDestCity());
                System.out.println("\n");

            }
        }
        int inp;
        inp = in.nextInt();
        inp = inp-1;
        for (int j =0;j<flight.size();j++) {
            if (inp ==j) {
                System.out.println("this is your choose trip ");
               System.out.println("Date:  "+flight.get(j).getDate() + "    from:  "+flight.get(j).getDeptCity() + "     Flight Destination:  "+flight.get(j).getDestCity());
                System.out.println("Economy class seat price :"+ flight.get(j).getEconomyClassPrice());
                System.out.println("Business class seat price:"+ flight.get(j).getBusinessClassPrice());

                Double Economy;
                Double Business;
                System.out.println("choose your class seat ");
                System.out.println("1-Economy\n2-Business ");
                inp = in.nextInt();
                if (inp == 1){
                    System.out.println("how many seats ");
                    inp = in.nextInt();
                    Economy = flight.get(j).getEconomyClassPrice() * inp;
                    System.out.println("TICKET PRICE:" + Economy);
                }else {
                    if (inp == 2){
                        Business= flight.get(j).getBusinessClassPrice() * inp;
                        System.out.println("TICKET PRICE:" + Business);

                    }else System.out.println("YOUR CHOOSE IS FILL");
                }
                //save in booking log
            }
        }


    }
*/
}


/*public class Operations {
    ArrayList<PassengerDetails> passengers;

    public Operations() {
        passengers = (ArrayList<PassengerDetails>) FileUtility.loadObject("passenger.ser");

        if (passengers == null) {
            passengers = new ArrayList<>();
        }
    }*/

    /*  private void checkFlight () {


          String passengerName = MainPortal.myScan.nextLine();


            boolean hasFoundAMatchingName = false;

            for (PassengerDetails p : passengers) {
                if (p.passengerName.equals(passengerName)) {
                    hasFoundAMatchingName = true;


                    System.out.println("Booking information\n" +
                            "Name: " + p.passengerName + "\n" +
                            "ID number: " + p.passengerId + "\n");


                }
                if (hasFoundAMatchingName == false) {
                    System.out.println("s ");
                }


            }

    }*/




   /* void addPassngeer (String passengerName, String passEmail, String passengerId){//test
        PassengerDetails perspnObj = new PassengerDetails(passengerName, passEmail, passengerId);
        passengers.add(perspnObj);
    }


    public static void removeName (List < PassengerDetails > passengersToRemoveFrom) {

        Scanner myScan = new Scanner(System.in);
        String passengerName1 = myScan.nextLine();


        for (PassengerDetails p : passengersToRemoveFrom) {
            if (p.passengerName.equals(passengerName1)) {

                passengersToRemoveFrom.remove(p);//Vi skickar in objektet p
                System.out.println("Your booking was successfully deleted!");
            } else if (p.passengerName != (passengerName1)) {
                System.out.println("Sorry but we could not find your booking! ");
            }
            break;

        }
        FileUtility.saveObject("passenger.ser", passengersToRemoveFrom);


    }
    public void save() {FileUtility.saveObject("passenger.ser", passengers);
    }*/
/*public void deletePassenger(){
        Scanner in = new Scanner(System.in);
        String del;
        del = in.nextLine();

        for (int j =0; j < passengerDetails.size();++j){
            if (del == passengerDetails.get(j).getPassengerName()){
                passengerDetails.remove(j);
            }
        }

    }
*/

   /* private void bookingFlight(){
        Scanner in = new Scanner(System.in);

        BookingLog bl = new BookingLog();
        FileManagement fm = new FileManagement();

        History hs = new History();

        int input = 0;

        //storing extracted passenger info
        String email;
        String id ;
        String name = "";

        //stored extracted flight info
        String flightNumber = "";
        String date = "";
        String deptCity = "";
        String destCity = "";
        String airlinesName = "";
        int economyClassSeat = 0;
        double economyClassPrice = 0;
        double totalEcoSeatCost = 0;
        int businessClassSeat = 0;
        double businessClassPrice = 0;
        double totalBusinessSeatCost = 0;




        System.out.println("1. Book a flight:");
        System.out.println("2. Cancel");
        input = in.nextInt();

        if(input == 1){
            System.out.println("1. New customer " +
                    "\n2. Already a customer");
                    int inpt = in.nextInt();
                    if (inpt == 1){
                        registerPassenger ();
                    }else if(inpt == 2){

                        System.out.println("Enter your Email:");
                        email=  in.nextLine();
                        System.out.println("Enter your Id:");
                        id = in.nextLine();

                        extractPassengerInfo(name);
//extracting flight info

                        System.out.println("Enter the flight number:");
                        flightNumber = in.nextLine();

                        for (int k = 0; k < flight.size(); k++) {
                            if(flight.get(k).getFlightNumber().equals(flightNumber)){
                                date = flight.get(k).getDate();
                                deptCity = flight.get(k).getDeptCity();
                                destCity = flight.get(k).getDestCity();
                                airlinesName = flight.get(k).getAirlinesName();
                                economyClassPrice = flight.get(k).getEconomyClassPrice();
                                businessClassPrice = flight.get(k).getBusinessClassPrice();

                                System.out.println("Flight data extracted.");
                            }
                        }

                        System.out.println("Enter number of economy seat:");
                        economyClassSeat = in.nextInt();
  //updating the total economy seat cost
                        totalEcoSeatCost = economyClassPrice * economyClassSeat;

                        System.out.println("Enter number of business seat");
                        businessClassSeat = in.nextInt();
                        totalBusinessSeatCost = businessClassPrice * businessClassSeat;

                        // deducting booked seat number from the airlines
                        for (int j = 0; j < flight.size(); j++) {
                            if(flight.get(j).getFlightNumber().equals(flightNumber)){
                                flight.get(j).setAvailableEconomyClassSeat(flight.get(j).getAvailableEconomyClassSeat()-economyClassSeat);
                                flight.get(j).setAvailableBusinessClassSeat(flight.get(j).getAvailableBusinessClassSeat()-businessClassSeat);

                                System.out.println("Seat deducted ...");
                            }
                        }

// saving the booking to the booking log
                        bl.setFlightNumber(flightNumber);
                        bl.setFlightDate(date);
                        bl.setPassengerName(name);
                        bl.setPassengerEmail(email);
                        bl.setPassengerId(id);
                        bl.setFlightDeptCity(deptCity);
                        bl.setFlightDestCity(destCity);
                        bl.setFlightAirlinesName(airlinesName);


                        bl.setEconomyClassSeat(economyClassSeat);
                        bl.setTotalEconomyClassPrice(totalEcoSeatCost);
                        bl.setBusinessClassSeat(businessClassSeat);
                        bl.setTotalBusinessClassPrice(totalBusinessSeatCost);

                        bookingLog.add(bl);
                        try {
                            fm.saveBookingLogDataInfile(bookingLog);
                        }catch (FileNotFoundException e){
                            e.printStackTrace();
                        }
                        System.out.println("Booking data saved in the booking log file....");

// saving the booking to the history
                       hs.setFlightNumber(flightNumber);
                       hs.setFlightDate(date);
                       hs.setAirlines(airlinesName);
                       hs.setPassName(name);
                       hs.setPassEmail(email);


                       hs.setEcoSeat(economyClassSeat);
                       hs.setTotalEcoSeatCost(totalEcoSeatCost);
                       hs.setBussSeat(businessClassSeat);
                       hs.setTotalBussSeatCost(totalBusinessSeatCost);

                       histories.add(hs);
                       System.out.println("Booking saved in history .....");
                    }else{
                        System.out.println("Wrong entre !!!");
                    }
        }else if(input == 2){

        }else{
            System.out.println("Wrong entry !!!! ");
        }


    }*/
