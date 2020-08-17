//dynamic binding
class Love{
    void language(){
        System.out.println("love has no language");
    }
}
class HowToTalkThen extends Love{
    void language(){
        System.out.println("love has no language as it can be felt deep inside");
    }
}
public class Example80 {
    public static void main(String[] args)
    {
        Love l=new HowToTalkThen();
        l.language();
    }
}