package exercicio35;

public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome( "mariana");
        estudante.setIdade(24);
        estudante.setNotas(new double[]{2,3,1});
        estudante.print();
        estudante.media();
        
        
        
        
        

    }

}
