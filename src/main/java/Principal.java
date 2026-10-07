
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int controle, numero, numeromaior = 0, numeromenor = 0, soma = 0, i;
        double media;

        System.out.print("Quantide de registro: ");
        controle = leia.nextInt();

        for (i = 1; i <= controle; i++) {

            System.out.print("digite o " + i + "° numero: ");
            numero = leia.nextInt();

            soma += numero;

            if (i == 1) {
                numeromaior = numero;
                numeromenor = numero;
            }
            if (numeromaior < numero) {
                numeromaior = numero;
            }
            if (numeromenor > numero) {
                numeromenor = numero;
            }
        }
        media = (double) soma / controle;
        System.out.println("O menor valor lido é: " + numeromenor);
        System.out.println("O maior valor lido é: " + numeromaior);
        System.out.println("A soma dos numeros lidos é: " + soma);
        System.out.printf("A media dos numeros lidos é:: %.2f", media);
    }
}
