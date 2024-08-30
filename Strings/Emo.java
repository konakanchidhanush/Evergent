package com.evergent.CoreJAVA.Strings;

import java.util.*;

class Emo {
    String name;
    int age;

    Emo() {
        System.out.println("This is default constructor");
    }

    Emo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Emo11 extends Emo {
    int id;

    Emo11(String name, int age, int id) {
        super(name, age);
        this.id = id;
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Emo11 e1 = new Emo11("hello", 20, 222);
        e1
    }
}
