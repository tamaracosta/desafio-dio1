import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
  
        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();     
  
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +" ,conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
        
    }

}
