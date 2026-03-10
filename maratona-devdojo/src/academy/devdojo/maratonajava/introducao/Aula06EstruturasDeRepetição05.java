package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição05 {
    public static void main(String[] args) {
        // dado o valor de um carro, descobrir em quantas parcelas ele pode ser parcelado
        // valor mínimo de parcela >= 1000
        // o continue volta para o bloco anterior e começa novamente da próxima iteração
        double valorCarro = 30000;
        for (int quantidadeParcela = (int) valorCarro; quantidadeParcela >= 1; quantidadeParcela--) {
            double valorParcela = valorCarro / quantidadeParcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(quantidadeParcela + " parcelas de R$" + valorParcela + " reais");
        }
    }
}
