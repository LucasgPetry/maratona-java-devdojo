package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Imprimir se o dia é útil ou não
        // 1 é domingo

        byte dia = 4;
        String tipo;
        if (dia >= 2 && dia <= 6){
            tipo = "Dia útil";
        }else {
            tipo = "Fim de semana";
        }

        System.out.println(tipo);

        // pode-se agrupar os cases
        byte dia2 = 4;
        switch (dia2){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;

            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
