 class Shape{
     void draw(){
         System.out.println("Drawing shape");
     }
     void erase(){
         System.out.println("Erasing shape");
     }
 }

 class Circle extends Shape{
     void draw(){
         System.out.println("Drawing circle");
     }
     void erase(){
         System.out.println("Erasing circle");
     }
 }

 class Square extends Shape{
    void draw(){
        System.out.println("Drawing square");
    }
    void erase(){
        System.out.println("Erasing square");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing triangle");
    }
    void erase(){
        System.out.println("Erasing triangle");
    }
}

class Example37{
    public static void main(String[] a)
    {
        Shape c=new Circle();
        Shape s=new Square();
        Shape t=new Triangle();
        c.draw();
        s.draw();
        t.draw();
        c.erase();
        s.erase();
        t.erase();
    }
}