// stworzyc program który utworzy dwie macierze z losowymi liczbami całkowitymi o wymiarach które wpisuje uzytkownik na poczatku wykonywania programu
// m1 => m x p
// m2 => n x p
// następnie wykonuje operacje mnożenia macierzy
// raz bez użycia wątków
// drugi raz przy użyciu wielu wątków
// uzytkownik otrzymuje output
// jesli wynikowa macierz ma wymiar wiekszy niz 10x10 nie printujemy ani wylosowanych ani wynikowej, podajemy tylko czasy
//SINGLE THREAD:
//Matrix 1 :
//
//830  930  360
//840  140  580
//200  270  370
//
//Matrix 2 :
//
//440  600  390
//630  590  390
//830  220  530
//
//Output Matrix :
//
//1249900  1125900  877200
//939200  714200  689600
//565200  360700  379400
//
//Time taken in milli seconds: 2
//==================
//MULTIPLE THREAD
//Matrix 1 :
//
//830  930  360
//840  140  580
//200  270  370
//
//Matrix 2 :
//
//440  600  390
//630  590  390
//830  220  530
//
//Output Matrix :
//
//1249900  1125900  877200
//939200  714200  689600
//565200  360700  379400
//
//Time taken in milli seconds: 1
//==================

// Mierzenie czasu: System.currentTimeMillis()
// Liczba dostępnych procesorów: Runtime.getRuntime().availableProcessors()
import java.util.Scanner;
public class Lab14 {
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Podaj wymmiary macierzy: ");
        int m=scanner1.nextInt();
        int p=scanner1.nextInt();
        int n=scanner1.nextInt();
        Matrix M1= new Matrix(m,p);
        Matrix M2= new Matrix(p,n);
        System.out.println("Matrix 1: \n");
        M1.print();
        System.out.println();
        System.out.println("Matrix 2: \n");
        M2.print();
        long start=System.currentTimeMillis();
        Matrix M3= M1.mnoz(M2);
        System.out.println();
        System.out.println("Output Matrix: \n");
        M3.print();

        long stop=System.currentTimeMillis();

        System.out.println("Time taken in milli seconds: "+(stop-start));


        long start1=System.currentTimeMillis();
        Matrix M4= M1.mnoz2(M2);
        System.out.println();
        System.out.println("Output Matrix: \n");
        M4.print();

        long stop1=System.currentTimeMillis();

        System.out.println("Time taken in milli seconds: "+(stop1-start1));


    }
}
