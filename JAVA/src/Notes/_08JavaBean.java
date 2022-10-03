package Notes;

public class _08JavaBean {

    private String name;
    private String id;
    private int salary;

    //zero argument constructor
    public _08JavaBean(){};

    public _08JavaBean(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display(){
        System.out.println("Name is "+name);
        System.out.println("Id is "+id);
        System.out.println("Salary is "+salary);
    }
}
