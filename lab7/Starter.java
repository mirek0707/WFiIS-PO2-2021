public class Starter
{
    public static void start(Pojazd p)
    {
        if (p.getStan()==false)
        {    
            p.setStan(true);
            System.out.println(p+" uruchamia silnik");
        }
        else
        {
            System.out.println(p+" zaczyna plynac");
        }
    }
    public static void stop(Pojazd p)
    {
        if (p.getStan()==true)
        {
            p.setStan(false);
            System.out.println(p+" zatrzymuje silnik");
        }
        else
        { 
                System.out.println(p+" przestaje plynac");
        }
    }
}