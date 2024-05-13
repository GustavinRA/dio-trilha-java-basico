import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Banco banco = new Banco();
       

       banco.Nome_Cliente();
       banco.Agencia();
       banco.Numero();
       banco.Saldo();

       System.out.println("Por favor, digite o número da Agência");
       int usuario = scanner.nextInt();

       if (usuario == 1021) {
        System.out.println("Olá " + banco.nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + banco.agencia +
        " conta " + banco.numero + " e seu saldo " + banco.saldo + " já está disponível para saque." );
       }else {
        System.out.println("Nome da agencia incorreta, por favor tenta novamente");

       }
       

    }
}