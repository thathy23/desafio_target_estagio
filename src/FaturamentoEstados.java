//Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
// • SP – R$67.836,43
// • RJ – R$36.678,66
// • MG – R$29.229,88
// • ES – R$27.165,48
// • Outros – R$19.849,53
// Escreva um programa na linguagem que desejar onde calcule o percentual de representação
// que cada estado teve dentro do valor total mensal da distribuidora.

    public class FaturamentoEstados {
        public static void main(String[] args) {

            double sp = 67836.43;
            double rj = 36678.66;
            double mg = 29229.88;
            double es = 27165.48;
            double outros = 19849.53;

            double total = sp + rj + mg + es + outros;

            double percentualSP = (sp / total) * 100;
            double percentualRJ = (rj / total) * 100;
            double percentualMG = (mg / total) * 100;
            double percentualES = (es / total) * 100;
            double percentualOutros = (outros / total) * 100;

            System.out.println("Segue abaixo o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora:");

            System.out.printf("SP: %.0f%%\n", percentualSP);
            System.out.printf("RJ: %.0f%%\n", percentualRJ);
            System.out.printf("MG: %.0f%%\n", percentualMG);
            System.out.printf("ES: %.0f%%\n", percentualES);
            System.out.printf("Outros: %.0f%%\n", percentualOutros);
        }
    }

