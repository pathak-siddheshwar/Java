class Example7{
    public static void main(String[] a)
    {
        char one='*';
        if(one>=48 && one<=57) System.out.println("digit");
        else if((one>=97 && one<=122)|| (one>=65 && one<=90)) System.out.println("alphabet");
        else System.out.println("special character");
    }
}