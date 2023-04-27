package case_study.models;

import case_study.services.EnumEmployeeGrade;
import case_study.services.EnumEmployeePosition;

public class Employee extends Person {
    private EnumEmployeeGrade grade;
    private EnumEmployeePosition position;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String dayOfBirth, String gender, String citizenId, String telephoneNumber, String email, EnumEmployeeGrade grade, EnumEmployeePosition position, double salary) {
        super(id, name, dayOfBirth, gender, citizenId, telephoneNumber, email);
        this.grade = grade;
        this.position = position;
        this.salary = salary;
    }

    public EnumEmployeeGrade getGrade() {
        return grade;
    }

    public void setGrade(EnumEmployeeGrade grade) {
        this.grade = grade;
    }

    public EnumEmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EnumEmployeePosition position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + getId()+"  Name: "+getName()+"  Day of birth: "+getDayOfBirth()+"  Gender: "+getGender()+"  Citizen ID: "+getCitizenId()+"  Telephone number: "+
                getTelephoneNumber()+"  Email: "+getEmail()+"  Grade: "+getGrade()+"  Position: "+getPosition()+"  Salary: "+getSalary();
    }
    public String toWrite(){
        return getId()+","+getName()+","+getDayOfBirth()+","+getGender()+","+getCitizenId()+","+getTelephoneNumber()
                +","+getEmail()+","+getGrade()+","+getPosition()+","+getSalary();
    }
}
