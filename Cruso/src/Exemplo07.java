import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos gastos: ");

        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("O valor da conta = R$ %.2f%n", conta);
        sc.close();

    }
}