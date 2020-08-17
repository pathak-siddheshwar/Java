import java.util.Scanner;
class Example41{
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        if(s.length()%2==0)
        {
            System.out.println(s.substring(0,s.length()/2));
        }
        else{
            System.out.println("null");
        }
    }
}