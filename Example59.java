//program to initialize one object from other
class Copying{
    String name;
    int id;
    Copying(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    Copying(Copying c)
    {
        this.name=c.name;
        this.id=c.id;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

class Example59{
    public static void main(String[] args)
    {
        Copying c=new Copying("siddheshwar pathak",1);
        Copying d=new Copying(c);
        c.display();
        d.display();
    }
}