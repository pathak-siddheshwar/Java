//demonstrating encapsulation in java

public class Example83 {
    private String name;
    private String quality;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setQuality(String quality)
    {
        this.quality=quality;
    }
    public String getName()
    {
        return name;
    }
    public String getQuality(){
        return quality;    
    }
}