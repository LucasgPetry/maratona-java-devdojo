package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 - infantil
        //idade >=15 && idade <18 - juvenil
        //idade > 18 - adulto
        /*
        Todas as variáveis dentro de métodos possuem escopo local, e todas as de escopo local precisam ser
        inicializadas antes de serem executadas
         */
        int idade = 39;
        String categoria; //inicializando vazia

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);
    }
}
