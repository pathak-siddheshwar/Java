//multiple inheritance
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

class BabyDog extends Dog{
    void cry(){
        System.out.println("little puppies cry...");
    }
}

class Example67{
    public static void main(String[] args){
        BabyDog b=new BabyDog();
        b.eat();
        b.bark();
        b.cry();
    }
}