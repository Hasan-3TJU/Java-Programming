
public class Abstration3 {

    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();

    }

}

abstract class Shape {

    abstract int draw();
}

class Circle extends Shape {

    @Override
    int draw() {
        System.out.println("Circle is drwaing");
        return 0;

    }
}

class Rectangle extends Shape {

    @Override
    int draw() {
        System.out.println("Rectangle is drawing");
        return 0;
    }
}

class Square extends Shape {

    @Override
    int draw() {
        System.out.println("Rectangle is drawing");
        return 0;
    }

}
