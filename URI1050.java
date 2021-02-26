import java.util.Hashtable;
import java.util.Scanner;
public class URI1050 {
    public static void main(String arg[]) {
        Hashtable<Integer, String> ddd = new Hashtable<Integer, String>();
        ddd.put(61,"Basilia");
        ddd.put(71,"Salvador");
        ddd.put(11,"Sao Paulo");
        ddd.put(21,"Rio de Janeiro");
        ddd.put(32,"Juiz de Fora");
        ddd.put(19,"Campinas");
        ddd.put(27,"Vitoria");
        ddd.put(31,"Belo Horizonte");

        Scanner teclado = new Scanner(System.in);
        System.out.println("DDD:");
        System.out.println("Entre com o DDD:");
        Integer x = teclado.nextInt();
        teclado.close();

        System.out.println(ddd.get(x));
    }

}
