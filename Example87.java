//demonstrating custom wrapper class in java
class Converter{
    private int i;
    Converter(){}
    Converter(int i)
    {
        this.i=i;
    }

    public void setValue(int i)
    {
        this.i=i;
    }
    public int getValue()
    {
        return i;
    }
    public String toGetString()
    {
        return Integer.toString(i);
    }
}
public class Example87{
    public static void main(String[] args)
    {
        Converter c=new Converter(458934689);
       // c.setValue();
        String s=c.toGetString();
        System.out.println(s.charAt(3));

    }
}