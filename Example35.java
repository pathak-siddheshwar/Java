class Person{
    String name,dob;
    void set(String name,String dob)
    {
        this.name=name;
        this.dob=dob;
    }
}


class Teacher extends Person{
    double salary;
    String sub;
    void setTeacher(String name,String dob,double salary,String sub)
    {
        set(name,dob);
        this.salary=salary;
        this.sub=sub;
    }
    void getDetails(){
        System.out.println("the teacher details: ");
        System.out.println(name+" "+dob+" "+salary+" "+sub);
    }
}

class Student extends Person{
    int id;
    void setStudent(String name,String dob,int id)
    {
        set(name,dob);
        this.id=id;
    }
    // void getDetails(){
    //     System.out.println("the student details: ");
    //     System.out.println(name+" "+dob+" "+id);
    // }
}


class Cstudent extends Student{
    String Cname,year;
    void setC(String name,String dob,int id,String Cname,String year)
    {
        setStudent(name, dob, id);
        this.Cname=Cname;
        this.year=year;
    }
    void studentDetails()
    {
        System.out.println("the student details are as follows: ");
        System.out.println(name+" "+dob+" "+id+" "+Cname+" "+year);
    }
}


class Example35{
    public static void main(String[] s){
        Teacher t=new Teacher();
        t.setTeacher("hemant","14-02-79",70000,"dbms");
        t.getDetails();
        Cstudent c=new Cstudent();
        c.setC("bose","02-11-98",2011570,"graphic era university","fourth");
        c.studentDetails();
    }
}