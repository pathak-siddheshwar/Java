abstract class GeneralBank{
    abstract void getSavingsIntrestRate(double rate);
    abstract void getFixedDepositIntrestRate(double rate);
}

class ICICIBank extends GeneralBank{
    void getSavingsIntrestRate(double rate)
    {
        System.out.println("the rate is: "+rate+"%");
    }
    void getFixedDepositIntrestRate(double rate)
    {
        System.out.println("the rate is: "+rate+"%");
    }
}

class KotMBank extends GeneralBank{
    void getSavingsIntrestRate(double rate)
    {
        System.out.println("the rate is: "+rate+"%");
    }
    void getFixedDepositIntrestRate(double rate)
    {
        System.out.println("the rate is: "+rate+"%");
    }
}


class Example48{
    public static void main(String[] args) {
        ICICIBank i=new ICICIBank();
        KotMBank k=new KotMBank();
        GeneralBank g=new ICICIBank();
        i.getSavingsIntrestRate(4);
        i.getFixedDepositIntrestRate(8.5);
        k.getSavingsIntrestRate(6);
        k.getFixedDepositIntrestRate(9);
        g.getSavingsIntrestRate(4);
        g.getFixedDepositIntrestRate(8.5);
    }
}