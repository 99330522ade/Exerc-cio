import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String  dia;

        System.out.println("Escola um dia da semana: ");

        if (x == 1){
            dia = "domingo";
        }
        else if (x == 2){
            dia = "segunda";
        }
        else if (x == 3){
            dia = "terca";
        }
        else if (x == 4) {
            dia = "quarta";
        }
        else if (x == 5){
            dia = "quinta";
        }
        else if (x == 6){
            dia = "sexta";
        }
        else if (x == 7) {
            dia = "sabadp";
        }
        else {
            dia = "Valor invalido";
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}