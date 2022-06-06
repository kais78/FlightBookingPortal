import java.util.Scanner;

public class Operations implements Functions{

    @Override
    public void showMenu() {
        Scanner in = new Scanner(System.in);
        int inp;
        while(true){
        System.out.println("!!!!Welcome to the flight booking system!!!!");
        System.out.println("please select from the following menu.....");
        System.out.println("\n 1. Press 1 if you are a customer." +
                "2. Press 2 if you are a Admin Person" +
                "3. Press 3 to exit");
        inp = in.nextInt();
        if (inp == 1){

        }else if(inp == 2){

        }else if( inp == 3){
            System.out.println("!!!!Welcome Back Again!!!!");
            System.exit(0);
        }
            else{
            System.out.println("Input is not Correct!!! Try Again");
        }


    }
    }

    private void CusstomerMenu(){

    }

    private void AdminMenu(){

    }
}
