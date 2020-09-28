/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOnline.IntroducaoClasses;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "Corsa";
        carro.placa = "ABC1234";
        carro.velocidadeMaxima = 220f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
