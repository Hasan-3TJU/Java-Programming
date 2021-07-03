
public class StringBuilderMethod {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hey Java ");
        sb.append("How are you");
        System.out.println(sb);//Hey Java How are you

        sb.insert(20, " ,is C++ your brother?");
        System.out.println(sb);//Hey Java How are you ,is C++ your brother?

        sb.delete(0, 8);
        System.out.println(sb);// How are you ,is C++ your brother?

        sb.replace(17, 20, "Python");
        System.out.println(sb);// How are you ,is Python your brother?

        sb = sb.reverse();
        System.out.println(sb);// ?rehtorb ruoy nohtyP si, uoy era woH 
        System.out.println(sb.reverse());// How are you ,is Python your brother?

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());//16
        sb1.append("I am Hasan");
        System.out.println(sb1.capacity());//16
        sb1.append("I am only 25");
        System.out.println(sb1.capacity());//34
    }

}
