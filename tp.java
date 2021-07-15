
import java.util.Scanner;
import java.io.*;
public class tp
{
    void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your id");
    String x=sc.next();
    System.out.println("re-enter your id");
    String y=sc.next();
    if(x==y)
    {
        System.out.println("these IDs MATCH");
    }
    else 
    {
        
     System.out.println("these IDs  DONT MATCH");
    }
}
}
