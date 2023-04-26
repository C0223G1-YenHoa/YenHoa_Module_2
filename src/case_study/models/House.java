package case_study.models;

public class House extends Facility{
  private int roomStandard;
    private int floors;

    public House() {
    }

    public House(int serviceCode, String serviceName, Double usableArea, Double rentalCosts, int maximumPeople, String rentalType, int roomStandard, int floors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public int getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(int roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
