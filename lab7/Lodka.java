public class Lodka extends Pojazd implements PojazdPlywajacy
{
    @Override
    public String toString()
    {
        return "lodka "+nazwa;
    }
    @Override
    public String typ()
    {
        return "lodka";
    } 
    Lodka(String n)
    {
        super(n);
    }
    @Override
    public void plyn()
    {
        if (stan==true)
        {
            System.out.println("lodka plynie");
        }
        else
        {
            System.out.println("lodka nie moze plynac bo nie jest wlaczona");
        }
    }
}