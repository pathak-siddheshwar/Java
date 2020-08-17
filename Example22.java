import java.util.Scanner;
import java.util.Arrays;
class Example22{
    public static void main(String[] s)
    {
        int[] a=new int[]{1,2,3,4,5};
        int res;
        Arrays.sort(a);
        res=Arrays.binarySearch(a,4);
        if(res<0)
            System.out.println("element not found");
        else
            System.out.println("element found at index "+res );
    }
}