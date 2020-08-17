//demonstrating call by reference in java
class Reference{
    int data;
    Reference(int data)
    {
        this.data=data;
    }
    void changeValue(Reference r)
    {
        r.data=r.data+233443;
    }
}
public class Example89 {
    public static void main(String[] args)
    {
        Reference r=new Reference(3453);
        System.out.println(r.data);
        r.changeValue(r);
        System.out.println(r.data);
    }
}