//TreeSet with user defined object requires to implement comparable interface
import java.util.*;
import java.io.*;
import java.lang.*;
class Book implements Comparable<Book>{
    int id,quantity;
    String name,author;
    Book(int id,String name,String author,int quantity)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.quantity=quantity;
    }
    public int compareTo(Book b)
    {
        if(id>b.id)
            return 1;
        else if(id<b.id)
            return -1;
        else 
            return 0;
    }
}
public class Example6 {
    public static void main(String[] args)
    {
        TreeSet<Book> t=new TreeSet<Book>();
        Book b1=new Book(1343,"harry potter","jk rowling",50234545);
        Book b2=new Book(145,"who moved my cheese","unknown",5023);
        Book b3=new Book(18784,"two states","chetan bhagat",502);
        Book b4=new Book(1,"kumkum bhagya","kumkum",52);
        t.add(b1);
        t.add(b2);
        t.add(b3);
        t.add(b4);
        for(Book b:t){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
        }
    }
}