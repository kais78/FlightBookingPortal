import java.io.Serializable;

public class BookingLog implements Serializable {

    private String flightNumber;
    private String passengerName;
    private String passengerEmail;
    private String passengerId;
    private String flightDate;
    private String flightDeptCity;
    private String flightDestCity;
    private String flightAirlinesName;
    private int economyClassSeat;
    private double totalEconomyClassPrice;
    private int businessClassSeat;
    private double totalBusinessClassPrice;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightDeptCity() {
        return flightDeptCity;
    }

    public void setFlightDeptCity(String flightDeptCity) {
        this.flightDeptCity = flightDeptCity;
    }

    public String getFlightDestCity() {
        return flightDestCity;
    }

    public void setFlightDestCity(String flightDestCity) {
        this.flightDestCity = flightDestCity;
    }

    public String getFlightAirlinesName() {
        return flightAirlinesName;
    }

    public void setFlightAirlinesName(String flightAirlinesName) {
        this.flightAirlinesName = flightAirlinesName;
    }

    public int getEconomyClassSeat() {
        return economyClassSeat;
    }

    public void setEconomyClassSeat(int economyClassSeat) {
        this.economyClassSeat = economyClassSeat;
    }

    public double getTotalEconomyClassPrice() {
        return totalEconomyClassPrice;
    }

    public void setTotalEconomyClassPrice(double totalEconomyClassPrice) {
        this.totalEconomyClassPrice = totalEconomyClassPrice;
    }

    public int getBusinessClassSeat() {
        return businessClassSeat;
    }

    public void setBusinessClassSeat(int businessClassSeat) {
        this.businessClassSeat = businessClassSeat;
    }

    public double getTotalBusinessClassPrice() {
        return totalBusinessClassPrice;
    }

    public void setTotalBusinessClassPrice(double totalBusinessClassPrice) {
        this.totalBusinessClassPrice = totalBusinessClassPrice;
    }
}