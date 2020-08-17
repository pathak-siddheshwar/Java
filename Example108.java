import java.io.IOException;

//demonstrating throws keyword
public class Example108 {
    void m() throws IOException {
        throw new IOException("it is thrown");
    }

    void n() throws IOException {
        m();
    }
    void p(){
        try{
            m();
        }
        catch(Exception e)
        {
            System.out.println("is handled");
        }
    }
    public static void main(String[] args)
    {
        Example108 e=new Example108();
        e.p();
        System.out.println("the code runs normally now");
    }
}