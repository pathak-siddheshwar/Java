//demonstrating toString() method
class Example98{  
    int rollno;  
    String name;  
    String city;  
     
    Example98(int rollno, String name, String city){  
    this.rollno=rollno;  
    this.name=name;  
    this.city=city;  
    }  
      
    public String toString(){//overriding the toString() method  
     return rollno+" "+name+" "+city;  
    }  
    public static void main(String args[]){  
      Example98 s1=new Example98(101,"Raj","lucknow");  
      Example98 s2=new Example98(102,"Vijay","ghaziabad");  
        
      System.out.println(s1);//compiler writes here s1.toString()  
      System.out.println(s2);//compiler writes here s2.toString()  
    }  
   } 