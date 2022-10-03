package Notes;

public class _05Typecasting {

    void fun1(int i){
        System.out.println("Inside fun1");
        System.out.println(i);
    }

    public static void main(String[] args) {
        _05Typecasting obj=new _05Typecasting();
        obj.fun1(10);//10
        byte x=25;
        obj.fun1(x);
        double b=20.25;
        obj.fun1((int)b);
    }
}
