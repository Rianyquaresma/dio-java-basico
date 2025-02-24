import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Solicitar número da conta
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar número da conta
            System.out.print("Por favor, digite o número da Conta: ");
            int numeroConta = scanner.nextInt();
            
            // Solicitar agência
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.next();
            
            // Limpar o buffer do scanner
            scanner.nextLine();
            
            // Solicitar nome do cliente
            System.out.print("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
            
            // Solicitar saldo da conta
            System.out.print("Por favor, digite o saldo da Conta: ");
            double saldo = scanner.nextDouble();

            // Exibir mensagem final
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    
    }
}
