package practiceThreads;

// public class Counter {
//     private static int count = 0;

//     public static synchronized void increment() {
//         count++;
//     }

//     public static int getCount() {
//         return count;
//     }

// }

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static AtomicInteger count = new AtomicInteger(0);

    public static void increment() {
        count.incrementAndGet();
    }

    public static int getCount() {
        return count.get();
    }
}
