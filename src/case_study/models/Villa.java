package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private int poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, Double usableArea, Double rentalCosts, int maximumPeople,
                 String rentalType, String roomStandard, int poolArea, int floors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa:      Service Code: " + getServiceCode() + " Service Name: " + getServiceName() + " Usable Area: " + getUsableArea()
                + " Rental Costs: " + getRentalCosts() + " Maximum People: " + getMaximumPeople() + " Rental Type: " + getRentalType() +
                " Room Standard: " + getRoomStandard() + " Pool Area: " + getPoolArea() + " Floors: " + getFloors();
    }

    public String toWrite() {
        return getServiceCode() + "," + getServiceName() + "," + getUsableArea() + "," + getRentalCosts() + "," +
                getMaximumPeople() + ","+ getRentalType() + "," + getRoomStandard() + "," + getPoolArea() + "," + getFloors();
    }
}
