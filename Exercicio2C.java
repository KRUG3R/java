import java.util.Scanner;

public class Exercicio2C {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcula a área do trapézio.");
        System.out.print("Entre com a base maior: ");
        double baseMaior = teclado.nextDouble();
        System.out.print("Entre com a base menor: ");
        double baseMenor = teclado.nextDouble();
        System.out.print("Entre com a altura: ");
        double altura = teclado.nextDouble();
        double area = (baseMaior + baseMenor)* altura /2;
        System.out.println("Area do trapézio = "+ area);
        teclado.close();
        
    }
}