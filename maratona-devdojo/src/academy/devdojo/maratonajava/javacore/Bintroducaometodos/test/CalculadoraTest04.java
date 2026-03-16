package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro da calculadora teste 4");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
    // parâmetros de métodos de tipo primitivo são passados sempre em memória (criando cópias)
    // não é passado como referência
}
