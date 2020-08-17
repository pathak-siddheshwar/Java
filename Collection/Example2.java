//demonstrating linked list
import java.util.*;
import java.io.*;
import java.lang.*;
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Example2 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        LinkedList<Employee> a=new LinkedList<Employee>();
        Employee e1=new Employee(1,"sid",2030203);
        Employee e2=new Employee(2,"dev",34543);
        Employee e3=new Employee(3,"evil",3434);
        a.add(e1);
        a.add(e2);
        a.add(e3);
        int i;
        System.out.println("before removing");
        for(i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).id+" "+a.get(i).name+" "+a.get(i).salary);
        }
        a.remove(0);
        System.out.println("after removing");
        for(i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).id+" "+a.get(i).name+" "+a.get(i).salary);
        }
    }
}