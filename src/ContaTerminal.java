import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da conta: ");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        agencia = entrada.next();

        System.out.print("Por favor digite o nome do titular da conta: ");
        nomeCliente = entrada.next();

        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
