package examples;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SecondClass secondClass = new SecondClass();
        SecondClass.print2();
        String name2 = secondClass.getName2();
        System.out.println(name2);
        secondClass.print();
        secondClass.getName().toLowerCase();
        secondClass.setName("Java L1");
        System.out.println(secondClass.getName());

    }
}
