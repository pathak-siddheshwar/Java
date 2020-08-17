import java.util.Scanner;
import java.util.Arrays;
class Example24{
    public static void main(String[] s)
    {
       int max1=0,max2=0;
       int[] a= new int[]{101,49,50,51,52,97};
       for(int i=0;i<a.length;i++)
       {
           if(max1<a[i])
            max1=a[i];       
       }
       for(int i=0;i<a.length;i++)
            if(a[i]>max2 && a[i]!=max1)
                max2=a[i];
       
        System.out.println("the first and second largest elements are " +max1 +" "+max2);
    }
}