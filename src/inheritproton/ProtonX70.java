package inheritproton;

public class ProtonX70 extends Proton
{
    private String welcomeX70;
    private String AI;
    private String footSensor;
    private String name;
    private String color;
    
    ProtonX70()
    {
        this.welcomeX70 = "X70";
        this.AI = "Artificial Intellegence initialized.";
        this.footSensor = "Car Trunk Opened!";
    }
    
    ProtonX70(String a, String b, String c, String d, String e)
    {
        this.welcomeX70 = a;
        this.AI = b;
        this.footSensor = c;
        this.name= d;
        this.color = e;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void AI()
    {
        System.out.println(AI);        
    }
    
    public void footSensor()
    {
        boolean footScanned = true;
        
        System.out.println(footSensor);
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
