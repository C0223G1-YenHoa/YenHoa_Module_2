package case_study.models;

public class House extends Facility {
    private String roomStandard;
    private int floors;

    public House() {
    }

    public House(String serviceCode, String serviceName, Double usableArea, Double rentalCosts, int maximumPeople, String rentalType, String roomStandard, int floors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House:      Service Code: " + getServiceCode() + " Service Name: " + getServiceName() + " Usable Area: " + getUsableArea()
                + " Rental Costs: " + getRentalCosts() + " Maximum People: " + getMaximumPeople() + " Rental Type: " + getRentalType() +
                " Room Standard: " + getRoomStandard() + " Floors: " + getFloors();
    }

    public String toWrite() {
        return getServiceCode() + "," + getServiceName() + "," + getUsableArea() + "," + getRentalCosts() + "," + getMaximumPeople() +
                "," + getRentalType() + "," + getRoomStandard() + "," + getFloors();
    }
}
