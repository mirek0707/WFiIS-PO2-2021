public class SamochodOsobowy extends Pojazd
{
    @Override
    public String toString()
    {
        return "samochod "+nazwa;
    }
    SamochodOsobowy(String n)
    {
        super(n);
    }
    @Override
    public String typ()
    {
        return "samochodOsobowy";
    } 
}