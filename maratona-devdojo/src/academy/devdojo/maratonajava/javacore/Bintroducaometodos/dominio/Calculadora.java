package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    //retorno e saída de métodos são diferentes
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0; // aqui o return impede a divisão por 0 e funciona como um break
        }
        return num1 / num2; // isso aqui poderia estar em um else sem prejudicar o desempenho do método
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        // realizando sem o controle do return pois é void
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return; //funciona como o break dos métodos void
        }//else{ //sem esse else, o programa continuaria sendo executado normalmente na divisão por 0
        System.out.println(num1 / num2);
        //}
    }
}
