package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("Dentro do if");
        }

        if (false) {
            System.out.println("Isso não será executado");
        }

        System.out.println("Fora do if");

        int idade = 15;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado) {
            System.out.println("Pode vender");
        }

        if (isAutorizado == false){
            System.out.println("Não pode vender");
        }
        // ==false e ! aqui são a mesma coisa
        if (!isAutorizado){
            System.out.println("Não pode vender");
        }

        boolean c = false;
        if (c = true){
            System.out.println("Isso executa, pois recebe true dentro do if");
        }

        //uso do else
        if (isAutorizado){
            System.out.println("Autorizado");
        }else {
            System.out.println("Não autorizado");
        }

    }
}
