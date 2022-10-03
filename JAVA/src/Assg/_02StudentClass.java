package Assg;

public class _02StudentClass {

    int roll;
    String name;
    int marks;

    public void displayStudentdetails(){
        System.out.println("Roll No. is :"+roll);
        System.out.println("Name is "+name);
        System.out.println("Marks is "+marks);
    }

    public static void main(String[] args) {
        _02StudentClass obj1=new _02StudentClass();
        obj1.roll=25;
        obj1.name="Sonal";
        obj1.marks=100;
        obj1.displayStudentdetails();


    }
}
