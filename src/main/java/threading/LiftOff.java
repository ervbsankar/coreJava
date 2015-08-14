package threading;

public class LiftOff implements Runnable{

    protected int countDown = 10; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff() {}
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        while(countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
