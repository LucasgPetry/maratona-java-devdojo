package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        //inicializando arrays multidimensionais
        int[][] arrayInt = new int[3][];

        int[] array2 = {4,5};

        arrayInt[0] = new int[]{1, 2, 3};//o primeiro elemento do base faz referência para um array de 3 posições
        arrayInt[1] = array2;//o primeiro elemento do base faz referência para um array de 2 posições
        arrayInt[2] = new int[]{6, 7, 8, 9};//o primeiro elemento do base faz referência para um array de 4 posições

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int numeros : arrayBase) {
                System.out.print(numeros);
            }
        }
        System.out.println("\n--------");
        // outra forma de criar o arraymultidimensional
        int[][] arrayMulti = {{1,2,3}, {4,5}, {6,7,8,9}};
        for (int[] arraysBases: arrayMulti){
            for (int numeros:arraysBases){
                System.out.println(numeros);
            }
        }
    }
}
