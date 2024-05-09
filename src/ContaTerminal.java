import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Dados da Conta
        System.out.print("Digite o Numero da Agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite o Numero da Contas: ");
        Integer numero = scanner.nextInt();

        System.out.print("Digite o Nome Completo: ");
        String nome = scanner.next();

        System.out.print("Digite o Saldo: ");
        Double saldo = scanner.nextDouble();

        //Imprimindo os dados informdos

        System.out.printf("Olá %s, " +
                "obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque",nome,agencia,numero,saldo);
    }
}