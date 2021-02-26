import java.util.Scanner;
public class URI1017 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Gasto de combustivel:");
        System.out.println("Entre o tempo gasto na viagem:");
        int x = teclado.nextInt();
        System.out.println("entre com a velocidade média:");
        int y = teclado.nextInt();
        teclado.close();
        double gasto = (double) x / 12 * y;
        System.out.printf("%.3f",gasto);
    }

}
