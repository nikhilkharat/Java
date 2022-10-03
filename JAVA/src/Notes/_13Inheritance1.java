package Notes;

public class _13Inheritance1 {

    _13Inheritance1(){
        System.out.println("Animal is Created");
    }
}

class Dog extends _13Inheritance1{
    Dog(){
        super();
        System.out.println("Dog is Created");
    }
}

class Main{
    public static void main(String[] args) {
        _13Inheritance1 obj =new Dog();

    }
}
