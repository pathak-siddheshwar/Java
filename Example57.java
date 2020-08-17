//demonstrating the anonymous object in java
class Factorial{
    int fact(int n)
    {
        if(n==0) return 1;
        return  n*fact(n-1);
    }
}
class Example57{
    public static void main(String[] args)
    {
        System.out.println(new Factorial().fact(3));
    }
}