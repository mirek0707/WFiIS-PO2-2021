//        Szyfr Cezara
//
//        Napisz program który będzie obsługiwał dwa tryby oraz przesunięcie w alfabecie niezbędne do zakodowania słowa w szyfr cezara
//
//        (tryb oraz przesunięcie przekazane jako argumenty programu):
//
//        1. Input z pliku zostaje zaszyfrowany i zapisany do pliku o tej samej nazwie + _coded_{przesuniecie}.txt (3pkt za obsługę pojedyńczych wyrazów + 2 pkt za obsługe całych
//
//        zdań ze spacjami)
//
//        2. Input z pliku zostaje odszyfrowany i zapisany do pliku o tej samej nazwie + _decoded_{przesuniecie}.txt. (3pkt za obsługę pojedyńczych wyrazów + 2 pkt za obsługe całych
//
//        zdań ze spacjami)
//
//
//        3. Argumenty programu przekazane jako:
//        java lab2 code 2 test.txt
//        java lab2 decode 2 test.txt
//
//                test.txt zawiera słowo TEST
//
//        4. Przykładowy wynik:
//                (To wypisujemy na konsole)
//        Dla alfabetu: ABCDEFGHIJKLMNOPQRSTUVWXYZ
//        Dla pliku z zawartoscia: TEST
//        Przesunięcia: 2
//        Trybu: code
//        Wynik: VGUV
//
//                (To trafia do pliku o nazwie test_coded_2.txt)
//                VGUV
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.Writer;

public class Lab13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int przesuniecie = Integer.parseInt(args[1]);
        String plik = args[2];
        przesuniecie %= 26;
        String wynik = "";
        try {
            String text = Files.readString(Paths.get(args[2]));
            for (int i = 0; i < text.length(); i++) {
                int j = 0;
                for (j = 0; j < 26; j++) {
                    if (text.charAt(i) == alfabet.charAt(j)) {
                        if (args[0].equals("code")) {
                            wynik += alfabet.charAt((j + przesuniecie) % 26);
                            break;
                        } else if (args[0].equals("decode")) {
                            wynik += alfabet.charAt((26 + j - przesuniecie) % 26);
                            break;
                        }
                    }
                }
                if (j == 26) {
                    wynik += text.charAt(i);
                }
            }
            System.out.println("Dla alfabetu: " + alfabet + "\n" + "Dla słowa: " + text + "\n" + "Przesunięcia: "
                    + przesuniecie + "\nTrybu: " + args[0]);
            System.out.println("Wynik: " + wynik);
            int i=0;
            String nazwa=args[2];
            String nazwaOut="";
            while (nazwa.charAt(i)!='.')
            {
                nazwaOut+=nazwa.charAt(i);
                i++;
            }
            nazwaOut+="_"+args[0]+"d_"+args[1]+".txt";
            PrintWriter pw= new PrintWriter(nazwaOut);
            pw.print(wynik);
            pw.close();

        } catch (Exception e) {
            
        }
        

    }
}

