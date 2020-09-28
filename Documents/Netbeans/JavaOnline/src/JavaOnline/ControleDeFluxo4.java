package JavaOnline;

public class ControleDeFluxo4 {

    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;

        }
        for (int i = 0; i < 10; i++) {           //for (variavel local;condição1;condição2){}
            System.out.println("O valor de i é: " + i);        //não esquecer de incializar a variavel local.
        }

        do {
            System.out.println("primeira instrução sempre irá acontecer");
        } while (contador <10);
        System.out.println(contador);
        contador++;
        
        
        
            
            
        
        
        
        
        
    
}

}
