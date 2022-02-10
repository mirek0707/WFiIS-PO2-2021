public class Lion extends MeatEater
{
    private String typ;
    Lion(String i, int wag, int w, String t)
    {
        super(i, wag, w);
        this.typ=t;
    }
    public String toString()
    {
        return "\n\t-zwierze:lew\n\t-imie: "+imie+"\n\t-waga: "+waga+"\n\t-wiek: "+wiek+"\n\t-typ: "+typ+"\n";
    }
}