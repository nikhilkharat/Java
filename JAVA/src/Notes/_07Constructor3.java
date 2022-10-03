package Notes;

public class _07Constructor3 {

    public  _07Constructor3(){
        this(10);
        System.out.println("Inside the first constructor");
    }
    public _07Constructor3(int x){
        this(100, 200);
        System.out.println("inside one argument constructor Demo(int x)");
    }
    public _07Constructor3(int x,int y){
        this("Hello");
        System.out.println("inside two argument constructor Demo(int x,int y)");
    }
    public _07Constructor3(String s){
//this(); //it will become recursive call
        System.out.println("inside one(String) argument constructor Demo(String s)");
    }
    public void display(){
        System.out.println( );
    }

    public static void main(String[] args) {
        _07Constructor obj=new _07Constructor();


    }
}
