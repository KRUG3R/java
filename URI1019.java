import java.util.Scanner;
public class URI1019 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Conversão de tempo:");
        System.out.println("Entre o tempo em segundos:");
        int x = teclado.nextInt();
        teclado.close();

        int ss = x % 60;
        int mm = (x % 3600) / 60;
        int hh = x / 3600 ;


        System.out.println(""+hh+":"+mm+":"+ss);
    }

}
