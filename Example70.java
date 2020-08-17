//method overloading
class Overload{
    int sum(int a,int b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}

class Example70{
    public static void main(String[] args)
    {
        Overload o=new Overload();
        System.out.println(o.sum(45,34));
        System.out.println(o.sum(456,4656,77));
    }
}