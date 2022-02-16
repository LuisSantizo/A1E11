import java.util.Scanner;

public class A1E11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definir variables
        double Centimetros;
        double Metros;
        double Yardas;
        double Pies;
        double Pulgadas;
        
        //pedir datos
        System.out.print("Ingrese la medida en centimetros: ");
        Centimetros = scanner.nextDouble();

        //hacfer las operaciones
        Metros = Centimetros * 0.01;
        Yardas = Centimetros * 0.0109361;
        Pies = Centimetros * 0.0328084;
        Pulgadas = Centimetros * 0.393701;

        System.out.println(Centimetros + " son: " + Metros + " metros.");
        System.out.println(Centimetros + " son: " + Yardas + " yardas.");
        System.out.println(Centimetros + " son: " + Pies + " pies.");
        System.out.println(Centimetros + " son: " + Pulgadas + " pulgadas.");
    }

}
