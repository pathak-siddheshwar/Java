//demonstrating static variable in java
class StaticVariable{
    static String Cname="graphic era university";
    String Sname;
    StaticVariable(String sname){
        this.Sname=sname;
    }
    void display()
    {
        System.out.println(Sname+" "+"of"+" "+Cname);
    }
}

class Example60{
    public static void main(String[] args)
    {
        StaticVariable s=new StaticVariable("Siddheshwar");
        StaticVariable v=new StaticVariable("Vatsala");
        s.display();
        v.display();
    }
}