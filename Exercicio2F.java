import java.util.Scanner;
public class Exercicio2F {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcula a área do paralelepipedo.");
        System.out.print("Entre com a base:");
        double base = teclado.nextDouble();
        System.out.print("Entre com a altura:");
        double altura = teclado.nextDouble();
        System.out.print("Entre com a profundidade:");
        double profundidade = teclado.nextDouble();
        double area = base * altura * profundidade;
        System.out.println("Area do paralelepipedo = "+ area);
        teclado.close();
    }

}
