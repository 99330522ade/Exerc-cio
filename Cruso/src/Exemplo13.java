import java.util.Scanner;

public class Exemplo13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        int  soma = 0;
        for(int i = 0; i < valor ;i++ ){

            System.out.println("Digite um valor: ");
            int x = sc.nextInt();
            soma = soma + x;


        }
        System.out.println(soma);
        sc.close();

    }
}

