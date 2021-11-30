import java.util.Scanner;


class Sting_ex
{
    public static void main(String[] args)
    {
        int a=10;
        String str1="hello everyone how are you";
        String str2="every1@";
        String str4="hello";
        String patt="[A-Z]";

        //Scanner sc = new Scanner(System.in);
        //String str3 = sc.nextLine();

        //System.out.println(str1+a);
        //System.out.println(str1.length());
        //System.out.println(str3);

        //System.out.println(str2.toUpperCase()); 
        //System.out.println(str1.toLowerCase());
        //System.out.println(str4.isEmpty());

        //System.out.println(str1.equalsIgnoreCase(str4));
        //System.out.println(str1.matches(patt));

        System.out.println(str1.contains(str4));
        System.out.println(str1.charAt(0));
    }
}