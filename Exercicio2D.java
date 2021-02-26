import java.util.Scanner;
public class Exercicio2D {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcula a área do losango.");
        System.out.print("Entre com a diagonal1: ");
        double diag1 = teclado.nextDouble();
        System.out.print("Entre com a diagonal2: ");
        double diag2 = teclado.nextDouble();
        double area = diag1 * diag2;
        System.out.println("Area do losango = "+ area);
        teclado.close();
    }

}
