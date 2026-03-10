package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //tipos dos dados de dentro [] nome
        int [] idades = null; // como são do tipo reference, podem ser inicializadas como null
        System.out.println(idades);

        // os elementos dentro do array são indexáveis
        int [] idades2 = new int[3]; // precisa determinar o tamanho na hora de instanciar

        // atribuindo valores ao array
        idades2[0] = 15;
        idades2[1] = 18;
        idades2[2] = 21;

        // não se pode acessar posições que não existem
        System.out.println(idades2[0]);
        System.out.println(idades2[1]);
        System.out.println(idades2[2]);
    }
}
