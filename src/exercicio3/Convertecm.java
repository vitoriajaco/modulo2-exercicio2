package exercicio3;

import java.util.Scanner;

public class Convertecm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros que você quer transformar em centimetros: ");
        double metros = input.nextDouble();

        input.close();

        double centimetros =  (metros) * 100;
        System.out.println("Isso corresponde a " + centimetros + "cm" );

    }
}
