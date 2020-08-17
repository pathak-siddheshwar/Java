//superb example to proove that java only supports method overriding data members cannot be overridden
class SuperClass
{
    String myString = "String in SuperClass";

    public void myMethod()
    {
        System.out.println("Method in SuperClass");
    }
}

class SubClass extends SuperClass
{
    String myString = "String in SubClass";

    public void myMethod()
    {
        System.out.println("Method in SubClass");
    }
}

class Example78
{
    public static void main(String[] args)
    {
        SuperClass test = new SubClass();
            // object test is an instance of SubClass
            // but I am telling the compiler to treat it as SuperClass

        test.myMethod();
        System.out.println(test.myString);

    }
}