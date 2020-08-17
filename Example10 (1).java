import java.util.Scanner;
class Example10{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        String color;
        switch(c)
        {
            case 'R':
                color="red";
                break;
            case 'G':
                color="green";
                break;
            case 'B':
                color="blue";
                break;
            default:
                color="invalid choice";
                break;
        }
        System.out.println(color);
    }
}