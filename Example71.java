//method overriding
class Bank{
    int getInterestRate(){
        return 0;
    }
}
class SBI extends Bank{
    int getInterestRate(){
        return 24;
    }
}
class BOB extends Bank{
    int getInterestRate(){
        return 3;
    }
}

class Example71{
    public static void main(String[] args){
        SBI s=new SBI();
        BOB b=new BOB();
        System.out.println("Interest rate of SBI is: "+s.getInterestRate());
        System.out.println("Interest rate of BOB is: "+b.getInterestRate());
    }
}