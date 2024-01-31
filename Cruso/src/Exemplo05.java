import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s2, s3, s4;

        System.out.println("DIGITE SEUS DIGITADOS: ");

        s2 = sc.nextLine();
        s3 = sc.nextLine();
        s4 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        sc.close();

    }
}