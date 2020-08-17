class Example9{
    public static void main(String[] a)
    {
        char alpha='Q';
        if(Character.isUpperCase(alpha)){
            System.out.println(Character.toLowerCase(alpha));
        }
        else
        {
            System.out.println(Character.toUpperCase(alpha));
        }
    }
}