import java.util.Scanner;
public class Exercicio1 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("inverte o número dado");
        System.out.println("Entre com o número:");
        int original = teclado.nextInt();
        teclado.close();
        int d1 = original % 10;
        int d2 = (original/10) % 10;
        int d3 = original / 100;
        System.out.println("d1:"+ d1);
        System.out.println("d2:"+ d2);
        System.out.println("d3:"+ d3);
        int invertido = (d1*100)+ (d2*10)+ d3;
        System.out.println("O número invertido = "+ invertido);
    }

}
