import java.util.Scanner;

public class Operations implements Functions{

    @Override
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        int inp;
        while(true){
        System.out.println("!!!!Welcome to the flight booking system!!!!");
        System.out.println("\nplease select from the following menu.....");
        System.out.println("\n 1. Press 1 if you are a customer." +
                "\n2. Press 2 if you are a Admin Person" +
                "\n3. Press 3 to exit");
        inp = in.nextInt();
        if (inp == 1){
            //calling customer menu function
            CustomerMenu();

        }else if(inp == 2){
            //Calling ADMIN MENU function
            AdminMenu();

        }else if( inp == 3){
            //Closing the program
            System.out.println("!!!!Welcome Back Again!!!!");
            System.exit(0);
        }
            else{
            System.out.println("Input is not Correct!!! Try Again");
        }


    }
    }

    private void CustomerMenu(){
        System.out.println("****Welcome Valued Customer****");
        System.out.println("Please Select from the following menu");
        System.out.println("1. Press 1 to search a flight.");
        System.out.println("2. Press 2 to book a flight.");
        System.out.println("3. Press 3 to check your flight booking status.");
        System.out.println("4. Press 4 to cancel a flight.");
        System.out.println("5. Press 5 to edit your flight.");
        System.out.println("6. Press 6 to exit.");

    }


    private void searchFlight(){

    }

    private void bookFlight(){

    }

    private void AdminMenu(){
        System.out.println("****Welcome to the Admin Menu****");
        System.out.println("1. Press 1 to check the available flight" +
                "\n2. Press 2 to check the register customers" +
                "\n3. Press 3 to add new flight" +
                "\n4. Press 4 to delete a flight" +
                "\n5. Press 5 delete all flight" +
                "\n6. Press 6 to delete a register customer" +
                "\n7. Press 7 to delete all register customer" +
                "\n8. Press 8 to exit");


    }


    private void addFlight(){

    }


}
