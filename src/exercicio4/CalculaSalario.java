package exercicio4;

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu salario: ");
        double salario = input.nextDouble();

        System.out.println("Informe quantas horas você trabalhou por dia: ");
        double horas = input.nextDouble();

        System.out.println("Informe quantos dias você trabalhou no mês: ");
        int dias = input.nextInt();

        input.close();

        double HoraTrabalhada = ((salario / dias) / horas);
        double SalarioAReceber = (HoraTrabalhada * horas * dias);

        System.out.printf("Você recebe por hora o valor de R$ %.2f ", HoraTrabalhada);
        System.out.printf("Você receberá o salário de R$ %.2f ", SalarioAReceber);


    }
}
