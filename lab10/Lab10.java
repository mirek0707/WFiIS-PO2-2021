import java.util.Scanner;
public class Lab10 {
    // Celem dzisiejszych zajęć jest napisanie prostej "gry"
    // Na początku program powinien przyjąć od użytkownika dwie wartości:
    // - rozmiar planszy (liczba większa od 3, jeśli użytkownik poda mniejszą powinien polecieć wyjątek(np. TooSmallGameSizeException) nastepnie zostac zlapany i wyswietlona informacja uzytkownikowi "Podano zbyt mały rozmiar, spróbuj ponownie")
    // - prawdopodobienstwo wystapienia wody( wieksze od 0, analogiczna sytuacja do rozmiaru)
    // Na postawie tych wartości należy stworzyć kwadratową planszą (tablice tablic, lub listę list). Następnie należy ją wypełnić znakami:
    // - znak W -> woda z prawdopodobienstwem podanym przez uzytkownika
    // - znak S -> skarb, jeden na całą planszę
    // - znak G -> gracz, jeden na całą planszę
    // - pozostałe pola wypelnic znakiem *
    // Potem nalezy ja wyswietlic
    // Nastepnie program powinien zaczac zbierac opcje od uzytkownika:
    // - l -> gracz porusza sie w lewo
    // - p -> gracz porusza sie w prawo
    // - g -> gracz porusza sie w gore
    // - d -> gracz porusza sie w dol
    // Po wybraniu opcji plansza powinna przerysowac sie na nowo
    // Gra powinna obsługiwać wyjątki takie jak:
    // - wejscie w wodę -> powinien poleciec wyjatek -> gra konczy sie napisem "Wszedłeś w wodę, koniec gry"
    // - nierozpoznanie opcji -> CommandNotRecognisedException
    // - wejscie w pole skarbu -> powinien poleciec wyjatek -> gra konczy sie napisem "Wygrałeś!!!"
    // Wejscie w pole skarbu lub wody konczy wykonywanie programu
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        int r;
        while(true)
        {
            System.out.print("Podaj rozmiar planszy: ");
            try{
                r=scanner1.nextInt();
                if(r<4)
                    throw new TooSmallGameSizeException("Podano zbyt mały rozmiar, spróbuj ponownie");
                else
                    break;
            }
            catch(TooSmallGameSizeException e){}
        }
        System.out.print("Podaj prawdopodobienstwo wystapienia wody: ");
        double pr=scanner1.nextDouble();

        Plansza p=new Plansza(r, pr);
        p.print();
        while(true)
        {
            System.out.print("Podaj kierunek ruchu: ");
            char kierunek;
            try{
                kierunek=scanner1.next().charAt(0);
                if(kierunek!='l' && kierunek!='p' && kierunek!='g' && kierunek!='d')
                    throw new CommandNotRecognisedException("Nierozpoznana opcja");
                else
                {
                    Boolean t;
                    try {t=p.poruszanie(kierunek);}
                    catch(PozaPlanszaException e)
                    {

                    }
                    catch(Exception e){
                        break;
                    }
                   
                    System.out.println();
                    p.print();

                }
            }
            catch(CommandNotRecognisedException e){}

        }

    }
}
class TooSmallGameSizeException extends Exception
{
    TooSmallGameSizeException(String s)
    {
        System.out.println(s);
    }
}
class CommandNotRecognisedException extends Exception
{
    CommandNotRecognisedException(String s)
    {
        System.out.println(s);
    }
}