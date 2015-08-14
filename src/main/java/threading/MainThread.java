package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
    public static void main(String[] args) {
        /*LiftOff launch = new LiftOff();
        launch.run();*/
        /*Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("waiting for LiftOff");*/

        /*for(int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");*/

        /* newSingleThreadExecutor()--> creates one thread */

        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
        exec.execute(new LiftOff());

        exec.shutdown();

}
}
