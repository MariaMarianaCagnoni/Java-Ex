
package JavaOnline;


public class OperadoresDeAtribuição {
    public static void main(String[] args) {
        int salario  = 1800;
        //salario = salario + 1000;
        //salario += 1000;
        salario = salario +(int) (salario*0.1); // o (int) trata-se de um casting,conversão de uma valor em outro  CONVERSÃO EXPLICITA NO CASO;
        System.out.println(salario);
    }
    
}
