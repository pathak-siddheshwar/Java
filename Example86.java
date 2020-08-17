//demonstrating autoboxing and unboxing in java
import java.util.*;
import java.lang.*;
public class Example86 {
    public static void main(String[] args){
        //autoboxing
        int a=3; 
        Integer i=a;
        System.out.println(i);
        //unboxing
        int b=i;
        System.out.println(b);
    }
}