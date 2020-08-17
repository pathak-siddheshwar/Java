//static binding
class Love{
    void language(){
        System.out.println("love has no language");
    }
} 
public class Example79 {
    public static void main(String[] args)
    {
        Love l=new Love();
        l.language();
    }
}