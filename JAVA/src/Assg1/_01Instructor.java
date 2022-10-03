package Assg1;

public class _01Instructor extends _01Person{

    int instructorId;
    int Salary;

    public _01Instructor(String name, String gender, _01Address address, int instructorId, int salary) {
        super(name, gender, address);
        this.instructorId = instructorId;
        Salary = salary;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "_01Instructor{" +
                "instructorId=" + instructorId +
                ", Salary=" + Salary +
                '}';
    }
}
