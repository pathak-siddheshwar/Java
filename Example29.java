import java.util.Scanner;
class Example29{
    double l,b,h;
    Example29(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public double volume(){
        return l*b*h;
    }

    //calling the driver method
    public static void main(String[] s)
    {
        Example29 e=new Example29(2.0,3.0,4.0);
        System.out.println("the volume of the box is:"+ e.volume());

    }
}