package nextdoor;

import java.util.Date;
import java.util.Properties;

public class main {
    public static void main(String[] args){
        System.out.println(new Date());
        Properties p =  System.getProperties();
        /*p.list(System.out);*/

        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };

        Runnable r2 = () -> System.out.println("Hello World two");
        r1.run();
        r2.run();
    }
}
