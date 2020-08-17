//demonstrate object cloning
//still requires some work 
public class Example85 implements Cloneable {
    String name;
    Example85(String name)
    {
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args)
    {
        try{
            Example85 e=new Example85("siddheshwar");
            Example85 f=(Example85)e.clone();
            System.out.println("the name is "+f.name);
        }
        catch(CloneNotSupportedException c)
        {
            System.out.println(c);
        }
    }
}

