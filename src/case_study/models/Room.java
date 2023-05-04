package case_study.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, Double usableArea, Double rentalCosts, int maximumPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room:      Service Code: " + getServiceCode() + " Service Name: " + getServiceName() + " Usable Area: " + getUsableArea()
                + " Rental Costs: " + getRentalCosts() + " Maximum People: " + getMaximumPeople() + " Rental Type: " + getRentalType() +
                " Free Service: " + getFreeService() ;
    }
    public String toWrite(){
        return getServiceCode() + "," + getServiceName() + "," + getUsableArea() + "," + getRentalCosts() + "," + getMaximumPeople() +
                "," + getRentalType() + "," + getFreeService();
    }
}
