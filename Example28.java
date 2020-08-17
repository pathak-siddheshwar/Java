import java.util.Scanner;
import java.util.Arrays;
class Example28{
    public static void main(String[] s)
    {
        int[][] a=new int[3][3];
        int max=0,i,j,k=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=Integer.parseInt(s[k]);
                k++;
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]>max)
                    max=a[i][j];
            }
        }
        System.out.println(max);
    }
}