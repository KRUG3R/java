import java.util.Scanner;
public class URI1018 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cédulas:");
        System.out.println("Entre o valor");
        int x = teclado.nextInt();
        teclado.close();

        int c100, c050, c020, c010, c005, c002, c001, resto;

        c100 = x/100;
        resto = x % 100;

        c050 = resto / 50;
        resto = resto % 50;

        c020 = resto / 20;
        resto = resto % 20;

        c010 = resto / 10;
        resto = resto % 10;

        c005 = resto / 5;
        resto = resto % 5;

        c002 = resto / 2;
        resto = resto % 2;

        c001 = resto;


        System.out.println(c100 +" nota(s) de R$ 100,00");
        System.out.println(c050 +" nota(s) de R$ 50,00");
        System.out.println(c020 +" nota(s) de R$ 20,00");
        System.out.println(c010 +" nota(s) de R$ 10,00");
        System.out.println(c005 +" nota(s) de R$ 5,00");
        System.out.println(c002 +" nota(s) de R$ 2,00");
        System.out.println(c001 +" nota(s) de R$ 1,00");
    }

}
