import java.lang.Thread;
import Workshop;

public class Elf implements Runnable{
    private Workshop ws;
    private static final int SLEEPING = 0, HUNGRY = 1, STARVING = 2, EATING = 3;

    public Elf(Workshop work) {
        ws = work;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Elf");
        ws.wakeUpSanta();
    }

     
}