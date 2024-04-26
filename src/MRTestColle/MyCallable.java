package MRTestColle;

import java.util.concurrent.Callable;

public class MyCallable<K> implements Callable<K> {
    @Override
    public K call() throws Exception {
        System.out.println("run");
        return null;
    }
}   // Class end.
