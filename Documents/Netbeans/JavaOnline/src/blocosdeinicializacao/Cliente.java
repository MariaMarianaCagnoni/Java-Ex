package blocosdeinicializacao;

public class Cliente {

    private int[] parcelas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    //para criar um blco de inicialização basta abrir e fechar colchetes
    {
        System.out.println("dentro do bloco de inicialização");
    }

    public Cliente() {
        System.out.println("dentro do construtor");

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

}
