import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número:");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns você acertou está misera");
                break;

            } else if (numeroDigitado < numeroGerado) {
                System.out.println("!!!O número é maior!!!");

            } else {
                System.out.println("!!!O número é menor!!!");
            }
        }
        if (tentativas == 5 && numeroDigitado != numeroGerado);
        System.out.println("Que pena a IA te venceu");
    }
}