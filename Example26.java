import java.util.Scanner;
import java.util.Arrays;
class Example26{
    public static void main(String[] s){
        int n,i,j=0,k=0,val,sum;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            val=sc.nextInt();
            a[i]=val;
        }
        for(i=0;i<n;i++)
            if(a[i]==6)
                j=i;
        for(i=0;i<n;i++)
            if(a[i]==7)
                k=i;
        System.out.println(j+" "+k);
        if(j<k)
        {
            sum=0;
            for(i=0;i<j;i++)
                sum+=a[i];
            for(i=k+1;i<n;i++)
                sum+=a[i];
        }
        else{
            sum=0;
            for(i=0;i<a.length;i++)
                sum+=a[i];
        }
        System.out.println(sum);
    }
}