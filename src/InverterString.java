//Escreva um programa que inverta os caracteres de um string.
//IMPORTANTE: a) Essa string pode ser informada através de qualquer entrada de sua preferência
// ou pode ser previamente definida no código;
// b) Evite usar funções prontas, como, por exemplo, reverse;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {

            System.out.println("Digite uma string para ser invertida:");
            String original = sc.nextLine();

            String invertida = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                invertida += original.charAt(i);
            }

            System.out.println("String invertida: " + invertida);

            System.out.println("");
            do {
                System.out.println("Deseja inverter outra string? (S/N):");
                continuar = sc.nextLine().toUpperCase();

                if(!continuar.equals("S") && !continuar.equals("N")) {
                    System.out.println("Resposta inválida, digite 'S' para sim ou 'N' para  nao ");
                }

            }while (!continuar.equals("S") && !continuar.equals("N"));


        } while (continuar.equals("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }

}
