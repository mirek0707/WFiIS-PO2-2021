import java.util.Date;
public class ImmutablePerson
{
    ImmutablePerson(String i, String n, Date d)
    {
        data=(Date)d.clone();
        imie=i;
        nazwisko=n;
    }
    public String getInformation()
    {
        return "Imie: "+imie+" nazwisko: "+nazwisko+" data urodzenia: "+data;
    }
    public Date getDateOfBirth()
    {
        return (Date)data.clone();
    }
    public ImmutablePerson clone()
    {
        return new ImmutablePerson(this.imie, this.nazwisko, this.data);
    }
    public String getFirstName()
    {
        return imie;
    }
    private final Date data;
    private final String imie;
    private final String nazwisko;
}