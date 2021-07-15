import java.util.Scanner;
public class gk
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();int s=0;
        while(n!=0)
        {
         int r=n%10;
         s=s*10+r;
         n=n/10;
        }
        System.out.println(s);
    }
}
