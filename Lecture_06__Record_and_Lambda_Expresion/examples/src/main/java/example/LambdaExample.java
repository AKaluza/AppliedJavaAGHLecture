package example;
@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}
//
//interface Operation {
//    int apply(int a, int b);
//}
//class Addition implements Operation {
//    @Override
//    public int apply(int a, int b) {
//        return a + b;
//    }
//}
//
//class Multiplication implements Operation {
//    @Override
//    public int apply(int a, int b) {
//        return a * b;
//    }
// }

public class LambdaExample {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation multiplication = (a, b) -> a * b;
//        Addition addition = new Addition();
        System.out.println(addition.apply(1, 2));
//        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.apply(1, 2));
    }
}
