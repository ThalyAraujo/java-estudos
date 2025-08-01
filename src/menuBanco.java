import java.util.Scanner;

public class menuBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 1000.00;
        int opcao;
        
        do {
            System.out.println("\n MENU DA CONTA BANCÁRIA");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção:\n ");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
                    break;  
                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    String depositoStr = entrada.next().replace(',', '.');
                    double deposito;
                    try {
                        deposito = Double.parseDouble(depositoStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor de depósito inválido. Tente novamente.");
                        break;
                    }
                    if (deposito <= 0) {
                        System.out.println("Valor de depósito inválido. Tente novamente.");
                    }
                    else {
                        saldo += deposito;
                        System.out.printf("Depósito realizado com sucesso! Seu novo saldo é: R$ %.2f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado:");
                    double saque = entrada.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                    else {
                        saldo -= saque;
                        System.out.printf("Saque realizado com sucesso! Seu novo saldo é: R$ %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo do menu. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
        entrada.close();
    }   
}
