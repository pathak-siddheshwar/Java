import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Example54{
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s=new Scanner(System.in);
        Book[] b=new Book[4];
        int i,id;
        String key,title,author;
        double price;
        for(i=0;i<4;i++)
        {
            id=s.nextInt();
            s.nextLine();
            title=s.nextLine();
            author=s.nextLine();
            price=s.nextDouble();
            b[i]=new Book(id,title,author,price);
        }
        // String parameter;
        System.out.println("enter the key to proceed");
        s.nextLine();
        key=s.nextLine();
        Book[] result=searchTitle(key,b);
        for(i=0;i<result.length;i++)
            System.out.println(result[i].id+" "+result[i].title);
    }
    public static Book[] searchTitle(String key,Book[] b)
    {
        int count=0,i,j;
        for(i=0;i<b.length;i++)
        {
            if(b[i].title.toLowerCase().contains(key.toLowerCase()))
                    count++;
        }
        System.out.println(count);
        Book[] res=new Book[count];
        j=0;
        for(i=0;i<b.length;i++)
        {
             if(b[i].title.toLowerCase().contains(key.toLowerCase()))
             {
                 res[j]=b[i];
                 j++;
             }
        }
        Book temp;
        for(i=0;i<count-1;i++)
        {
             for(j=i+1;j<count;j++)
             {
                 if(res[i].id>res[j].id)
                 {
                     temp=res[i];
                     res[i]=res[j];
                     res[j]=temp;
                 }
             }
        }
        return res;
    }
}

class Book
{
    int id;
    String title;
    String author;
    double price;
    Book(int id,String title,String author,double price)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    int getId(){
        return id;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    double getPrice(){
        return price;
    }
}