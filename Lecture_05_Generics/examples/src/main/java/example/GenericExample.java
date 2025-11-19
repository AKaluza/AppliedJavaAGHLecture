package example;

import java.util.ArrayList;
import java.util.List;

class BoxString{
    private String str;
}

class BoxInteger{
    private Integer integer;
}

class Box<T>{
    private T obj;
}

public class GenericExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        // list.add(123);
        list.add("C++");

        for (String o : list) {
            String s = o;
            System.out.println(s);
        }
        Box<String> bs = new Box<>();
        Box<Integer> bi = new Box<>();


    }
}
