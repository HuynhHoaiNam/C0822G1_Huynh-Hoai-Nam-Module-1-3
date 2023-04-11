package furamaresort.models.facility;


public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, double usableArea, double rentalCost,
                 int maximumNumberOfPeople, String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(int swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "VILLA " + super.toString() +
                "RoomStandard: " + roomStandard +
                ", SwimmingPoolArea: " + swimmingPoolArea +
                ", NumberOfFloors: " + numberOfFloors;
    }

    public String getInfoVilla() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,", getServiceCode(), getServiceName(), getUsableArea(), getRentalCost(),
                getMaximumNumberOfPeople(), getRentalType(), getRoomStandard(), getSwimmingPoolArea(), getNumberOfFloors());
    }
}
