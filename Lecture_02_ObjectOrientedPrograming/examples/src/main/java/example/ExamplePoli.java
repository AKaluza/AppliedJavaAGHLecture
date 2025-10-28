package example;

interface AnimalPoli {
    void makeSound();
}

abstract class AnimalPoliC{
    abstract void makeMove();
}

class DogPoli extends AnimalPoliC implements AnimalPoli {
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    void makeMove() {
        System.out.println("RUN");
    }
}

class CatPoli implements AnimalPoli {
    public void makeSound() {
        System.out.println("Meow");
    }
}



public class ExamplePoli {
    public void animalMakeMove(AnimalPoliC dog) {
        dog.makeMove();
        System.out.println("animalMakeMove DONE");
    }

    public void animalMakeSound(AnimalPoli dog) {
        dog.makeSound();
        System.out.println("animalMakeSound DONE");
    }

    public static void main(String[] args) {
        ExamplePoli b = new ExamplePoli();
        AnimalPoliC a = new DogPoli();
        a.makeMove();
        if (a instanceof DogPoli) {
            DogPoli d = (DogPoli) a;   // Downcasting
            d.makeSound();         // Access Dog-specific behavior
        }

        System.out.println(a);
//        DogPoli a = new DogPoli();
//        a.makeSound();
//        CatPoli c = new CatPoli();
//        a.makeSound();
//
//        b.animalMakeSound(a);
//        b.animalMakeSound(c);
    }


}
