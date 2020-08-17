//covariant return type
class A{
    A get(){return this;}
}

class B extends A{
    B get(){
        return this;
    }
    void message(){
        System.out.println("overriding the method by changing the return type");
    }
}

class Example72{
    public static void main(String[] args)
    {
        new B().get().message();
    }
}