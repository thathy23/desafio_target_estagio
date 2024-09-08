//3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na
// linguagem que desejar, que calcule e retorne:
// O menor valor de faturamento ocorrido em um dia do mês;
// O maior valor de faturamento ocorrido em um dia do mês;
// Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
// IMPORTANTE: a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
// b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
// Estes dias devem ser ignorados no cálculo da média;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class FaturamentoMensal {

    public static void main(String[] args) {
        // incluindo o JAR do Gson manualmente para manipulação de JSON:
        String filePath = "/home/tati/Development/Desafio Target Estagio/desafio_Target/src/data.json";

        try {
            Gson gson = new Gson();
            Type faturamentoListType = new TypeToken<List<Faturamento>>(){}.getType();
            List<Faturamento> faturamentos = gson.fromJson(new FileReader(filePath), faturamentoListType);

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            //ignorar dia sem faturamento
            for (Faturamento faturamento : faturamentos) {
                if (faturamento.getValor() > 0) {

                    if (faturamento.getValor() < menorFaturamento) {
                        menorFaturamento = faturamento.getValor();
                    }
                    if (faturamento.getValor() > maiorFaturamento) {
                        maiorFaturamento = faturamento.getValor();
                    }

                    somaFaturamento += faturamento.getValor();
                    diasComFaturamento++;
                }
            }

            //dias com faturamento
            double mediaFaturamento = (diasComFaturamento > 0) ? somaFaturamento / diasComFaturamento : 0;
            int diasAcimaDaMedia = 0;

            //dias com faturamento superior à média
            for (Faturamento faturamento : faturamentos) {
                if (faturamento.getValor() > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }
            //O enunciado nao especifica a moeda, entao escolhi Real
            System.out.printf(" Menor faturamento: R$ %,.2f\n ",menorFaturamento);
            System.out.printf("Maior faturamento: R$ %,.2f\n",maiorFaturamento);
            System.out.println("Número de dias acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
             System.out.println("Erro ao acessar o json, verifique se o arquivo está no local especificado e se você tem permissão para acessar.");
             System.out.println("Detalhes do erro: " + e.getMessage());
            }
    }

    // faturamento diário
    static class Faturamento {
        private int dia;
        private double valor;

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }
}
