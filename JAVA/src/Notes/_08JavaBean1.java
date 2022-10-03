package Notes;

public class _08JavaBean1 {
    public static void main(String[] args) {
        //zero argument
        _08JavaBean obj=new _08JavaBean();
        obj.setName("Nikhil");
        obj.setId("Nk017");
        obj.setSalary(50000);

        obj.display();

        //parameterized constructor
        _08JavaBean obj1=new _08JavaBean("Sonal", "SK025",60000);
        obj1.display();
    }
}
