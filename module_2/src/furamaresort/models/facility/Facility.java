package furamaresort.models.facility;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private double usableArea;
    private double rentalCost;
    private int maximumNumberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double usableArea,
                    double rentalCost, int maximumNumberOfPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility= " +
                "ServiceCode:" + serviceCode +
                ", ServiceName:" + serviceName +
                ", UsableArea:" + usableArea + "m2" +
                ", RentalCost:" + rentalCost + "m2" +
                ", MaximumNumberOfPeople:" + maximumNumberOfPeople +
                ", RentalType:" + rentalType;
    }
}
