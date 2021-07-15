 
import java.util.*;

public class scanner1
{
    void main()
    {
        Scanner ob=new Scanner(System.in);
        String name;
        char ch;
        int pa;
        double d=0;
        System.out.println("enter your name");
        name=ob.next();
        System.out.println("enter the amount");
        pa=ob.nextInt();
        System.out.println(" enter l for laptop and d fop desktop pc");
        ch=ob.nextLine().charAt(0);
        switch(ch)
        {
            case 'l':
            if(pa<=25000)
            {
                d=pa*0.0;
            }
            else if(pa>=25001&&pa<=50000)
            {
                d=pa*0.05;
            }
            else if(pa>=50001&&pa<=100000)
            {
                d=pa*7.5/100;  
            }
            else if(pa>=100001)
            {
                d=pa*10/100;  
            }
            break;
            case 'd':
            if(pa<=25000)
            {
                d=pa*5.0/100;
            }
            else if(pa>=25001&&pa<=50000)
            {
                d=pa*7.5/100;
            }
            else if(pa>=50001&&pa<=100000)
            {
                d=pa*10.0/100;  
            }
            else if(pa>=100001)
            {
                d=pa*15/100;  
            }
            System.out.println(" new purchase amount =   "+(pa-d));
            
        }
    }
}
