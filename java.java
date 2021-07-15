
import java.util.Scanner;
public class java
{
    void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of times u want to type a word");
    int a=sc.nextInt();
    System.out.println("enter a word which u want to print"+a+"  times");
    String word=sc.next();
    System.out.println("");
    
    for(int i=1;i<=a;i++)
    {
        System.out.println(word+" "+" "+" "+" "+word);
        System.out.println(word+word+" "+" "+" "+" "+word+word);
        System.out.println(word+word+word+" "+" "+" "+" "+word+word+word);
        System.out.println(word+word+word+" "+" "+" "+" "+word+word+word);
        System.out.println(word+word+" "+" "+" "+" "+word+word);
        System.out.println(word+" "+" "+" "+" "+word);
        
    }
    }
}
