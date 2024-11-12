package Nov.ex_12112024;

public class Lab159 {
    public static void main(String[] args) {
        WagonR r = new WagonR();
        r.drive();


        Tesla t = new Tesla();
        t.drive();
    }
}

class WagonR extends  Engine
{
    void drive()
    {
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Car");
    }
}

abstract class Engine
{
    abstract  void startEngine();
    abstract void stopEngine();
}