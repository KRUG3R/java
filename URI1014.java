import java.util.Scanner;
public class URI1014 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        //System.out.println("Consumo:");
        //System.out.println("Entre com a distancia percorrida em km:");
        double x = teclado.nextDouble();
        //System.out.println("Entre com o total de combustivel gasto el l:");
        double y = teclado.nextDouble();
        teclado.close();
        double consumo = x/y;
        System.out.printf("%.3f km/l",consumo);
    }

}
