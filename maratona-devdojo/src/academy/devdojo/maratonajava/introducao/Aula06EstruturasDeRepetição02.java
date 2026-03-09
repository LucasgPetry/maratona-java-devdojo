package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição02 {
    //imprimir os números pares de 0 a n...
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 50) {
            System.out.println(contador);
            contador += 2;
        }

        //usando for incrementando de 2 em 2
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
        }
        // em ambas as soluções acima, se começar com ímpar não funciona
        // for com verificação
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
