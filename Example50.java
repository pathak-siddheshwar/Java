abstract class Instrument{
    abstract void play();
}

class  Piano extends Instrument{
    void play(){
        System.out.println("Piano is playing tan tan tan");
    }
}

class Flute extends Instrument{
    void play(){
        System.out.println("Flute is playing toot toot toot");
    }
}

class Guitar extends Instrument{
    void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
}


class Example50{
    public static void main(String[] args) {
        String[] s=new String[]{"guitar","flute","piano","flute","guitar"};
        Instrument g=new Guitar();
        Instrument f=new Flute();
        Instrument p=new Piano();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=="guitar")
                g.play();
            else if(s[i]=="flute")
                f.play();
            else 
                p.play();
        }
    }
}

//after abstraction comes the other important topic and that is interfaces
//need to study it from a place where it's quite clear and only the important parts are highlighted
