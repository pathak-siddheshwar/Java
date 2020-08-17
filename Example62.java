//this keyword to invoke current class method
class thisMethod{
    void one(){System.out.println("this is one");}
    void two(){
        System.out.println("this is two");
        this.one();
    }
}


class Example62{
    public static void main(String[] args)
    {
        thisMethod t=new thisMethod();
        t.two();
    }
}