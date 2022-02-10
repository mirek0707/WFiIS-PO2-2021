public class Amfibia extends Pojazd implements PojazdPlywajacy 
{
    @Override
    public String toString()
    {
        return "amfibia "+nazwa;
    }
    Amfibia(String n)
    {
        super(n);
    }
    @Override
    public String typ()
    {
        return "amfibia";
    } 
    @Override
    public void plyn()
    {
        if (stan==true)
        {
            System.out.println("amfibia plynie");
        }
        else
        {
            System.out.println("amfibia nie moze plynac bo nie jest wlaczona");
        }
    }
    public void jedz()
    {
        if (stan==true)
        {
            System.out.println("amfibia jedzie");
        }
        else
        {
            System.out.println("amfibia nie jedzie");
        }
    }
}