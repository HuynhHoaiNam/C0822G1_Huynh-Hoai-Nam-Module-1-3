package furamaresort.models.facility;



public class Room extends Facility {
    private String freeServiceIncludedj;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost,
                int maximumNumberOfPeople, String rentalType, String freeServiceIncludedj) {
        super(serviceCode, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType);
        this.freeServiceIncludedj = freeServiceIncludedj;
    }

    public String getFreeServiceIncludedj() {
        return freeServiceIncludedj;
    }

    public void setFreeServiceIncludedj(String freeServiceIncludedj) {
        this.freeServiceIncludedj = freeServiceIncludedj;
    }

    @Override
    public String toString() {
        return "ROOM " + super.toString() +
                ", FreeServiceIncludedj: " + freeServiceIncludedj
                ;
    }
    public String getInfoRoom() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", getServiceCode(), getServiceName(), getUsableArea(), getRentalCost(),
                getMaximumNumberOfPeople(), getRentalType(), freeServiceIncludedj);
    }
}
