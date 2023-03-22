
import thread.sync.ImpData;
import thread.sync.SpellingChecker;
import thread.sync.GramerChecker;
import thread.basics.ThreadOne;
import thread.basics.ThreadTwo;
import thread.basics.ExcelReaderTask;
import thread.itc.NumProducer;
import thread.itc.NumConsumer;
import thread.itc.ItcHub;

public class App {

    public static void demo1() {
        ThreadOne to = new ThreadOne();
        to.start();

        Runnable task1 = new ThreadTwo();
        Thread t1 = new Thread(task1);
        t1.start();

        Runnable task2 = new ExcelReaderTask();
        Thread t2 = new Thread(task2);
        t2.start();
    }

    public static void demo2() {

        ImpData dt = new ImpData();

        Runnable task1 = new SpellingChecker(dt);
        Thread t1 = new Thread(task1);

        Runnable task2 = new GramerChecker(dt);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("There is a problem");
        }

        dt.currentCount();
    }

    public static void demo3() {

        ItcHub hub = new ItcHub();

        Runnable consumer = new NumConsumer(hub);
        Thread t2 = new Thread(consumer);

        Runnable producer = new NumProducer(hub);
        Thread t1 = new Thread(producer);

        t2.start();
        t1.start();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("🔥 Threading 🔥");
        demo3();
    }
}