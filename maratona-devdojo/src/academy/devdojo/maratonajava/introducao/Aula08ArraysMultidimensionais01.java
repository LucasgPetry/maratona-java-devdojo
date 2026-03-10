package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //arrays de arrays linkados
        //1 array para os meses - 1,2,3,4,5
        //1 array para os dias referentes - 31,28,31,30
        int[][] dias = new int[3][3]; //aqui cada elemento do primeiro array aponta para um outro de 3 posições
        System.out.println(dias[0]);//endereço de memória do array da primeira posição
        System.out.println(dias[0][0]);//primeiro elemento do array apontado pelo primeiro elemento

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        //imprimindo os endereços de memória de cada um dos arrays
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }

        //imprimindo os dias
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("________________________________");
        //utilizando do foreach
        for (int[] arrayMeses : dias) {
            for (int diasDoMes : arrayMeses) {
                System.out.println(diasDoMes);
            }
        }
    }
}
