public abstract class Pojazd
{
    protected String nazwa;
    protected boolean stan;
    @Override
    public String toString()
    {
        return "";
    }
    Pojazd(String n)
    {
        this.nazwa=n;
        this.stan=false;
    }
    public void setStan(boolean s)
    {
        this.stan=s;
    }
    public String typ()
    {
        return "pojazd";
    } 
    public boolean getStan()
    {
        return stan;
    }
}