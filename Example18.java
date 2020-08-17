import java.util.Scanner;
class Example18
{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int temp=num;
        int  reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if(reversed==temp)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}