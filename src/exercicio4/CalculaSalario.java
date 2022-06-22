package exercicio4;

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu salario: ");
        double salario = input.nextDouble();

        System.out.println("Informe quantas horas você trabalha por dia: ");
        double horas = input.nextDouble();

        System.out.println("Informe quantos dias você trabalha no mês: ");
        int dias = input.nextInt();

        input.close();

        double HoraTrabalhada = (salario / dias) / horas;
        System.out.printf("Você recebe por hora o valor de R$ %.2f ", HoraTrabalhada);
    }
}
