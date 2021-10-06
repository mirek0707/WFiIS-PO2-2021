import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Podaj promien: ");
        double r=scanner1.nextDouble();
        System.out.println("Pole powierzchni: "+(Math.PI*Math.pow(r,2)));
        System.out.println("Obwod kola: "+(2*Math.PI*r));
        
    }
}
