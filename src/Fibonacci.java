//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2
// valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem
// que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
// avisando se o número informado pertence ou não a sequência. IMPORTANTE: Esse número pode ser informado
// através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            int numero = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.println("Digite um número inteiro para verificar se pertence à sequência de Fibonacci:");

                if (sc.hasNextInt()) {
                    numero = sc.nextInt();
                    entradaValida = true;
                } else {
                    System.out.println("Entrada inválida, digite apenas um número inteiro.");
                    sc.next();
                }
            }

            sc.nextLine();

            int a = 0;
            int b = 1;
            int valorFibonacci = 0;

            while (valorFibonacci < numero) {
                valorFibonacci = a + b;
                a = b;
                b = valorFibonacci;
            }

            if (valorFibonacci == numero) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }

            do {
                System.out.println("Deseja verificar outro número? (S/N):");
                continuar = sc.nextLine().toUpperCase();

                if (!continuar.equals("S") && !continuar.equals("N")) {
                    System.out.println("Resposta inválida, digite 'S' para sim ou 'N' para não.");
                }
            } while (!continuar.equals("S") && !continuar.equals("N"));

        } while (continuar.equals("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
