package Assg1;

public class _01Person {

    String name;
    String gender;
    _01Address address;

    public _01Person(String name, String gender, _01Address address) {
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public _01Address getAddress() {
        return address;
    }

    public void setAddress(_01Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "_01Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }
}






