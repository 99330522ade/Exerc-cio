import java.util.Scanner;

public class Exemplo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nunveo: ");
        int valor = sc.nextInt();

        int soma = 0;

        while (valor != 0) {

            System.out.println("digite um valor: ");
            soma = valor + soma;
            valor = sc.nextInt();

        }

        System.out.println(soma);

        System.out.println("O valor digitado foi 0");

        sc.close();

    }
}