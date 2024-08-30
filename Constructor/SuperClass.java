package com.evergent.CoreJAVA.Constructor;

public class SuperClass {
    String name;
    int age;
    int id;

    SuperClass() {
        System.out.println("This is the default constructor");
    }

    SuperClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Subclass extends SuperClass {
    Subclass(String name, int age, int id) {
        super(name, age);
        this.id = id;
        System.out.println(name + " " + age + " " + id);
    }

    public static void main(String[] args) {
        Subclass s = new Subclass("ram", 11, 9);
        System.out.println(s.age);
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
