
public class InheritanceExample1 {

    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();
    }

}

class Animal {

    void eat() {
        System.out.println(" is Eating");
    }
}

class dog extends Animal {

    void bark() {
        System.out.println("Dod is Barking");
    }
}
