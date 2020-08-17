import java.util.Scanner;
class Example42{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str;
        str=s.nextLine();
        System.out.println(str.substring(1,str.length()-1));
    }
}