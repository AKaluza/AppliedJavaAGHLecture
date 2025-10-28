package example;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        //Dog myDog2 = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        // myDog2.animalMethod();
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    public void animalMethod(){
        System.out.println("The dog additional method");
    }
}

