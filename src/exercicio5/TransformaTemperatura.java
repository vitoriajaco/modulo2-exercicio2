package exercicio5;

import java.util.Scanner;

public class TransformaTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double temperatura = input.nextDouble();

        input.close();

        double Celcius = ((temperatura - 32) * 5) / 9;
        System.out.printf("A temperatura em Celcius é de R$ %.1f graus", Celcius);


    }
}
