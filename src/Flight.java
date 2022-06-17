import java.io.Serializable;

public class Flight implements Serializable {
    private String date;
    private String deptCity;
    private String destCity;
    private String airlinesName;
    private int availableEconomyClassSeat;
    private double economyClassPrice;
    private int AvailableBusinessClassSeat;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeptCity() {
        return deptCity;
    }

    public void setDeptCity(String deptCity) {
        this.deptCity = deptCity;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public String getAirlinesName() {
        return airlinesName;
    }

    public void setAirlinesName(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    public int getAvailableEconomyClassSeat() {
        return availableEconomyClassSeat;
    }

    public void setAvailableEconomyClassSeat(int availableEconomyClassSeat) {
        this.availableEconomyClassSeat = availableEconomyClassSeat;
    }

    public double getEconomyClassPrice() {
        return economyClassPrice;
    }

    public void setEconomyClassPrice(double economyClassPrice) {
        this.economyClassPrice = economyClassPrice;
    }

    public int getAvailableBusinessClassSeat() {
        return AvailableBusinessClassSeat;
    }

    public void setAvailableBusinessClassSeat(int availableBusinessClassSeat) {
        AvailableBusinessClassSeat = availableBusinessClassSeat;
    }

    public double getBusinessClassPrice() {
        return businessClassPrice;
    }

    public void setBusinessClassPrice(double businessClassPrice) {
        this.businessClassPrice = businessClassPrice;
    }

    private double businessClassPrice;


}
