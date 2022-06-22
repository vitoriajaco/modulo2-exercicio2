package exercicio2;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double primeiranota = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundanota = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double terceiranota = input.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double quartanota = input.nextDouble();

        input.close();

        int bimestres = 4;

        double MediadeNotas = (primeiranota + segundanota + terceiranota + quartanota) / bimestres;
        System.out.println("Sua média é: " + MediadeNotas);
    }
}
