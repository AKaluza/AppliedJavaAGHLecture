package example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(5));
        Function<String,Integer> length = s -> s.length();
        System.out.println(length.apply("Java 2025"));
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Java 2025");
        Supplier<Double> rand = () -> Math.random();
        System.out.println(rand.get());

    }
}
