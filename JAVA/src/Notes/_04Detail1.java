package Notes;

import java.util.Scanner;

public class _04Detail1 {
    String name;
    String surname;
    _04Detail2 address;

    _04Detail2 obj1=new _04Detail2();

    public void  display(){

        System.out.println( "My Name is "+name+" "+surname);
        obj1.display1();
    }



    public static void main(String[] args) {

        _04Detail1 obj=new _04Detail1();
        obj.name="nik";
        obj.surname="kha";
        obj.address=new _04Detail2();
        obj.obj1.city="Daund";
        obj.obj1.state="Maha";
        obj.obj1.pincode="413801";

       obj.display();
//
//        _04Detail2 obj1=new _04Detail2();
      //  obj1.display1();


    }
}
