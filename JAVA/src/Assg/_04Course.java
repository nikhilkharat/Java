package Assg;

import java.util.*;

public class _04Course {

    int  courseId;
    String courseName;
    int courseFee;

    void displayCourseDetails(){
        System.out.println("Course Id is :"+courseId);
        System.out.println("Course Name is :"+courseName);
        System.out.println("Course Fee is :"+courseFee);
    }
    static void authenticate(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Course Id");
        int courseId=scanner.nextInt();

        System.out.println("Enter Course Name");
        String courseName=scanner.next();

        System.out.println("Enter Course Fee");
        int courseFee= scanner.nextInt();





    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        String username=sc.next();

        System.out.println("Enter Password");
        int password=sc.nextInt();
        sc.close();

        if(username == "Admin" && password == 1234){
            authenticate();
           _04Course course=new _04Course();
//
//            course.courseId = courseId;
//            course.courseName = courseName;
//            course.courseFee = courseFee;

            course.displayCourseDetails();
        }else{
            System.out.println("Invalid Username or password");
        }








    }


}
