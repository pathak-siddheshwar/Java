//the encryption program, refer to the screenshot 
import java.util.*;
import java.io.*;
class Example74{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Vector<Integer> v=new Vector();
        Vector<Integer> result=new Vector();
        //int[] a=new int[10000];
        String str,input;
        //char temp;
        int i,label=0,j;
        System.out.println("enter the string pattern to proceed...");
        str=s.nextLine();
        int l=str.length(),count=0;
        for(i=0;i<l;i++)
        {
            //temp=str.charAt(i);
            if(str.charAt(i)==' ' || str.charAt(i)==';')
            {
                input="";
                for(j=label;j<i;j++)
                {
                    input+=str.charAt(j);
                }
                v.add(Integer.parseInt(input));
                label=i+1;
            }
        }
        int index=2,primes=0;
        for(i=0;i<v.size();i++)
        {
            if(prime(v.get(i),index))
            {
                result.add(v.get(i));
                primes++;     
            }
                   
        }
        Collections.sort(result);
        int answer=primes+result.get(result.size()-2);
        System.out.println(answer);
    }
    static boolean prime(int n,int i)
    {
        if(n==0) return false;
        if(n==1) return false;
        if(n==2) return true;
        if(n%i==0) return false;
        if(i*i>=n) return true; 
        return prime(n,i+1);
    }
}