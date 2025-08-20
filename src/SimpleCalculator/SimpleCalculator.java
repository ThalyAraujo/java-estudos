import java.util.Scanner;
import java.util.InputMismatchException;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {

            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            
            int choice = 0;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número entre 1 e 5.");
                scanner.next();
                continue;
            }

            if (choice == 5) {
                continueCalculation = false;
                System.out.println("Saindo da calculadora.");
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Operação inválida. Por favor, escolha 1, 2, 3, 4 ou 5.");
                continue; 
            }

            double num1 = 0;
            double num2 = 0;

            try {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira números válidos.");
                scanner.next();
                continue;
            }

        switch (choice) {
            case 1:
                System.out.println("Resultado: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + multiply(num1,  num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + divide(num1, num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default: 
            System.out.println("Operação inválida. Por favor, escolha 1, 2, 3 ou 4.");
        }
    }

                scanner.close();
    }


            public static double add(double a, double b) {
            return a + b;
        }

        public static double subtract(double a, double b) {
            return a - b;
        }

        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b){
            return a / b;
        }
    
    }
