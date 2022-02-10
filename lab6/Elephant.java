public class Elephant extends Animal
{
    Elephant(String i, int wag, int w)
    {
        super(i, wag, w);
    }
    public String toString()
    {
        return "\n\t-zwierze:slon\n\t-imie: "+imie+"\n\t-waga: "+waga+"\n\t-wiek: "+wiek+"\n";
    }
    public int compare(Elephant e)
    {
        if (e.wiek==this.wiek)
        {
            return 0;
        }
        else
            return 1;
    }
}