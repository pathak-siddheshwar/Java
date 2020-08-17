//methods of string class
public class Example96 {
    public static void main(String[] args)
    {
        String test="this is a test string";
        System.out.println(test.charAt(3));
        System.out.println("hello".compareTo("hemlo"));
        System.out.println(test.concat("||||"));
        if(test.contains("string"))
            System.out.println("search successful");
        if(test.endsWith("g"))
            System.out.println("string ends with g");
        if("RDJ".equals("rdj"))
            System.out.println("rdj and RDJ are equal");
        else
            System.out.println("rdj and RDJ are not equal");
        if("RDJ".equalsIgnoreCase("rdj"))
            System.out.println("rdj and RDJ are equal");
        else
            System.out.println("rdj and RDJ are not equal");

        String ss=String.format("value is %.3f",45.465657);//important concept for operating with the number of digits
        //after decimal concept
        System.out.println(ss);
        char[] ch=new char[10];
        try{
            test.getChars(0,5,ch,0);
            System.out.println(ch);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(test.indexOf("string"));
        System.out.println(test.isEmpty());
        System.out.println(String.join("@",test));
        System.out.println(test.length());
        System.out.println(test.replace("string","sequence of characters"));
        System.out.println(test.split("\\s"));
        System.out.println(test.startsWith("this"));
        System.out.println(test.toUpperCase());
        System.out.println("  trimmed string   ".trim());
        int i=10;
        System.out.println(String.valueOf(10)+"number ");
    }
}