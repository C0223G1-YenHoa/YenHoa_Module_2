package case_study.models;

public class Employee extends Person {
    private String grade;
    private String position;
    private double salary;

    private enum Grade {
        INTERMEDIATE,
        COLLEGE,
        UNIVERSITY,
        AFTER_UNIVERSITY
    }
    private enum Position{
        RECEPTIONIST,
        SERVER,
        EXPERT,
        MONITOR,
        MANAGER,
        ADMINISTRATOR
    }

    public Employee() {
    }

    public Employee(int id, String name, String dayOfBirth, boolean gender, int citizenId, int telephoneNumber, String email, String grade, String position, double salary) {
        super(id, name, dayOfBirth, gender, citizenId, telephoneNumber, email);
        this.grade = grade;
        this.position = position;
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
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
        return "ID: " + getId()+"  Họ và tên: "+getName()+"  Ngày sinh: "+getDayOfBirth()+"  Giới tính: "+isGender()+"  CCCD: "+getCitizenId()+"  SĐT: "+
                getTelephoneNumber()+"  Email: "+getEmail()+"  Trình độ: "+getGrade()+"  Vị trí: "+getPosition()+"  Lương: "+getSalary();
    }
    public String toWrite(){
        return getId()+","+getName()+","+getDayOfBirth()+","+isGender()+","+getCitizenId()+","+getTelephoneNumber()
                +","+getEmail()+","+getGrade()+","+getPosition()+","+getSalary();
    }
}
