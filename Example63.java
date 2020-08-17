//this to invoke current class constructor
class InvokeConstructor{
    InvokeConstructor(){
        System.out.println("this is the first constructor");
    }
    InvokeConstructor(int n){
        this();
        System.out.println(n);
    }
}

class Example63{
    public static void main(String[] args){
        InvokeConstructor i=new InvokeConstructor(345);
    }
}