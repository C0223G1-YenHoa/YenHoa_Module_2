package mvc.mvc_1.model;

public class Student1 extends Person {
    private int point;
    private String classes;

    public Student1() {
    }


    public Student1(int id, String name, int age, String email, int point, String classes) {
        super(id, name, age, email);
        this.point = point;
        this.classes = classes;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student( " + "ID: " + getId() + ", Tên: " + getName() + ", Tuổi: " + getAge() + ", Email: " + getEmail()
                + ", Điểm số: " + getPoint() + ", Lớp học: " + getClasses()+")";
    }
    public String write(){
        return getId()+","+getName()+","+getAge()+","+getEmail()+","+getPoint()+","+getClasses();
    }
}
