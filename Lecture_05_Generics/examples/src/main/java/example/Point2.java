package example;

public class Point2 {
    private final int x;
    private final int y;

    public Point2(int x, int y) {
        if (x < 0 || y < 0){
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }

    public int x() { return x; }
    public int y() { return y; }

}
