package example;

record Point(int x, int y){
    Point {
        if (x<0 ||  y<0) { throw new IllegalArgumentException(); }
    }
}

interface Shape{
    double area();
}
record Circle(double radius) implements Shape  {
    static final double PI = 3.14159;
    public double area() { return PI * radius * radius; }
    public static Circle unitCircle() { return new Circle(1.0); }
}

record Rectangle(double width, double height) implements Shape {
    public double area() {
        return width * height;
    }
    public double obw() {
        return 2*(width+height);
    }
}


public class MyFirstRecord {
    static void printShape(Shape s) {
        if (s instanceof Circle c){
            System.out.println("Circle area: " + c.area());
        }
        if (s instanceof Rectangle r) {
            System.out.println("Rectangle area: " + r.area());
            System.out.println("Rectangle obw: " + r.obw());
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 6);
        Point p3 = new Point(3, 4);
        System.out.println(p1);
        System.out.println(p1.equals(p3));
        System.out.println(p1.x());

        Circle c = new Circle(3.0);
        System.out.println(c.PI);
        System.out.println(c.area());

        Rectangle myRec = new Rectangle(2,2);
        System.out.println(myRec.area());
        System.out.println(myRec);

        MyFirstRecord.printShape(myRec);
        MyFirstRecord.printShape(c);
    }
}
