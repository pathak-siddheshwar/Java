class Employee extends Person{
    double salary;
    String doj;
    Employee(String name,double salary,String doj)
    {
        super(name);
        this.salary=salary;
        this.doj=doj;
    }
    void getDetails(){
        
        System.out.println(name+" "+salary+" "+doj);
    }
}



class Example34{
    public static void main(String[] s)
    {
        Employee e=new Employee("rocket singh",40000,"14-02-2014");
        System.out.println("the details of the employee: ");
        e.getDetails();
        e.name="rampal";
        e.salary=50000;
        e.doj="20-03-2005";
        e.getDetails();
    }
}