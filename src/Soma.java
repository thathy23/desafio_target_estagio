//1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
// Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } Imprimir(SOMA);
// Ao final do processamento, qual será o valor da variável SOMA?

public class Soma {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
            System.out.println(SOMA);
        }

        System.out.println("O valor da variável SOMA é "+ SOMA);

    }
}

