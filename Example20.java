import java.util.Scanner;
import java.util.Arrays;
class Example20{
    public static void main(String[] s)
    {
        int[] a=new int[]{2,1,5,3,5};
        int sum=0,i,j;
        float av;
        for(i=0;i<a.length;i++)
            sum+=a[i];
        av=sum/a.length;
        System.out.println(sum);
        System.out.println(av);
        System.out.println("the sorted one:");
        Arrays.sort(a);
        for(i=0;i<a.length;i++)
            System.out.println(a[i]);

    }
}