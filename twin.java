import java.util.Scanner;
public class twin
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean flag1=false,flag2=false;
        if(a-b==2||b-a==2)
        {
            int i=2;   
            while(i<a)
            {
                if(a%i==0)
                {
                    flag1=true;
                }
                i++;
            }
            i=2;
            while(i<b)
            {
                if(b%i==0)
                {
                    flag2=true;        
                }  
                i++;
            }

            if(flag1==true&&flag2==true)
            {

                System.out.println(" not a twin prime");
            }
            else
            {
                System.out.println(" twin prime");
            }
        }
        else
        {
            System.out.println("not a twin prime");
        }
    }
}

