package Assg;

public class _07Animal {
    public void makeNoise(){
        System.out.println("Animal making Noise");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}

class _07Dog extends _07Animal{
    @Override
    public void makeNoise() {
        System.out.println("Barking...");
    }
}

class _07Cat extends _07Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meaw...");
    }
}

class _07Tiger extends _07Animal{
    @Override
    public void makeNoise() {
        System.out.println("Raoring...");
    }
}

class MainAnimal{
    public static void main(String[] args) {
        _07Animal a1,a2,a3;
         a1=new _07Dog();
         a2=new _07Cat();
         a3=new _07Tiger();
//        a1.makeNoise();
//        a1.eat();
//        a1.walk();
        _07Animal []arr=new _07Animal[3];
        arr[0]=a1;
        arr[1]=a2;
        arr[2]=a3;

        for (_07Animal i:arr){
            i.makeNoise();
            i.eat();
            i.walk();
        }


    }
}
