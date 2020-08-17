import java.util.Scanner;
import java.util.Arrays;
class Example27{
    public static void main(String[] s){
        int[][] a=new int[2][2];
        int i,j,k=0;
        for(i=1;i>=0;i--)
        {
            for(j=1;j>=0;j--)
            {
                a[1-i][1-j]=Integer.parseInt(s[k]);
                k++;
            }
        }
        System.out.println("the matrix is:");
        for(i=1;i>=0;i--)
        {
            for(j=1;j>=0;j--)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}