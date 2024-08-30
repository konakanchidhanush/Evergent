package com.evergent.CoreJAVA.OopsConcepts;

class Superclass {
    public void superr() {
        System.out.println("this is the super class");
    }
}

class Subclass1 extends Superclass {
    public void subclass1() {
        System.out.println("This is the subclass one");
    }
}

class Subclass2 extends Subclass1 {
    public void subclass2() {
        System.out.println("This is the subclass two");
    }
}

public class InheritanceMultiple {
    public static void main(String[] args) {
        Subclass2 s = new Subclass2();
        s.superr(); // Calling method from Superclass
        s.subclass1(); // Calling method from Subclass1
        s.subclass2(); // Calling method from Subclass2
    }
}
