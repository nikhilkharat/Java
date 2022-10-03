package Assg;

public class _08Member {

      String Name;
      int Age;
      String PhoneNumber;
      String Address;
      double Salary;

      void printSalary(){
          System.out.println("Salary is "+Salary);
      }

}
class _08Employee extends _08Member{
      String Specialisation;
      String Department;
}

class _08Manager extends _08Member{
      String Specialisation;
      String Department;


}

class MainMember{
      public static void main(String[] args) {
            _08Employee obj=new _08Employee();
            _08Member obj1=new _08Manager();
            obj.Name="KH";
            obj.Age=24;
            obj.Address="Daund";
            obj.PhoneNumber="8585";
            obj.Salary=25000.00;
            obj.Specialisation="BE_Mech";
            obj.Department="Design";
            obj.printSalary();


      }
}
