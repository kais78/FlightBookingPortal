import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Operations implements Functions {

    public List<Admin> admin = new ArrayList<Admin>();
    public List<BookingLog> bookingLogs = new ArrayList<BookingLog>();
    public List<Flight> flight = new ArrayList<Flight>();
    public List<PassengerDetails> passengerDetails = new ArrayList<PassengerDetails>();
    public List<History> histories = new ArrayList<History>();


    @Override
    public void showMenu() {

        Scanner in = new Scanner(System.in);
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
        int inp;

        System.out.println("****Welcome Admin****");
        System.out.println("Please Select from the following menu");
        System.out.println("\n1. Press 1 to available flight.");//CHOOSE FLIGHT
        System.out.println("\n2. Press 2 to add a flight.");
        System.out.println("\n3. Press 3 to check all flights:");
        System.out.println("\n4. Press 4 to cancel a flight.");
        System.out.println("\n5. Press 5 to edit your flight.");
        System.out.println("\n6. Press 6 to delete a passenger");
        System.out.println("\n7. Press 7 to delete all passenger");
        System.out.println("\n8. Press 8 to see available booking.");
        System.out.println("\n9. Press 9 to check all register customers");
        System.out.println("\n10. Press 10 to exit.");

        inp = in.nextInt();
        if (inp == 1) {
            //searchFlight();
        } else if (inp == 2) {
            addFlight();
        } else if (inp == 3) {
            checkAllFlight();
        } else if (inp == 4) {
            //canselFlight();
        } else if (inp == 5) {
            //editFlight();
        }else if(inp == 10){
            System.out.println("getting out from admin menu ........!!!!");
        }


    }

    public void addFlight() {
        Scanner in = new Scanner(System.in);
        Flight fl = new Flight();

        String date;
        String deptCity;
        String destCity;
        int availEconomyClassSeat;
        double economyClassPrice;
        int availBusinessClassSeat;
        double businessClassPrice;

        System.out.println("Enter date of the flight");
        date = in.nextLine();
        fl.setDate(date);

        System.out.println("Enter City of departure:");
        deptCity = in.nextLine();
        fl.setDeptCity(deptCity);

        System.out.println("Enter City of destination:");
        destCity = in.nextLine();
        fl.setDestCity(destCity);

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
    }

    public void checkAllFlight(){
        System.out.println("All the flight listed below:");
        for (int i = 0; i < flight.size(); i++) {
            System.out.println("Flight Date :"+ flight.get(i).getDate());
            System.out.println("Flight Depart from :"+ flight.get(i).getDeptCity());
            System.out.println("Flight Destination :"+ flight.get(i).getDestCity());
            System.out.println("Available Economy Class Seat :"+ flight.get(i).getAvailableEconomyClassSeat());
            System.out.println("Economy class seat price :"+ flight.get(i).getEconomyClassPrice());
            System.out.println("Available Business Class Seat:"+ flight.get(i).getAvailableBusinessClassSeat());
            System.out.println("Business class seat price:"+ flight.get(i).getBusinessClassPrice());
        }

    }

    //Customer Menu
    public void CustomerMenu() {
        Scanner in = new Scanner(System.in);
        int inp;

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
            //bookFlight();
        } else if (inp == 3) {
            //checkFlight();
        } else if (inp == 4) {
            //canselFlight();
        } else if (inp == 5) {
            //editFlight();
        }


    }


    private void searchFlight() {
        System.out.println("\n****Search the destination you intend to travel to ****");
        System.out.println("\nplease enter your Flight: ");


    }

    /*private void bookFlight () {
            System.out.println("\n**** Choose the destination you intend to travel to ****");
            System.out.println("please enter your name: ");
            String passengerName = MainPortal.myScan.nextLine();
            System.out.println("Please enter your email: ");
            String passEmail = MainPortal.myScan.nextLine();
            System.out.println("Please enter your Id");
            String passengerId = MainPortal.myScan.nextLine();
            System.out.println("Thank you " + passengerName + "!" + " This is a confirmation that you have booked\n\n\n");
          //  addPassngeer(passengerName, passEmail, passengerId);
           // save();
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
}


/*public class Operations {
    ArrayList<PassengerDetails> passengers;

    public Operations() {
        passengers = (ArrayList<PassengerDetails>) FileUtility.loadObject("passenger.ser");

        if (passengers == null) {
            passengers = new ArrayList<>();
        }
    }*/