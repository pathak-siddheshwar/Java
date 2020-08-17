//demonstrating runtime polymorphism in java using upcasting
class Bank{
    float getRateOfinterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfinterest(){
        return 9485;
    }
}
class Axis extends Bank{
    float getRateOfinterest(){
        return 34809;
    }
}
public class Example77 {
    public static void main(String[] args)
    {
        Bank b1,b2;
    b1=new SBI();
    b2=new Axis();
    System.out.println(b1.getRateOfinterest());
    System.out.println(b2.getRateOfinterest());
    }
    
}