package inheritproton;

public class ProtonX50 extends Proton
{
    private String welcomeX50;
    private String openPanoramic;
    private String closedPanoramic;
    private String semiAutomaticDriving;
    private String name;
    private String color;
    
    ProtonX50()
    {
        this.welcomeX50 = "X50";
        this.openPanoramic = "Panoramic Screen opened!";
        this.closedPanoramic = "Panoramic Screen Closed!";
        this.semiAutomaticDriving = "Semi Automatic Driving Initialized!";
        
    }
    
    ProtonX50(String a, String b, String c, String d, String e, String f)
    {
        this.welcomeX50 = a;
        this.openPanoramic = b;
        this.closedPanoramic = c;
        this.semiAutomaticDriving = d;
        this.name = e;
        this.color = f;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void openPanoramic()
    {
        System.out.println(openPanoramic);
    }
    
    public void closedPanoramic()
    {
        System.out.println(closedPanoramic);
    }
    
    public void semiAutomaticDriving()
    {
        boolean switchOn = true;
        
        System.out.println(semiAutomaticDriving);
    }
    
    public void setColor(String newColor)
    {
        this.color = newColor;
    }
    
    public String getColor()
    {
        return this.color;
    }
}
