

public class temp
{
    public static void main(String[] args)
    {
        Cars c1 = new Cars();
        c1.display();

        c1.setbrand("audi");
        c1.type="xuv"; 
        c1.display();
        
        System.out.println(c1.getbrand());
    }
}