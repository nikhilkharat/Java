package Notes;

 class _13Inheritance2 {
    int x=90;
    void run(){
        System.out.println(x);
    }
}
class Honda extends _13Inheritance2{
    int x=150;

    @Override
    void run() {
        System.out.println(x);
    }
    void gear(){
        System.out.println("Shift Gear");
    }
}

 class Nikhil{
     public static void main(String[] args) {
         _13Inheritance2 obj=new Honda();
         System.out.println(obj.x);
         obj.run();

        Honda h=(Honda) obj;
        h.gear();

     }
}
