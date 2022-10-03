package Notes;

public class _07Constructor {

    String name;
    String id;
    double salary;

    public _07Constructor(){
        name="Nikhil";
        id="NK17";
        salary=600000.00;
    } //zero argument constructor

    public _07Constructor(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    } // parametrized constructor

    void display(){
        System.out.println("My Name is "+name+" My Id is "+id+" My Salary is "+salary);
    }
    public String display1(){
        String x= (" Name is "+name+" Id is "+id+" Salary is "+salary);
        return x;
    }
    public static void main(String[] args) {
        _07Constructor obj=new _07Constructor();
        obj.display();
        System.out.println(obj.display1());

        _07Constructor obj1=new _07Constructor("Sonal","SK25",1000000.00);
        obj1.display();
        System.out.println(obj1.display1());

    }
}
