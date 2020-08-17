//demonstrating final keyword
public class Example76 {
    final int a=2000;
    Example76(){
        a=4565;
    }

    public static void main(String[] args)
    {
        Example76 e=new Example76();
        System.out.println(e.a);            
    }
}