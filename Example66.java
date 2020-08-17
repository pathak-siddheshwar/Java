//single inheritance
class Animal{
    void eat(){
        System.out.println("all animals eat");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dogs bark");
    }
}


class Example66{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}