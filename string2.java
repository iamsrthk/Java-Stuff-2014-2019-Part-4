
import java.util.Scanner;
public class string2
{
    static void main()
    {
        char a;int len,i;String str;
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            a=str.charAt(i);
            System.out.println(a);

            int k=0;
            if(a=='a'||a=='A')
            {
                k++;
            }

            System.out.println("no of a's or A's are"+k);
        }
        
    }
}

