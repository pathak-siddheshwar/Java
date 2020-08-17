//demonstrating exception propagation in java (for unchecked exceptions)
public class Example106 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println("Exception handled");
        }
    }
    public static void main(String[] args)
    {
        Example106 e=new Example106();
        e.p();
        System.out.println("rest of the code resides here");   
    }
}