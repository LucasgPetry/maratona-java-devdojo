package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10; // 4 bytes
        long numeroGrande = 100000L; //8 bytes
        // float e double ambos decimais
        double salarioDouble = 2000.D; // 8 bytes
        float salarioFloat = 2500.F; // 4 bytes
        byte idadeByte = -128; //1 byte 127 ao -128
        short idadeShort = 10; //2 bytes
        boolean verdade = true;
        boolean falso = false;
        char caractere = '\u0041'; //2 bytes

        System.out.println("A idade é "+age+" anos");
        System.out.println(caractere);

        // fazendo casting (forçando para um tipo de dados menor)
        int idade = (int) 10000000000L;
        System.out.println(idade);

        // fazendo casting para um tipo maior
        float salarioCasting = (float) 2500.00D;
        System.out.println(salarioCasting);

        String frase = "primeira string java";
        System.out.println(frase);


    }
}
