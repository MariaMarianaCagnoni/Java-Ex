
package blocosdeinicializacao;
//bloco de inicialização vem antes do constructor.


public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("dentro do objeto,(numero de parcelas)");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela + " ");
            
        
        }
    }
}
