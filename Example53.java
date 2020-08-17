import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Example53 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s=new Scanner(System.in);
        int id,noOfYears;
        double i,b;
        id=s.nextInt();
        //s.nextLine();
        b=s.nextDouble();
        i=s.nextDouble();
        noOfYears=s.nextInt();
        Account a=new Account(id,b,i);
        double res=calculateInterest(a,noOfYears);
        //System.out.println(res);
        System.out.println(new DecimalFormat("#0.000").format(res));
    }
    static double calculateInterest(Account acc,int years)
    {
        double temp,res;
        temp=(acc.interestRate/100)*(double)years;
        res=(temp+acc.interestRate)*10;
        return res;
    }
}

class Account{
   int id;
   double balance;
   double interestRate;
   Account(int id,double balance,double interestRate)
   {
       this.id=id;
       this.balance=balance;
       this.interestRate=interestRate;
   }
   int getId(){
       return id;
   } 
   double getBalance(){
       return balance;
   }
   double getInterestRate(){
       return interestRate;
   }
}