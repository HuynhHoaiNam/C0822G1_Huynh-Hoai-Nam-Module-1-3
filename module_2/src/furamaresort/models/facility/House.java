package furamaresort.models.facility;


public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, double usableArea, double rentalCost,
                 int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "HOUSE " +
                super.toString() +
                ", RoomStandard: " + roomStandard  +
                ", NumberOfFloors: " + numberOfFloors;

    }
    public String getInfoHouse() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getServiceCode(), getServiceName(), getUsableArea(), getRentalCost(),
                getMaximumNumberOfPeople(), getRentalType(), getRoomStandard(), getNumberOfFloors());
    }
}
