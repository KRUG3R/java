import java.util.Scanner;
public class Exercicio2G {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcula a área do cubo.");
        System.out.println("Entre com o lado:");
        double lado = teclado.nextDouble();
        double area = lado * lado* lado;
        System.out.println("Area do cubo = "+ area);
        teclado.close();
    }

}
