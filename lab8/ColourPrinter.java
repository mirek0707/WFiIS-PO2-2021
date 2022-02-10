enum Colors
    {
        RED("czerwony", "red"),    
        GREEN("zielony", "green"),
        YELLOW("zolty", "yellow"),     
        BLUE("niebieski", "blue"); 
        private final String polski;
        private final String angielski;
        public String kolorE() { return angielski; }
        public String kolorP() { return polski; } 
        Colors(String p, String a) {this.angielski = a; this.polski = p;}

    }
public class ColourPrinter
{
    public static void printColours()
    {
        for(Colors c:Colors.values())
        {
            System.out.println("Kolor "+c.kolorE()+" po polsku: "+c.kolorP());
        }
    }
    public static void printGetNameColours()
    {
        for(Colors c:Colors.values())
        {
            System.out.println(c.kolorP());
        }
    }
    public static void printSaySomethingColours()
    {
        for(Colors c:Colors.values())
        {
            System.out.println("Kolor to "+c.kolorP());
        }
    }
}