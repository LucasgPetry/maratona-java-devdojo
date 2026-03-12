package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "BMW";
        carro1.modelo = "320i";
        carro1.ano = 2023;

        Carro carro2 = new Carro();
        carro2.nome = "Mercedes";
        carro2.modelo = "C180";
        carro2.ano = 2020;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("-------------");
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

        System.out.println("------------");
        //passando a referência do carro1 para o mesmo objeto do carro2
        //os dois estarão com o mesmo endereço e consequentemente os mesmos atributos
        //só pode ser feito isso quando forem do mesmo tipo de classe
        carro1 = carro2;

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("-------------");
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
