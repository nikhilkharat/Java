package Notes;

public class _12Honda extends _12Bike{


    @Override
    void run() {
        System.out.println("Run at 110km/h");
    }

    @Override
    String fuel() {
        String fuel="Petrol";
        return fuel;
    }

    @Override
    void gear() {
        super.gear();
    }

    @Override
    String wash() {
        return super.wash();
    }
}
