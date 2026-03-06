package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição {
    public static void main(String[] args) {
        //while, do while e for
        // em casos de apenas 1 expressão, as chaves podem ser ocultadas

        //while (precisa ser booleano dentro)
        int contador = 12;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;

        }

        // do while
        // executa pelo menos uma vez, mesmo com condições falsas

        contador = 0; // aqui não está declarando novamente, só reatribuindo seu valor
        do {
            System.out.println("Dentro do do-while" + contador);
            contador++;
        } while (contador <= 10);

        // for
        // variável;condição;como será alterada

        for (int i = 0; i < 10; i++) {
            System.out.println("For" + i);

        }

    }
}
