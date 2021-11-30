
public class Methods
{
    public static void main(String[] args)
    {

        Methods m1 = new Methods();
        m1.work(5);
        //int ans = m1.doit(5);
        System.out.println(m1.doit(5));
        //m1.doit(6);
    }
    public void work(int num)
    {
        System.out.println("it is working "+num);
    }
    public int doit(int num)
    {
        return num+2;
    }
}