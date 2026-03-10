package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descobrir em quantas parcelas ele pode ser parcelado
        // valor mínimo de parcela >= 1000
        double valorCarro = 30000;
        for (int quantidadeParcela = 1; quantidadeParcela <= valorCarro; quantidadeParcela++) {
            double valorParcela = valorCarro / quantidadeParcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println(quantidadeParcela + " parcelas de R$" + valorParcela + " reais");
        }
    }
}
