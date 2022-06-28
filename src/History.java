public class History {
    private String flightNumber;
    private String flightDate;
    private String passName;
    private String passEmail;
    private String airlines;
    private int ecoSeat;
    private double totalEcoSeatCost;
    private int bussSeat;
    private double totalBussSeatCost;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public String getPassEmail() {
        return passEmail;
    }

    public void setPassEmail(String passEmail) {
        this.passEmail = passEmail;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public int getEcoSeat() {
        return ecoSeat;
    }

    public void setEcoSeat(int ecoSeat) {
        this.ecoSeat = ecoSeat;
    }

    public double getTotalEcoSeatCost() {
        return totalEcoSeatCost;
    }

    public void setTotalEcoSeatCost(double totalEcoSeatCost) {
        this.totalEcoSeatCost = totalEcoSeatCost;
    }

    public int getBussSeat() {
        return bussSeat;
    }

    public void setBussSeat(int bussSeat) {
        this.bussSeat = bussSeat;
    }

    public double getTotalBussSeatCost() {
        return totalBussSeatCost;
    }

    public void setTotalBussSeatCost(double totalBussSeatCost) {
        this.totalBussSeatCost = totalBussSeatCost;
    }
}
