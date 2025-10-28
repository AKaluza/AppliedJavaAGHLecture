package example;

public class SecondClass {
    String name;
    private static String name2 = "JAVA";

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name, String name2) {
        this.name = name + " " + name2;
    }

    public static void print2(){
        System.out.println(name2);
    }

    public void print() {
        System.out.println(name);
    }
}
