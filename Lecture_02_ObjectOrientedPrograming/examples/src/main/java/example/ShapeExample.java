package example;

interface Drowable{
    public void draw();
}

abstract class MyShape implements Drowable{
    private int x;
}

public class ShapeExample extends MyShape {

    @Override
    public void draw() {

    }
}
