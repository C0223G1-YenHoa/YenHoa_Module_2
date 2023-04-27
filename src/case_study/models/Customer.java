package case_study.models;

public class Customer extends Person{
    private String typeGuest;
    private String address;
    private enum Type{
        DIAMOND,
        PLATINUM,
        GOLD,
        SLIVER,
        MEMBER
    }

    public Customer() {
    }

    public Customer(String id, String name, String dayOfBirth, String gender, String citizenId, String telephoneNumber, String email, String typeGuest, String address) {
        super(id, name, dayOfBirth, gender, citizenId, telephoneNumber, email);
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
