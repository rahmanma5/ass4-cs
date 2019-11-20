import java.lang.Thread;
import Workshop;

public class Reindeer implements Runnable{
    private Workshop ws;
    private static final int SLEEPING = 0, HUNGRY = 1, STARVING = 2, EATING = 3;

    public Reindeer(Workshop work) {
        ws = work;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Reindeer");
        ws.wakeUpSanta();
    }

     
}