import java.util.Scanner;
public class twisted
{
    void main()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no.s");
     int n=sc.nextInt();
     int i=2;
     int r=0,t;
     boolean flag1=false;
    while(i<n)
    {
     if(n%i==0)
     {
      flag1=true;
      break;
    }
    i++;
}
if(flag1==false)
{
    t=n;
    while(t!=0)
    {
        n=t%10;
        r=r*10+n;
        t=t/10;
    }
    t=2;
    while(i<r)
    {
        if(r%i==0)
        {
            flag1=true;
            break;
        }
        i++;
    }
    if(flag1=false)
    {
        System.out.println("not twisted prime");
    }
    else
    {
      System.out.println(" twisted prime");   
    }
}
}
}

