package examples;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Triangle extends Shape {

}
public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;

        Integer aa = 7;
        Integer bb = 7;

        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(a == b);
        System.out.println(aa == bb);
        System.out.println(str1 == str2); // false (different references)
        System.out.println(str1.equals(str2));

        System.out.println("FB".hashCode()); // 2236
        System.out.println("Ea".hashCode()); // 2236
//
//        Circle circle = new Circle();
//        Shape shape = new Shape();
//        Triangle triangle = new Triangle();
//
//        circle.draw();
//        shape.draw();
//        triangle.draw();
    }
 // true (same content)
}
