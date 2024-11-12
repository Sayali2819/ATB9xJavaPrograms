package Nov.ex_12112024;

public class Tesla extends Engine{


    @Override
    void startEngine() {
        System.out.println("Start electric engine of tesla!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop electric engine of tesla!");
    }

    void drive()
    {
        startEngine();
        stopEngine();
    }
}
