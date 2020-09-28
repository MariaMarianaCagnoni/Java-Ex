package sobrecargametodos;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("");
       
        funcionario.setNome("Mariana");
        funcionario.setCpf("98147558-478");
        funcionario.setSalario(4500.37);
        funcionario.imprimir();
        
    }
}
