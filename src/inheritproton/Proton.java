package inheritproton;

    public class Proton 
    {
        
        String welcome;
        String accelerate;
        String windowsUP;
        String windowsDOWN;
        String wiperON;
        String wiperOFF;
        String color;
        
        Proton()
        {
            this.welcome = "Hello, welcome to Proton ";
            this.accelerate = "Vroom Vroom";
            this.windowsUP = "Windows Scrolled Up!";
            this.windowsDOWN = "Windows Scrolled Down!";
            this.wiperON = "Wiper is on!";
            this.wiperOFF = "Wiper is off!";
            this.color = "Black";
        }
        
        Proton(String a, String b, String c, String d, String e, String f, String g)
        {
            this.welcome = a;
            this.accelerate = b;
            this.windowsUP = c;
            this.windowsDOWN = d;
            this.wiperON = e;
            this.wiperOFF = f;
            this.color = g;
        }
        public void welcome()
        {
            System.out.print(welcome);
        }
        
        public void accelerate()
        {
            System.out.println(accelerate);
        }
        
        public void windowsDown()
        {
            System.out.println(windowsDOWN);
        }
        
        public void windowsUp()
        {
            System.out.println(windowsUP);
        }
        
        public void wiperOn()
        {
            System.out.println(wiperON);
        }
        
        public void wiperOff()
        {
            System.out.println(wiperOFF);
        }
        
        public void color()                                 //Polymorphism     
        {
            System.out.println(color);
        }
        
        public void run()
        {
            System.out.println("This vehicle is running!");
        }
        
}
