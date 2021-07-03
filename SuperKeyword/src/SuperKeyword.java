
public class SuperKeyword {

    public static void main(String[] args) {
        dog d = new dog();
        d.color();
        d.work();

    }

}

class Animal {

    String color = "black";
     void eat() {
        System.out.println(" is Eating");
    }

}

class dog extends Animal {

    String color = "white";

    void color() {
        System.out.println(color);
        System.out.println(super.color);
    }
    void eat() {
        System.out.println(" is Eating Meat");
    }
    void work(){
        super.eat();
    }

}
