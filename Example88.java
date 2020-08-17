//returning the sum of an array using recursion in java
import java.util.*;
public class Example88 {
    static int summation(int a[],int sum,int length)
    {
        if(length<0) return 0;
        return sum+a[length]+summation(a,sum,length-1);
    }
    public static void main(String[] args)
    {
        int[] a=new int[]{1,23,4,3,4};
        int length=a.length,sum=0;
        System.out.println(summation(a,sum,length-1));
    }
}