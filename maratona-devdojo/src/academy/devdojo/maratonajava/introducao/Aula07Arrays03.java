package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // inicializando array de forma dinâmica com os números
        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int[] numeros2 = new int[]{9, 8, 7, 6, 5};
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        //estrutura foreach - sem índices específicos
        for (int num : numeros2) {
            System.out.println(num);
        }

        //lembrando: dentro do for as variáveis possuem escopo local
    }
}
