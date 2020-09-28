package exercicio35;

public class Estudante {

    private String nome; // private só é acessado pela mesma classe!
    private int idade;
    private double notas[];
    private boolean aprovado;

    public void print() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
    }

    public void media() {
        double media = 0;

        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media > 6) {
            this.aprovado = true;
            System.out.println("aprovado");

        } else {
            this.aprovado = false;  
            System.out.println("Reprovado");
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado() { //para valores booleanos não se usa a grafia GET e sim IS
        return aprovado;
    }
// get =somente para leitura.
// set = inserir dados.
}
