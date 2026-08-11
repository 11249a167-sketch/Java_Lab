class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

class Puppy extends Mammal {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();     // Inherited from Animal
        puppy.breathe(); // Inherited from Mammal
        puppy.weep();    // Subclass method
    }
}
