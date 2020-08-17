//method overriding with exception handling in java
class Demo{
    void msg() throws Exception{ System.out.println("parent class throws parent class exception");}
}
class Sub_demo extends Demo{
    void msg() throws ArithmeticException{
        System.out.println("child");
    }
}
public class Example110 {
    public static void main(String[] args)
    {
        Sub_demo s=new Sub_demo();
        s.msg();
    }
}