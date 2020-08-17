//demonstrating the conecpt of array of objects
import java.util.*;
import java.lang.*;
class Example52{
    public static void main(String[] args) {
        Sim[] sims = new Sim[3];
        Scanner s = new Scanner(System.in);
        String name;
        int i,marks,id,key;
        System.out.println("Enter the values");
        for(i=0;i<sims.length;i++)
        {
            id=s.nextInt();
            s.nextLine();
            name=s.nextLine();
            marks=s.nextInt();
            sims[i]=new Sim(id,name,marks);
        }
        System.out.println("the values are: ");
        for(i=0;i<sims.length;i++)
        {
             System.out.println(sims[i].getId()+" " +sims[i].getName()+" "+sims[i].getMarks());            
        }
        System.out.println("enter the key to change the values");
        key=s.nextInt();
        Sim[] res=newRectifier(sims,key);
        System.out.println("the one's with a distinction are :");
        for(i=0;i<res.length;i++)
        {
             System.out.println(res[i].getId()+" " +res[i].getName()+" "+res[i].getMarks());            
        }

    }

    static Sim[] newRectifier(Sim[] sims,int key)
    {
        // int i,j;
        // Sim s;
        // for(i=0;i<sims.length-1;i++)
        // {
        //     for(j=i+1;j<sims.length;j++)
        //     {
        //         if(sims[i].marks>sims[j].marks)
        //         {
        //             s=sims[i];
        //             sims[i]=sims[j];
        //             sims[j]=s;
        //         }
        //     }
        // }
        //return sims;
        int i,count=0;
        for(i=0;i<sims.length;i++)
        {
            if(sims[i].marks>key)
                count++;
        }
        Sim[] result=new Sim[count];
        int j=0;
        for(i=0;i<sims.length;i++)
        {
            if(sims[i].marks>key)
            {
                result[j]=sims[i];
                j++;
            }
        }
        return result;
    }

}

class Sim{
    String name;
    int id;
    int marks;
    Sim(int id,String name,int marks)
    {
         this.id=id;
         this.name=name;
         this.marks=marks;
    }
    String getName()
    {
         return name;
    }
    int getId(){
        return id;
    }
    int getMarks(){
        return marks;
    }
    
}