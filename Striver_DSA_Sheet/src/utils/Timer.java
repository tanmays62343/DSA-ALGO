package utils;

import java.util.function.Supplier;

public class Timer {

    public static <T> T calTime(Supplier<T> function) {
        long start = System.nanoTime();
        T result = function.get();
        long duration = System.nanoTime() - start;
        System.out.println("Time taken: " + duration + " ns");
        return result;
    }

}