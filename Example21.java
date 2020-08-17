import java.util.Scanner;
import java.util.Arrays;
class Example21{
    public static void main(String[] s)
    {
        int[] a=new int[]{1,2,3,4,5};
        int i,j,max=0;
        for(i=0;i<a.length;i++)
            if(max<a[i])
                max=a[i];
        System.out.println(max);
    }
}