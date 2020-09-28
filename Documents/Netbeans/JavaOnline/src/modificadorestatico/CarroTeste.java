
package modificadorestatico;


public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Corsa",120);
        Carro carro2 = new Carro("Gol",100);
        Carro carro3 = new Carro("Uno",110);

          carro1.imprimir();
          carro3.imprimir();
          carro2.imprimir();
    }
}
