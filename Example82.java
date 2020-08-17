//one of the most important topics in java
//demostration of interface
interface Sports{
    void name();
    void noOfPlayers();
    void popularity();
}

interface TableTennis extends Sports{
    void mostEffectiveShot();
}

interface Academics{
    void course();
    void importance();
}

class Student implements TableTennis,Academics{
    public void name() {
        System.out.println("the name of the sport he plays is table tennis");
    }
    public void noOfPlayers(){
        System.out.println("the number of players required for the game are 2");
    }
    public void popularity(){
        System.out.println("it is quite popular in china");
    }
    public void course(){
        System.out.println("he loves coding");
    }
    public void importance(){
        System.out.println("coding is really important for computer science and devlopment in the IT sector");
    }
    public void mostEffectiveShot(){
        System.out.println("most effective shot in table tennis is topspin");
    }
}

public class Example82 {
    public static void main(String[] args)
    {
        Student s=new Student();
        s.name();
        s.noOfPlayers();
        s.popularity();
        s.mostEffectiveShot();
        s.course();
        s.importance();
    }
}