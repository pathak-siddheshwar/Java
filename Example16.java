import java.util.Scanner;
class Example16{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        int i,j;
        int num=s.nextInt();
        for(i=1;i<=num;i++)
        {   
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}