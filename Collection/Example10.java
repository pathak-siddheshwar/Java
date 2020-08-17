//demonstrating linkedhashmap
import java.util.*;
import java.lang.*;
import java.io.*;
class Car{
    String name,company;
    Car(String name,String company)
    {
        this.name=name;
        this.company=company;
    }   
}
public class Example10 {
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,Car> l=new LinkedHashMap<>();
        Car c1=new Car("verna","hyundai");
        Car c2=new Car("city","honda");
        Car c3=new Car("fortuner","toyota");
        l.put(1,c1);
        l.put(2,c2);
        l.put(3,c3);
        for(Map.Entry<Integer,Car> entry:l.entrySet()){
            int key=entry.getKey();
            Car c=entry.getValue();
            System.out.println(key+" details"); 
            System.out.println(c.name+" "+c.company);
        }
    }
}