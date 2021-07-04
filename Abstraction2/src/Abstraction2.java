
public class Abstraction2 {

    public static void main(String[] args) {
        Bank b;
        b=new ONE_Bank();
        System.out.println("Interest Rate of One Bank is "+b.get_interest()+"%");
        
        b=new SBAC();
        System.out.println("Interest Rate of SBAC Bank is "+b.get_interest()+"%");
    }

}

abstract class Bank {

    abstract int get_interest();

}

class ONE_Bank extends Bank{

    @Override
    int get_interest() {
        return 8;
    }  
    
}

class SBAC extends Bank{

    @Override
    int get_interest() {
        return 9;
    }  
    
    
}