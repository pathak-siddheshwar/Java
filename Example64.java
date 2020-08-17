//this to pass as an argument 
class ThisArgument{
    void method(ThisArgument t)
    {
        System.out.println("passed successfully");
    }
    void passing(){
        method(this);
    }
}

class Example64{
    public static void main(String[] args)
    {
        ThisArgument t=new ThisArgument();
        t.passing();
    }
}