
import java.util.Scanner;
public class hh
{
    void main()
    {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter the amount to be placed");
     int amount=sc.nextInt();
    System.out.println("enter a number from 1 to 10");
    int number=sc.nextInt();
    int cpu=(1+(int)(Math.random()*10));
   if(cpu==number)
{
    System.out.println("you entered number  "+number+"  num generated was   "+cpu);
    System.out.println("you won double the amount  "+(2*amount));
}
   else if(cpu!=number)
{
    System.out.println("you entered number  "+number+" num generated was"+cpu);
    System.out.println("you lost   "+(amount));
}
}
 
}

