//demonstrating java static block
class Example61{
    static{System.out.println("this is a static block and is executed before main");}
    public static void main(String[] args)
    {
        System.out.println("its main");
    }
}