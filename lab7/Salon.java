import java.util.ArrayList;
public class Salon
{
    private String nazwa;
    private ArrayList<Pojazd> T= new ArrayList<Pojazd>();
    public void dodajPojazd(Pojazd p)
    {
        T.add(p);
    }  
    public void wypiszWszystkiePojazdy()
    {
        for(int i=0;i<T.size();i++)
        {    
            if (i==(T.size()-1))
                System.out.println((T.get(i)).typ());
            else
                System.out.print((T.get(i)).typ()+", ");
        }
    }
    public void usunPojazd(Pojazd p)
    {
        T.remove(p);
    }
    Salon(String n)
    {
        this.nazwa=n;
    }
    void zawieraPojazd(Pojazd p)
    {
        System.out.println(T.contains(p));
    }
    Salon(Salon s, String n)
    {
        this.nazwa=n;
        this.T=(ArrayList)(s.T).clone();
    }
}