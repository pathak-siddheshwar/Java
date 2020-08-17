//demonstration of abstract class in java
abstract class Car{
    Car(){
        System.out.println("it's a car");
    }
    void fourWheeler(){
        System.out.println("Every car is fourwheeler");
    }
    abstract void run();
}

class Verna extends Car{
    Verna(){
        System.out.println("hello guys its verna");
    }
    void run(){
        System.out.println("verna is running");
    }
    {
        System.out.println("cars are love");
    }
}
public class Example81 {
    public static void main(String[] args)
    {
        Verna c=new Verna();
        c.fourWheeler();
        c.run();
    }
}