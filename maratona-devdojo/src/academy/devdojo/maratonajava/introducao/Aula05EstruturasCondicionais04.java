package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // se salario for entre 0 e 34712 - 9,7%
        // se salario for entre 34713 e 68507 - 37,35%
        // se salario for >= que 68508 - 49,5%

        double salario = 68508;
        String imposto;

        if (salario <= 34712){
            imposto = "9,7%";
        } else if (salario >= 34713 && salario <=68507) {
            imposto = "37,35%";
        }else {
            imposto = "49,5%";
        }
        System.out.println(imposto);

        // outra maneira de fazer
        double salario2 = 68508;
        double primeiraFaixa = 9.7/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.5/100;
        double imposto2;

        if (salario2 <= 34712){
            imposto2 = salario2* primeiraFaixa;
        } else if (salario2 >= 34713 && salario2 <=68507) {
            imposto2 = salario2* segundaFaixa;
        }else {
            imposto2 = salario2* terceiraFaixa;
        }
        System.out.println(imposto2);

    }
}
