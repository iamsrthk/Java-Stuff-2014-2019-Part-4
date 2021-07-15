
import java.util.Scanner;
public class string4
{
    static void main()
    {
        char a;int len,i;String str;
        int k=0;
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            a=str.charAt(i);
            
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
            {
                k++;
            }
        

            
        }
        System.out.println("no of  \" \" are"+k);
        
    }
}