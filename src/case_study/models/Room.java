package case_study.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(int serviceCode, String serviceName, Double usableArea, Double rentalCosts, int maximumPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
