import java.util.*;
abstract class Compartment{
    public abstract String notice();
}

class Firstclass extends Compartment{
    public String notice(){
        return "This is first class";
    }
}

class Ladies extends Compartment{
    public String notice(){
        return "This is ladies class";
    }
}

class General extends Compartment{
    public String notice(){
        return "This is general class";
    }
}


class Luggage extends Compartment{
    public String notice(){
        return "This is luggage class";
    }
}

class Example49{
    public static void main(String[] args) {
        Firstclass f=new Firstclass();
        Ladies l=new Ladies();
        General g=new General();
        Luggage lu=new Luggage();
        String[] s=new String[10];
        int i,num;
        double n;
        String[] decider=new String[]{"firstclass","ladies","general","luggage"};
        for(i=0;i<10;i++)
        {
            n=(Math.random()*4);
            num=(int)n;
            s[i]=decider[num];
        }
        for(i=0;i<10;i++)
        {
            if(s[i]=="firstclass")
                System.out.println(f.notice());
            else if(s[i]=="ladies")
                System.out.println(l.notice());
            else if(s[i]=="general")
                System.out.println(g.notice());
            else if(s[i]=="luggage")
                System.out.println(lu.notice());
        }
    }
}