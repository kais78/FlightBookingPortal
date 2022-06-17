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
}
