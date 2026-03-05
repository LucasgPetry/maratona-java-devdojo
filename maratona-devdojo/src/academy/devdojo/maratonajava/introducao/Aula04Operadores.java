package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //operadores básicos: + - * /
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero2-numero1);
        System.out.println("Valor: "+numero2+numero1);
        System.out.println(numero2+numero1+" Valor: "+numero2+numero1);

        int resultadoInteiro = numero1 / numero2; //warning devido ao resultado 0
        double numero3 = 10;
        double numero4 = 20;
        double resultadoDouble = numero3/numero4;

        System.out.println(resultadoInteiro);
        System.out.println(resultadoDouble);

        //%
        int resto = 20 % 3;
        System.out.println(resto);

        // operadores lógicos: < > <= >= == != - retornam true ou false
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezDiferenteDeVinte "+isDezDiferenteDeVinte);

        //operadores && (AND) || (OR) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);


    }
}
