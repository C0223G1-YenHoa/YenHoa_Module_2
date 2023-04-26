package case_study.models;

public class Villa extends Facility{
    private int roomStandard;
    private int poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(int serviceCode, String serviceName, Double usableArea, Double rentalCosts, int maximumPeople, String rentalType, int roomStandard, int poolArea, int floors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public int getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(int roomStandard) {
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
}
