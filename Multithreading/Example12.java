//demonstrating garbage collection in java
public class Example12 {
    public void finalize(){
        System.out.println("the garbage is collected");
    }
    public static void main(String[] args)
    {
        Example12 e1=new Example12();
        Example12 e2=new Example12();
        e1=null;
        e2=null;
        System.gc();
    }
}