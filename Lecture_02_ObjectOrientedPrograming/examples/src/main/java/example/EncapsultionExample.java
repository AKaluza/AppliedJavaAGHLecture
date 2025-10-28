package example;


class Person {
    private String name;
    private int age;
    private String old_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.old_name = this.name;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPerson() {
        System.out.println("Coś się dzieje");
    }
}

class Employee extends Person {
    private int salary;
    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    public Employee(Person p, int salary) {
        super(p.getName(), p.getAge());
        this.salary = salary;
    }

    public void promote(int bonus){
        this.salary += bonus;
    }

    public String toString() {
        return super.toString() + " " + salary;
    }
}

class Employee2{
    private Person person;
    int salary;

    public Person getPerson() {
        return person;
    }
    public Employee2(Person p, int salary) {
        this.person = p;
        this.salary = salary;
    }

    public String toString() {
        return person.toString() + " " + salary;
    }
}

public class EncapsultionExample {

    public static void main(String[] args) {
        Person firstPerson = new Person("John Doe", 23);
        Employee employee1 = new Employee(firstPerson, 23000);
        // Employee2 employee2 = new Employee2(employee1, 23050);

        Employee employee3 = new Employee(firstPerson, 23500);
        System.out.println(firstPerson);
        System.out.println(employee1);
        //System.out.println(employee2);
        System.out.println(employee3);
        employee3.promote(300);

        employee1.printPerson();
        //employee2.getPerson().printPerson();
    }
}
