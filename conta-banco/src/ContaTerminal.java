import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /*
        Conhecer e importar a classe Scanner
        Exibir as mensagens para o usuário
        Obter os valores digitados pelo terminal
        Exibir mensagem de conta criada
        */

        var scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo = 3000.00;

        System.out.println("Informe os dados a seguir:");
        System.out.print("Nome: ");
        nomeCliente = scanner.next();

        System.out.print("Agência: ");
        agencia = scanner.next();

        System.out.print("Número da conta: ");
        numeroConta = scanner.nextInt();

        String saida = "Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numeroConta))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque");

        System.out.printf(saida);

    }
}