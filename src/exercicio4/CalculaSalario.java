package exercicio4;

import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantas horas de trabalho você fez no mes: ");
        int horas = input.nextInt();

        System.out.println("Informe qual valor da sua hora de trabalho: ");
        double Valordahora = input.nextDouble();

        input.close();


        double SalarioAReceber = (Valordahora * horas);

        System.out.printf("Você receberá o salário de R$ %.2f ", SalarioAReceber);



    }
}
