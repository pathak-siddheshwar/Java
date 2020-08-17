//to pass this keyword as an argument in constructor call
class B{
    A a;
    B(A a){
        this.a=a;
    }
    void display(){
        System.out.println(a.data);
    }
}
class A{
    int data=10;
    A(){
    B b=new B(this);
    b.display();
    }
}


class Example65{
    public static void main(String[] args)
    {
         A a=new A();
    }
}