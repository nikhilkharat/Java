package Notes;

public class _07Constructor2 {
    int x=26;
    void fun1(){
        int x=36;
        System.out.println("Inside fun1");
        System.out.println(this);
        System.out.println(this.x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        _07Constructor2 obj =new _07Constructor2();
        obj.fun1();
    }
}
