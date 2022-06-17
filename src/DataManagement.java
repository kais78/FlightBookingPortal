import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class DataManagement {

    public abstract void saveFlightDataInFile(List<Flight> flight) throws FileNotFoundException;



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
}
