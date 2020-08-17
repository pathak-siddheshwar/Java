class Fruit{
    String name,color;
    void set(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    void eat(){
        System.out.println("In base class");
    }
}


class Apple extends Fruit{
    void set(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    void eat()
    {
        System.out.println(name+" "+color);
    }
}


class Orange extends Fruit{
    void set(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    void eat()
    {
        System.out.println(name+" "+color);
    }
}


class Example36{
    public static void main(String[] s)
    {
        Fruit f=new Fruit();
        Apple a=new Apple();
        Orange o=new Orange();
        a.set("apple","red");
        o.set("orange","orange");
        f.eat();
        a.eat();
        o.eat();
    }
}