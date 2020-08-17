import java.util.Scanner;
class Example47{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        str=s.nextLine();
        int n;
        n=s.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(str.substring(n-1,str.length()));
    }
}