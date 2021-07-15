
import java.util.Scanner;
public class no1
{
    void main()
    {
    System.out.println("enter the numbers");    
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int s=0;
    while(n!=0)
    {
        int r=n%10;
        s=s+r;
        n=n/10;
   
    }
    System.out.println("sum of the digits is "+s);
}
}
