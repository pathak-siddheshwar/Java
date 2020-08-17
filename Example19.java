class Example19{
    public static void main(String[] a)
    {
        int i,number=0;
        for(i=6;i<1000;i++)
        {
            if(i%2==0 && i%3==0 && i%5==0)
            {
                number=i;
                break;
            }
        }
        System.out.println(number);
    }
}