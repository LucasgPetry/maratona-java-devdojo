package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 3000;
        String mensagemDoar = "Vou doar";
        String mensagemNaoDoar = "Não vou doar";
        String resultado;

        if (salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        //operador ternário
        // condição ? verdadeiro : falso
        // serve para outros tipos primitivos

        String resultado2 = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado2);

        //baseado em três condições
        String tipoSalario = salario > 5000 ? "Alto" : salario >=3000 && salario < 5000 ? "Mediano": "Baixo";
        System.out.println(tipoSalario);
    }
}
