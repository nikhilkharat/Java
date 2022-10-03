package Assg;

import java.util.Scanner;

public class _09Array4 {

    int roll;
    String name;
    String address;
    int marks;

    public _09Array4(int roll, String name, String address, int marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "_09Array4{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter No off Students");
        int size=sc.nextInt();
        _09Array4[]arr=new _09Array4[size];
        for (int i=0;i<size;i++){
            System.out.println("Detail of "+(i+1)+" Student:- ");
            System.out.println("Enter Name Of Student : ");
            String name = sc.next();

            System.out.println("Enter Address of Student : " );
            String address = sc.next();

            System.out.println("Enter Roll No. Of Student : " );
            int roll = sc.nextInt();

            System.out.println("Enter Marks of Student : ");
            int marks = sc.nextInt();

            _09Array4 obj=new _09Array4(roll,name,address,marks);
            arr[i]=obj;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
            System.out.println((i+1)+"Student Details");
            System.out.println("Name : " + arr[i].getName());
            System.out.println("Address : " + arr[i].getAddress());
            System.out.println("Roll No. : " + arr[i].getRoll());
            System.out.println("Marks : " + arr[i].getMarks());
        }
    }

}
