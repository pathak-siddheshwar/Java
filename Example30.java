class Example30{
    static double powerInt(int x,int y){
        double a=x;
        double b=y;
        return Math.pow(a,b);
    }

    static double powerDouble(double x,int y){
        double b=y;
        return Math.pow(x,b);
    }

    public static void main(String[] s){
        System.out.println("the integer power "+powerInt(2,3));
        System.out.println("the double power "+ powerDouble(2, 4));
    }
}