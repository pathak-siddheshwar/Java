import java.util.Scanner;
class Example15{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            sum+=temp%10;
            temp=temp/10;
        }
        System.out.println(sum);
    }
}