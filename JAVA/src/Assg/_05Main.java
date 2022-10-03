package Assg;

public class _05Main {
    public static void main(String[] args) {
        _05Animal obj=new _05Dog();
        obj.eat();

        _05Dog d = (_05Dog) obj;
        d.bark();
    }
}
