import java.util.Scanner;

public class Leitura {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        int a;
        double b;
        System.out.println("digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("O valor foi: " + a);

        System.out.println("digite um valor real");
        b = teclado.nextDouble();
        System.out.println("O valor foi: "+ b);
        teclado.close();


   }
}
