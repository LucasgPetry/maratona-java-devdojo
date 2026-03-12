package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        // como o metodo estava com retorno 0, quaisquer números sempre darão o mesmo resultado

        calculadora.imprimeDivisaoDoisNumeros(50, 0); // por não ter retorno, não pode ser executado dentro do sout

    }
}
