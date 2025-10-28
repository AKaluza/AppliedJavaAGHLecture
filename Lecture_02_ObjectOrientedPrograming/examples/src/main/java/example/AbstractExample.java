package example;

abstract class Animal2 { // Abstract class

    // Abstract method (no implementation)
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println("Animal is eating");
    }
}

interface X{
    public abstract void walk();
}

interface Y{
    public abstract void walk2();
}

class Cat extends Animal2 implements X{
    public void walk() {}

    @Override
    public void makeSound() {

    }

    public void eat() {}

}

class Dog2 extends Animal2 implements X, Y{
    @Override
    public void makeSound() {

    } // Concrete subclass

    @Override
    public void walk() {

    }

    @Override
    public void walk2() {

    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Dog2 animal = new Dog2();
        animal.makeSound();
        animal.eat();

        X animal2 = new Dog2();
        animal2.walk();
        X animal3 = new Cat();
        animal3.walk();
        // animal.eat();
    }
}
