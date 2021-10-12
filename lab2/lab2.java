/*Lab 2. Szyfr Cezara
Napisz program który będzie obsługiwał dwa tryby oraz przesunięcie w alfabecie niezbędne do zakodowania słowa w szyfr cezara
(tryb oraz przesunięcie przekazane jako argumenty programu):
1. Input od użytkownika zostaje zaszyfrowany i wypisany na konsole. (4pkt za obsługę pojedyńczych wyrazów + 1 pkt za obsługe całych
zdań ze spacjami)
2. Input od użytkownika zostaje odszyfrowany i wypisany na konsole. (4pkt za obsługę pojedyńczych wyrazów + 1 pkt za obsługe całych
zdań ze spacjami)

Alfabet może być przetrzymywany jako stała tablica(lub lista jeżeli ktoś chce).
Wskazówki:
1. Przyjmowanie inputu od użytkownika
import java.util.Scanner;

class Cesar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	String word = scan.nextLine();
	}
}

2. Argumenty programu przekazane jako: 

java lab2 code 2
java lab2 decode 2

3. Przykładowy wynik:
Dla alfabetu: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Dla słowa: TEST
Przesunięcia: 2
Trybu: code

Wynik: VGUV



Dla alfabetu: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Dla słowa: VGUV
Przesunięcia: 2
Trybu: decode

Wynik: TEST

4. Program proszę przesłać w formie pliku imie_nazwisko_lab2.java*/
import java.util.Scanner;

class Cesar 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int przesuniecie = Integer.parseInt(args[1]);
        przesuniecie%=26;
        String wynik=""; 
        for (int i=0; i<word.length(); i++)
        {
            int j=0;
            for (j=0; j<26; j++)
            {
                if (word.charAt(i)==alfabet.charAt(j))
                {
                    if (args[0].equals("code"))   
                    { 
                        wynik+=alfabet.charAt((j+przesuniecie)%26);
                        break;
                    }
                    else if (args[0].equals("decode"))
                    {
                        wynik+=alfabet.charAt((26+j-przesuniecie)%26);
                        break;
                    }
                }
            }
            if(j==26)                   
            {
                wynik+=word.charAt(i);
            }
        }
        System.out.println("Dla alfabetu: "+alfabet+"\n"+"Dla słowa: "+word+"\n"+"Przesunięcia: "+przesuniecie+"\nTrybu: "+args[0]);
        System.out.println("Wynik: "+wynik);

	}
}