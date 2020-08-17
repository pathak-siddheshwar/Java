//hierarical inheritance

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

class Cat extends Animal{
    void meow(){
        System.out.println("cats meow");
    }
}

class Example68{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
        Cat c=new Cat();
        c.eat();
        c.meow();
    }
}