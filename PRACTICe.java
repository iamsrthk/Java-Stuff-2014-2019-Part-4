

public class PRACTICe
{
    void main(int temp, int ch)
    {
        System.out.println(" 1 . cel to far");
        System.out.println(" 1 . far to cel");
        switch(ch)
        {
            case 1:
            double f=9.0/5*(temp+32);
            System.out.println(f);
            break;
             case 2:
            double c=5.0/9*(temp-32);
            System.out.println(c);
            break;
        }
    }
}
