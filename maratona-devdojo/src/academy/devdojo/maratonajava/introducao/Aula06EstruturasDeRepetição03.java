package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        //Imprimindo os 25 primeiros valores de 1 a 50
        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25){
                break; // ele termina o bloco acima dele
            }
            System.out.println(i);
        }
    }
}
