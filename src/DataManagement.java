import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class DataManagement {

    public abstract void saveFlightDataInFile(List<Flight> flight) throws FileNotFoundException;
    public abstract void savePassengerDetailsDataInFile(List<PassengerDetails> passengerDetails) throws FileNotFoundException;
    public abstract void saveBookingLogDataInfile(List<BookingLog> bookingLog) throws FileNotFoundException;
    public abstract void saveHistoryDataInFile(List<History> history) throws FileNotFoundException;


    public List<Flight> readFlightDataFromFile(String fileName){
        ObjectInputStream objectInputStream = null;
        List<Flight> flight = null;

        File file = new File(fileName);
        if(file.exists()){
            try{
                FileInputStream fileInputStream = new FileInputStream(fileName);
                objectInputStream = new ObjectInputStream(fileInputStream);
                flight = (List<Flight>) objectInputStream.readObject();
                objectInputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            flight = new ArrayList<>();
        }
        return flight;
    }


    //passenger detalis
    public List<PassengerDetails> readPassengerDetailsFromFile(String fileName){
        ObjectInputStream objectInputStream = null;
        List<PassengerDetails> passengerDetails = null;

        File file = new File(fileName);
        if (file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                objectInputStream = new ObjectInputStream(fileInputStream);
                passengerDetails = (List<PassengerDetails>) objectInputStream.readObject();
                objectInputStream.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            passengerDetails = new ArrayList<>();
        }
        return passengerDetails;
    }

    //BookingLog
   public List<BookingLog> readBookingLogFromFile(String fileName){
        ObjectInputStream objectInputStream = null;
        List<BookingLog> bookingLog = null;

        File file = new File(fileName);
        if (file.exists()){
            try{
                FileInputStream fileInputStream = new FileInputStream(fileName);
                objectInputStream = new ObjectInputStream(fileInputStream);
                bookingLog = (List<BookingLog>) objectInputStream.readObject();
                objectInputStream.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else {
            bookingLog = new ArrayList<>();
        }
        return bookingLog;
   }
   //History
  /*  public List<History> readHistoryFromFile(String fileName){
        ObjectInputStream objectInputStream = null;
        List<History> history = null;

        File file = new File(fileName);
        if (file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                objectInputStream = new ObjectInputStream(fileInputStream);
                history = (List<History>) objectInputStream.readObject();
                objectInputStream.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else {
            history = new ArrayList<>();
        }
        return history;
    }*/
}
