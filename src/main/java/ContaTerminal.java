import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("***** NOSSO BANCO *****");
        System.out.println();
        System.out.println("Bem-vindo ao NOSSO BANCO, por favor, digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Insira o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora informe o nome da agência:");
        String agencia = scanner.next();

        System.out.println("Para finalizar coloque o valor do seu saldo:");
        double saldo = scanner.nextDouble();
        System.out.println();
        System.out.println("--- Conta criada com sucesso ---");
        System.out.println("Olá " + nome + ", obrigado por criar a sua conta no NOSSO BANCO, sua agência é " + agencia + " ,conta número " + numeroConta + " e seu saldo de " + saldo + " já está disponível!");


    }
}
