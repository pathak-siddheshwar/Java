class Animal{
    String name;
    Animal(String name)
    {
        this.name=name;
    }
    void eat(String food)
    {
        System.out.println("the animal eats "+ food);
    }
    void sleep(int time)
    {
        System.out.println("the animal sleeps for "+time+" hours");
    }
}

class Bird extends Animal{
    Bird(String name){
        super(name);
    }
    void fly()
    {
        System.out.println("the bird can fly");
    }
}


class Example33{
    public static void main(String[] a)
    {
        Animal s=new Animal("peacock");
        Bird b=new Bird("pigeon");
        System.out.println("name of animal: "+s.name);
        s.eat("worms");
        s.sleep(4);
        System.out.println("name of bird: "+b.name);
        b.eat("grains");
        b.sleep(6);
        b.fly();
    }
}