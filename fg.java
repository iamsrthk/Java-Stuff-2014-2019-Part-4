

public class fg
{
    void main(int a)
    {
    if(a<=500)
    {
        System.out.println("comission is = "+10);
    }

    else if(a<=501&&1000)
    {
        System.out.println("comission is = "+15);
    }
    else if(a<=1001&&2000)
    {
        System.out.println("comission is = "+20);
    }
    else if(a<=2001)
    {
        System.out.println("comission is = "+((a/1000)*25));
    }
    }
}
