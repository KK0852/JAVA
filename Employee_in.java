class Salary
{
    public int sal =  1000;
}                            
class Amount extends Salary
{
    int amt=5;
    int sal1 = 20;
}
class Employee_in 
{
    public static void main(String[] args)
    {
        int a= 50;

        //Amount a1 = new Amount();
        Salary s1 = new Salary();
        //System.out.println(a1.sal+a);
        //System.out.println(a1.sal);

        // System.out.println(amt);
        System.out.println(s1.sal);
        System.out.println(a);
    }
}