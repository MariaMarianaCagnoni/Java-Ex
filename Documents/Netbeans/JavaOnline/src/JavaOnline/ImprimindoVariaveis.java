
package JavaOnline;

// comentario de uma linha apenas.

/*
comentario 
de
várias linhas

*/

/***
 * comentario oficial do java doc
 * @author User
 */
public class ImprimindoVariaveis {
    public static void main(String[] args) {
        int idade =10;
        char caractere = 'B'; // o char tem um tamanho de dois bytes,pode ser dois numeros inteiros tambem.Entretando,o numero é traduzido pra tabela unicode.
        boolean verdadeiro = true;
        boolean falso = false;
        String nome = "lucas ";
        String tel = "98745-47";
        String endereco = "rua dos alveires";
                
        
        System.out.println("Dados impressos" + idade);
        System.out.println(caractere);
        System.out.println(" O " + nome + " domiciliado no endereço: "+ endereco + ""
                + " e telefone " + tel + ", não possui nenhum tipo de pendência");
    }
}
