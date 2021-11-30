

public class Cars
{
    String color="red";
    private String brand="Honda";
    String type="SUV";

    public String getbrand()
    {
        return brand;
    }
    public void setbrand(String brand)
    {
        this.brand=brand;
    }

    public void display()
    {
        System.out.println("I have "+color+" color "+brand+" "+type);
    }
}