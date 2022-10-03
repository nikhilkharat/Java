package Notes;

public class _13Inheritance {

    void run(){
        System.out.println("Vechile Run");
    }
}
class Bike extends _13Inheritance{
    @Override
    void run() {
       // super.run();
        System.out.println("Bike Also Run");
    }
    void work(){
        super.run();
        run();
    }

    public static void main(String args[]){
        Bike obj=new Bike();
        obj.run();//Now which msg() method would be invoked?
        obj.work();
    }
}


