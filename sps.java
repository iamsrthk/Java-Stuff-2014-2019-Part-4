
import java.util.Scanner;
public class sps
{
    void main()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("stone paper scissors");
    String x=sc.next();
    int cpu=(1+(int)(Math.random()*10));
    int i=0;
    while(i>=1)
    {
   if(cpu >=1 && cpu<=3)
{
    System.out.println("you entered  "+x+"           cpu entered stone");
}
   else if(cpu>=4&&cpu<=6)
{
    System.out.println("you entered   "+x+"           cpu entered paper");
}
  else if(cpu>=7&&cpu <=10)
{
    System.out.println("you entered   "+x+"          cpu entered scissors");
}
i++;
}
}

}

