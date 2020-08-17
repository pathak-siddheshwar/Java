//demonstrating ArrayList
import java.util.*;
import java.io.*;
import java.lang.*;
class Student{
    private String name;
    private int id;
    private String favSubject;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void favSubject(String favSubject)
    {
        this.favSubject=favSubject;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getFavSubject(){
        return favSubject;
    }
}


class Example1{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        s1.setId(1);
        s2.setId(2);
        s3.setId(3);
        s4.setId(4);
        s1.setName("shivanya");
        s2.setName("arnav");
        s3.setName("vatsala");
        s4.setName("khushi");
        s1.favSubject("English");
        s2.favSubject("Science");
        s3.favSubject("Art");
        s4.favSubject("Hindi");
        ArrayList<Student> a=new ArrayList<Student>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        System.out.println("Student details are: ");
        System.out.println(a.size());   

        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).getId()+" "+a.get(i).getName()+" "+a.get(i).getFavSubject());
        }
        System.out.println("after replacing arnav");
    }
}
