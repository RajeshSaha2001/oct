import java.util.Scanner;

public class d_compareToIgnoreCase
{

    /* int compareToIgnoreCase(String str)
    Compares two strings lexicographically, ignoring case differences.
    
    equalsIgnoreCase(String anotherString)
    Compares this String to another String, ignoring case considerations. */
    
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter 2 strings");
        s1=sc.nextLine();
        s2=sc.nextLine();
        
        if(s1.compareToIgnoreCase(s2)==0)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
        
        if(s1.equalsIgnoreCase(s2)==true)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
    }
}
