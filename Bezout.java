import java.util.*;
public class Bezout
{
    int gcd(int a,int b)
    {
        if(a%b==0){
            return b;
        }
        else
        return gcd(b,a%b);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Bezout ob=new Bezout();
        System.out.println("Enter the integers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int fa=0,fb=0;
        int c=ob.gcd(a,b);
        int x=0,y=0,z=0;
        System.out.println("GCD = "+c);
        System.out.println("Bezout coefficients: ");
        for(int i=-100;i<100;i++)
        {   
            for(int j=-100;j<100;j++)
            {
                if(((a*i)+(b*j))==c)
                {
                   System.out.println(i+","+j);
                   if(i<a&&j<b){
                   fa=i;
                   fb=j;
                   }
                }
            }
        }
        System.out.println("\nRequired Bezout coefficients: s="+fa+" and t="+fb);
    }
}