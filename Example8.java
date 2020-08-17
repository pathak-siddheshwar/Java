class Example8{
    public static void main(String[] a)
    {
        int age=Integer.parseInt(a[1]);
        if(age>=1 && age<=58 && a[0].equals("female")) System.out.println("8.2%");
        else if(age>=59 && age<=100 && a[0].equals("female")) System.out.println("9.2%");
        else if(age>=1 && age<=58 && a[0].equals("male")) System.out.println("8.4%");
        else if(age>=59 && age<=100 && a[0].equals("male")) System.out.println("10.5%");
    }
}