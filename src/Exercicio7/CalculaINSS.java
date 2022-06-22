package Exercicio7;

import java.util.Scanner;

public class CalculaINSS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora: ");
        double HoraGanha = input.nextDouble();

        System.out.println("Informe quantas horas você trabalhou no mês: ");
        int HorasTrabalhadas = input.nextInt();

        input.close();

        double Salario = (HoraGanha * HorasTrabalhadas);
        System.out.println(" Seu salário bruto é de: " + Salario);

        double DescontoINSS = (Salario * 8) / 100;
        System.out.println("Você pagou ao INSS a quantia de R$" + DescontoINSS);

        double ValorSindicato = (Salario * 5) / 100;
        System.out.println("Você pagou ao Sindicato a quantia de R$" + ValorSindicato);

        double DescontoImpostodeRenda = (Salario * 11) / 100;
        System.out.printf("Você pagou ao Imposto de Renda a quantia de R$ %.2f \n", DescontoImpostodeRenda);



        double DescontoTotaldoSalario = (Salario - DescontoINSS - ValorSindicato - DescontoImpostodeRenda);
        System.out.println("Com os descontos você receberá o salário de R$ " + DescontoTotaldoSalario);




    }
}
