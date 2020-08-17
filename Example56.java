import java.util.*;
class Example56{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int id,yrs;
        double i,b;
        id=s.nextInt();
        s.nextLine();
        b=s.nextDouble();
        i=s.nextDouble();
        s.nextLine();
        yrs=s.nextInt();
        Account a=new Account(id,b,i);
        double result=calculateInterest(a,yrs);
        String str=String.format("%.3f",result);
        System.out.println(str);
    }
    public static double calculateInterest(Account a,int y)
    {
        return ((((a.interest/100)*y)+a.interest)*a.balance)/100;
    }
}

class Account{
    int id;
    double balance;
    double interest;
    Account(int id,double balance,double interest)
    {
        this.id=id;
        this.balance=balance;
        this.interest=interest;
    }
}