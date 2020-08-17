//super keyword demonstration
//to access parent class instance variable method and constructor
class Person{
    int id;
    String name;
    Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}

class Employee extends Person{
    int salary;
    Employee(int id,String name,int salary)
    {
        super(id,name);
        this.salary=salary;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }
}


class Example73{
    public static void main(String[] args)
    {
        Employee e=new Employee(1,"siddheshwar",50000);
        e.display();
    }
}