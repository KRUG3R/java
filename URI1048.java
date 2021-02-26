import java.util.ArrayList;
import java.util.Scanner;


public class URI1048 {
    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Aumento de Salario");
        System.out.println("Entre com o Salario:");
        Integer salario = teclado.nextInt();
        teclado.close();

        ArrayList<Faixa> faixas= new ArrayList<Faixa>();
        faixas.add(new Faixa(0.00, 400.00, 15));
        faixas.add(new Faixa(400.01, 800.00, 12));
        faixas.add(new Faixa(800.01, 1200.00, 10));
        faixas.add(new Faixa(1200.01, 2000.00, 7));
        faixas.add(new Faixa(2000.01, Double.MAX_VALUE, 4));

        Integer percentual  = 0;

        for (Faixa f:faixas){
            if (salario >= f.inicio && salario <= f.fim){
                percentual = f.percentual;
                break;
            }
        }

        float percentual2 = (float) percentual;
        System.out.printf("Novo salario: %.2f \n", (1+(percentual2/100))*salario);
        System.out.printf("Reajuste ganho: %.2f \n", ((percentual2/100))*salario);
        System.out.printf("Em percentual: %d %% \n", percentual);


    }

}
