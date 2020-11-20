package inheritproton;

public class Inheritproton {

 

    public static void main(String[] args) {
       ProtonX70 p1 = new ProtonX70();
       ProtonX50 p2 = new ProtonX50();
       ProtonSaga p3 = new ProtonSaga();
       
       
       p1.setName("Proton X70");                                            //Encapsulation
       System.out.println("Welcome to " + p1.getName());
       p1.setColor("White");                                                //Encapsulation and Polymorphism
       System.out.println("Your car color is set to: " + p1.getColor());
       p1.accelerate();
       p1.AI();
       p1.footSensor();
       
       System.out.println("");
       
       p2.setName("Proton X50");
       System.out.println("Welcome to " + p2.getName());
       p2.setColor("Navy Blue");
       System.out.println("Your car color is set to: " + p2.getColor());
       p2.openPanoramic();
       p2.closedPanoramic();
       p2.semiAutomaticDriving();
       
       System.out.println("");
       
       p3.setName("Proton SAGA");
       System.out.println("Welcome to " + p3.getName());
       p3.setColor("Matte Black");
       System.out.println("Your car color is set to: " + p3.getColor());
       p3.accelerate();
       p3.airbags();
       p3.eco();
       
       
    }
}    

