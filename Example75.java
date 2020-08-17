//to demonstrate the instance initializer block
public class Example75 {
    int speed;
    Example75(){
        System.out.println("The speed is "+speed);
    }
    {speed=3445;}
    public static void main(String[] args)
    {
        Example75 e=new Example75();
        Example75 f=new Example75();
    }
}