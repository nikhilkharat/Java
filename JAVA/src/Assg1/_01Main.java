package Assg1;

public class _01Main {
    public static _01Person generatePerson(_01Person person){
        return person;
    }

    public static void main(String[] args) {
        _01Address add=new _01Address("Daund","MaHa","413801");
        _01Person obj= generatePerson(new _01Student("Nikhil","Male",add,1,"JAVA",25000));
        System.out.println(add.toString());
        System.out.println(obj.toString());
    }
}
