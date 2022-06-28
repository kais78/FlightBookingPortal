import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileManagement extends DataManagement{
    @Override
    public void saveFlightDataInFile(List<Flight> flight) throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("Flight.txt", false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(flight);
            objectOutputStream.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void savePassengerDetailsDataInFile(List<PassengerDetails> passengerDetails) throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream("PassengerDetails.txt",false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(passengerDetails);
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void saveBookingLogDataInfile(List<BookingLog> bookingLog) throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("BookingLog.txt",false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bookingLog);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void saveHistoryDataInFile(List<History> history) throws FileNotFoundException {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("History.txt",false);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(history);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
