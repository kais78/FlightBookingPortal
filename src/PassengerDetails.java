import java.io.Serializable;
import java.util.Date;



public class PassengerDetails implements Serializable {
    private static final long serialVersionUID = -6849794474667710L;

    public String passengerName;
    public String passEmail;
    public String passengerId;
    String date = new Date().toString();

    public PassengerDetails(String passengerName, String passEmail, String passengerId) {
        this.passengerName = passengerName;
        this.passEmail = passEmail;
        this.passengerId = passengerId;
    }



   /* public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassEmail() {
        return passEmail;
    }

    public void setPassEmail(String passEmail) {
        this.passEmail = passEmail;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

*/


}
