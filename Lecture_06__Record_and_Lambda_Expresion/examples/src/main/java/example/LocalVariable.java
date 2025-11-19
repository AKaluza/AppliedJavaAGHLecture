package example;

import java.util.function.Function;

public class LocalVariable {
    public static void main(String[] args) {
        int base = 10;
        Function<Integer, Integer> addBase = x -> {
            x = 10;
            return x + base;};
        System.out.println(addBase.apply(5));
        System.out.println(addBase.apply(5));

    }
}
