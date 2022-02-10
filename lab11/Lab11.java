import java.lang.reflect.*;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Lab11 {
// Celem dzisiejszych zajęć jest skorzystanie z mechanizmu refleksji
// Na początku wypisujemy wszystkie możliwe metody z klasy Math które maja 1 lub 2 argumenty
// Następnie użytkownik wpisuje funkcję matematyczną do wywołania, np. tan(1.0), należy obsłużyc wszystkie funkcje z klasy Math, które zawierają 1 lub 2 argumenty
// Metodę w klasie Math należy znaleźć przy użyciu metody "getMethod" z klasy Class
// Następnie wypisujemy wynik równania i kończymy program
// Oczywiście program musi obsługiwać wyjątki takie jak: wywołanie metody która nie istnieje w klaie Math, Wywoałenie metody ze złą liczbą argumentów, czy podaniem do funkcji typu argumentu innego niz int/float/double
// Mamy napisaną metodę getArgs do której podajemy np: "sin(4.12)" i otrzymujemy tablicę: [sin, 4.12]
    public static String[] getArgs(String arg) 
    {
        return Arrays.stream(arg.split("[\\s+(),]"))
                .filter(w -> !w.isEmpty())
                .toArray(String[]::new);
    }
    public static void main(String[] args)
    {   
        Scanner scanner1 = new Scanner(System.in);
        Class c = Math.class;
        Method[] tm = c.getDeclaredMethods();
        for (int i = 0; i < tm.length; ++i) 
        {
            String mn = tm[i].getName();
            Type[] tt = tm[i].getGenericParameterTypes();
            if(tt.length==1 || tt.length==2)
                System.out.println(mn);
        }
        String funkcja;
        try
        {
            funkcja=scanner1.next();
            String[] T=getArgs(funkcja);
            if (T.length>3)
            {
                throw new ArgumentyException("Bledna ilosc argumentow.");
            }
            int i;
            for (i = 0; i < tm.length; ++i) 
            {
                String mn = tm[i].getName();
                Type[] tt = tm[i].getGenericParameterTypes();
                if((tt.length==1 || tt.length==2) && mn.equals(T[0]) && (T.length-1)==tt.length)
                {
                    if (T[1].charAt(0)<'0'||T[1].charAt(0)>'9')
                    {
                        throw new ArgumentyException("Zly typ argumentow.");
                    }
                    else if(tt.length==1 )
                        System.out.println(tm[i].invoke(null, Double.parseDouble(T[1])));
                    else if(tt.length==2 )
                        System.out.println(tm[i].invoke(null, Double.parseDouble(T[1]), Double.parseDouble(T[2])));
                    break;
                }
            }
            if (i==tm.length)
            {
                throw new FunkcjaException("Brak danej funkcji lub zla liczba argumentow.");
            }
            
        } catch(Exception e) {  e.printStackTrace();}
        
    }
}
class FunkcjaException extends Exception
{
    FunkcjaException(String s)
    {
        System.out.println(s);
    }
}
class ArgumentyException extends Exception
{
    ArgumentyException(String s)
    {
        System.out.println(s);
    }
}
