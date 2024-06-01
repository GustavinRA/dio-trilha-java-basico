import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite dois numeros");
        Scanner terminal = new Scanner(System.in);


        try {
            
            System.out.print("Digite primeiro numero: ");
            int numero1 = terminal.nextInt();
            System.out.print("Digite segundo numero: ");
            int numero2 = terminal.nextInt();

            contar(numero1, numero2);    
        } catch (InputMismatchException e) {
            System.out.println("Deve ser digitado apenas numeros.");
        } catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
        

    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {

        if (numero1 >= numero2) {
           throw new ParametrosInvalidosException("Segundo numero deve ser maior");
        } 

        int contagem = numero2 - numero1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Total de ocorrências: " + i);
        }
        
    }

    
}
