import java.util.Scanner;
public class Exercicio2H {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcula volume do Cilindro.");
        System.out.println("Entre com o raio:");
        double raio = teclado.nextDouble();
        System.out.println("Entre com altura:");
        double altura = teclado.nextDouble();
        double area = 3.14 * raio * raio * altura;
        System.out.println("O Volume do cilindro = "+ area);
        teclado.close();
    }

}
