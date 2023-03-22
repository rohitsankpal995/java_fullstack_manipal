package thread.sync;

import thread.sync.ImpData;

public class GramerChecker implements Runnable {

    private final ImpData dt;

    public GramerChecker(ImpData dt) {
        this.dt = dt;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++ ) {
            dt.decrement();
        }
    }
}
