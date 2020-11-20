package inheritproton;

public class ProtonSaga extends Proton
{
    private String welcomeSAGA;
    private String airbags;
    private String eco;
    private String name;
    private String color;
    
    ProtonSaga()
    {
        this.welcomeSAGA = "SAGA";
        this.airbags = "Airbags Initialized!";
        this.eco = "ECO System initialized!";
    }
    
    ProtonSaga(String a, String b, String c, String d, String e)
    {
        this.welcomeSAGA = a;
        this.airbags = b;
        this.eco = c;
        this.name = d;
        this.color = e;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void airbags()
    {
        boolean crash = true;
        
        System.out.println(airbags);
    }
    
    public void eco()
    {
        boolean driveSlow = true;
        
        System.out.println(eco);
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
