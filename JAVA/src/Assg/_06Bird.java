package Assg;

public class _06Bird {

    public void fly(){
        System.out.println("Bird is Flying");
    }
}

class _06Parrot extends _06Bird{
    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
    public void sing(){
        System.out.println("I am Singing");
    }
}

class MainBird{
    public static void main(String[] args) {
        _06Bird b1=new _06Parrot();
        b1.fly();
        _06Parrot p1=(_06Parrot) b1;
        p1.sing();
        p1.fly();
    }
}
