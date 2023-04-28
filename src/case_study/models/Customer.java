package case_study.models;

import case_study.services.EnumCustomerType;

public class Customer extends Person{
    private EnumCustomerType typeGuest;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String dayOfBirth, String gender, String citizenId, String telephoneNumber, String email, EnumCustomerType typeGuest, String address) {
        super(id, name, dayOfBirth, gender, citizenId, telephoneNumber, email);
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public EnumCustomerType getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(EnumCustomerType typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + getId()+"  Name: "+getName()+"  Day of birth: "+getDayOfBirth()+"  Gender: "+getGender()+"  Citizen ID: "+getCitizenId()+"  Telephone number: "+
                getTelephoneNumber()+"  Email: "+getEmail()+"  Type guest: "+getTypeGuest()+"  Address: "+getAddress();
    }
    public String toWrite(){
        return getId()+","+getName()+","+getDayOfBirth()+","+getGender()+","+getCitizenId()+","+getTelephoneNumber()
                +","+getEmail()+","+getTypeGuest()+","+getAddress();
    }
}
