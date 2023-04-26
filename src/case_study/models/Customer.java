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

    public Customer(int id, String name, String dayOfBirth, boolean gender, int citizenId, int telephoneNumber, String email, String grade, String typeGuest, String address) {
        super(id, name, dayOfBirth, gender, citizenId, telephoneNumber, email, grade);
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
