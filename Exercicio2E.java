import java.util.Scanner;
public class Exercicio2E {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcula a área do triangulo.");
        System.out.print("Entre com a base:");
        double base = teclado.nextDouble();
        System.out.print("Entre com a altura:");
        double altura = teclado.nextDouble();
        double area = base * altura/2;
        System.out.println("Area do triangulo = "+ area);
        teclado.close();
    }

}
