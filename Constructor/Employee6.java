package com.evergent.CoreJAVA.Constructor;

class Super {
    int eno;
    String name;

    // Default constructor
    public Super() {
        System.out.println("This is the default constructor");
    }

    // Parameterized constructor
    Super(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }
}

class Sub extends Super {
    String address;

    // Constructor of the subclass
    Sub(String address, int eno, String name) {
        super(eno, name); // Corrected: Call the parameterized constructor of Super
        this.address = address;
    }

    public void display() {
        System.out.println(address + " " + name + " " + eno);
    }
}

public class Employee6 {
    public static void main(String[] args) {
        Sub s = new Sub("Hyderabad", 721, "Goa");
        s.display();
    }
}
