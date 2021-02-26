import java.util.Scanner;
public class Exercicio2A {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcula a área do quadrado.");
        System.out.println("Entre com o lado:");
        double lado = teclado.nextDouble();
        double area = lado * lado;
        System.out.println("Area do quadrado = "+ area);
        teclado.close();
    }

}
