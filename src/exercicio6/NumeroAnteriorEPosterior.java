package exercicio6;

import java.util.Scanner;

public class NumeroAnteriorEPosterior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número desejado");
        int numero = input.nextInt();

        input.close();

        int NumeroAnterior = (numero) - 1;
        int NumeroPosterior = (numero) + 1;
        System.out.println("Você digitou o número " + numero + " seu número anterior é " + NumeroAnterior + ", e seu número posterior é " + NumeroPosterior );
    }

}
