package Notes;

public abstract class _12Bike {

    _12Bike(){
        System.out.println("Bike Created");
    }

    abstract void run();

    abstract String fuel();

    void gear(){
        System.out.println("Change Gear");
    }

    String wash(){
        String wash="Wash Bike";
        return wash;
    }

}
