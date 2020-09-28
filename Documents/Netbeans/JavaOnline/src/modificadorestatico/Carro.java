package modificadorestatico;
//atributos static são compartilhados com todos os objetos da classe em que foi declarado.
public class Carro {

    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240; /** Ele muda o escopo de um método ou atributo. 
    Com o static, ao invés deles pertencerem à instância do objeto, eles pertencem à classe**/

    /**
     * Ele muda o escopo de um método ou atributo.Com o static, ao invés deles pertencerem à instância do objeto, eles pertencem à classe
     * @param nome
     * @param velocidadeMaxima
     */
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        
        
    }

    public Carro() {
    }
    
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(Carro.velocidadeLimite); // quando usar o modificador "static" fazer referência a classe e não aos tributos
        System.out.println(this.velocidadeMaxima);
        System.out.println("----------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
