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
        System.out.println("Olá " + banco.Nome_Cliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + banco.Agencia() +
        " conta " + banco.Numero() + " e seu saldo " + banco.Saldo() + " já está disponível para saque." );
       }else {
        System.out.println("Nome da agencia incorreta, por favor tenta novamente");

       }
       

    }
}