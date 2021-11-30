import java.util.Scanner;

class if_loop
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc= new Scanner(System.in);

        char ch= sc.next().charAt(0);
        a = sc.nextInt();
        int g= sc.nextInt();
        System.out.println(a+" "+g+" "+ch );
        System.out.println(g+"  g printed");
        if(g>a)
        {
            System.out.print(" everyone");
        }
        for (int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }

} 