public class Workshop {
    public int numberOfElvesWaiting = 0;
    public int numberOfReindeerWaiting = 0;
    

    public static void main(String[] args) {
        Thread elves[] = new Thread[10];
        Thread reindeer[] = new Thread[9];
        Workshop northPole = new Workshop();

        for (int i=0;i<10;i++) {
            Runnable runner = new Elf(northPole);
            elves[i] = new Thread(runner);
        }
        for (int i=0;i<9;i++) {
            Runnable runner = new Reindeer(northPole);
            reindeer[i] = new Thread(runner);
        }

        for (int i=0;i<10;i++) {
            elves[i].start();
        }
        for (int i=0;i<9;i++) {
            reindeer[i].start();
        }

        // for (int i=0;i<numOfStudents;i++) {
        //     try {
        //         studentList[i].join();
        //     }
        //     catch(InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }
    }

    public synchronized void wakeUpSanta() {
        if (Thread.currentThread().getName() == "Santa") {
            System.out.println("Santa tried to wake up");
        }
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        if (numberOfReindeer == 1) {

        }
    }

    public synchronized void tester() {
        System.out.println("This is being run by: " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + ": ");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}