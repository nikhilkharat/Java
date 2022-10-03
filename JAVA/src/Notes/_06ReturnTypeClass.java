package Notes;

public class _06ReturnTypeClass {

    int i=25;
    void funA(){
        System.out.println("Inside funA of _06ReturnTypeClass");
    }
}

 class Demo{
     public _06ReturnTypeClass fun1(){
         System.out.println("inside fun1");
         return new _06ReturnTypeClass();
     }
    public static void main(String[] args) {
        Demo obj =new Demo();
        obj.fun1();


        _06ReturnTypeClass obj1=new _06ReturnTypeClass();
        obj1.funA();


        _06ReturnTypeClass obj2=obj.fun1();
        obj2.funA();
    }
}
