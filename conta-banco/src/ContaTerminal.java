import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("--------------------------------------------");
    System.out.println("Bem vindo(a) ao Banco Santander DIO");
    System.out.println("--------------------------------------------");
    

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();

    System.out.println("Por favor, informe a sua Agência: ");
    String agencia = scanner.next();

    System.out.println("Por favor, digite o número da sua conta: ");
    int numero = scanner.nextInt();

    System.out.println("O saldo da sua conta é: ");
    double saldo = scanner.nextDouble();

    System.out.println("--------------------------------------------");
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    System.out.println("--------------------------------------------");


    }
}
