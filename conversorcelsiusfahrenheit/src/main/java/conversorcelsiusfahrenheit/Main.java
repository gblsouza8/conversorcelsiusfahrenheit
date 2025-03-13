// conversor de celsius para fahrenheit

package conversorcelsiusfahrenheit;
import java.util.Scanner;
public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // declara as variaveis que serão usadas no programa
        double temperaturaCelsius;
        double temperaturaFahrenheit;

        // inicia o scanner, pede ao usuario a temperatura e a armazena na variavel temperaturaCelsius
        Scanner input = new Scanner(System.in);
        System.out.print("Insira aqui a temperatura em celsius: ");
        temperaturaCelsius = input.nextDouble();
        input.close();

        // realiza a conversão e armazena o resultado na variavel temperaturaFahrenheit
        temperaturaFahrenheit = ((temperaturaCelsius * 9/5) + 32);

        // exibe na tela o resultado da conversão
        System.out.println(temperaturaCelsius + "ºC para Fahrenheit: " + temperaturaFahrenheit);
    }
}