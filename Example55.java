import java.util.Scanner;

public class Example55 {
    public static void main(String args[] ) throws Exception {
        /* Do not alter code in main method */
       Shirt[] shirts = new Shirt[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<5;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }
        
        
       
        double price = sc.nextDouble();
        
        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));            
        }
        
        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);
        
        for(Shirt s: result)
        {
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
        }
    }
    
    /* implement your methods here*/
    public static double getDiscountPrice(Shirt s)
    {
        double temp;
        if(s.gender=='m')
        {
            temp=(0.1)*s.price;
            return s.price-temp;
        }
        else if(s.gender=='f')
        {
            temp=(0.2)*s.price;
            return s.price-temp;
        }
        else if(s.gender=='u')
        {
            temp=(0.3)*s.price;
            return s.price-temp;
        }
        return s.price;
    }

    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirt,double price)
    {
        int i,count=0;
        for(i=0;i<shirt.length;i++)
        {
            if(shirt[i].price>price)
                count++;
        }
        int j=0;
        Shirt[] res=new Shirt[count];
        for(i=0;i<shirt.length;i++)
        {
            if(shirt[i].price>price)
            {
                res[j]=shirt[i];
                j++;
            }
        }
        Shirt temp;
        for(i=0;i<count-1;i++)
        {
            for(j=i+1;j<count;j++)
            {
                if(res[i].price>res[j].price)
                {
                    temp=res[i];
                    res[i]=res[j];
                    res[j]=temp;
                }
            }
        }
        return res;
    }
}

class Shirt
{
    //define the class as per details shared in the question
    int tag;
    String brand;
    double price;
    char gender;
    Shirt(int tag,String brand,double price,char gender)
    {
        this.tag=tag;
        this.brand=brand;
        this.price=price;
        this.gender=gender;
    }
    int getTag()
    {
        return tag;
    }
    String getBrand(){
        return brand;
    }
    double getPrice(){
        return price;
    }
    char getGender(){
        return gender;
    }
}