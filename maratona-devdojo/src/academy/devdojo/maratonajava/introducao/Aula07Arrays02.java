package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // valores padrões de inicialização de arrays
        // byte, short, int, long, double, float 0
        // char '\u0000' ''
        // boolean false
        // String null

        // os arrays não alteram seu tamanho de forma dinâmica
        // se quiser alterar precisa compilar novamente
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Luffy";

        //pegando todos os valores do array de forma dinâmica
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[5]; // fazendo isso a referência antiga morre e um novo objeto é apontado
    }
}
