
public class InstanceOf {

    public static void main(String[] args) {
        Simple s1 = new Simple();
        System.out.println(s1 instanceof Simple);

        Simple s2 = null;
        System.out.println(s2 instanceof Simple);
    }

}

class Simple {

}
