package MRTestColle;

import java.util.concurrent.FutureTask;

class MRTest {
    public static void main(String[] args) {
        MyCallable<Integer> mc = new MyCallable<>();
        FutureTask<Integer> futureTask = new FutureTask<>(mc);

        Thread t = new Thread(futureTask,"bao");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }   // Method main end.

}   // class end.