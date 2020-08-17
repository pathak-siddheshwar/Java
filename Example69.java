//aggregation 
class Operation{
    int square(int n)
    {
        return n*n;
    }
}

class Circle{
    Operation op;//aggregation
    double pi=3.14;
    double area(int radius){
        op=new Operation();
        int r=op.square(radius);
        return r*pi;
    }
}


class Example69{
    public static void main(String[] args)
    {
        Circle c=new Circle();
        System.out.println(c.area(5));
    }
}