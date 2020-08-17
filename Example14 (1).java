import java.util.Scanner;
class Example14{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to check prime");
        int n=s.nextInt();
        int flag=0;
        for(int i = 2; i <= n/2; ++i)
        {
            if(n%i == 0)
            {
                flag = 1;
                break;
            }
        }
            if (flag == 0)
              System.out.println("prime");
            else
              System.out.println("not prime");
    }
}