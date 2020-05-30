
package aula04;

public class Aula04 {

    public static void main(String[] args) {
     Caneta c1 = new Caneta("BIC",0.5);
     Caneta c2 = new Caneta("NIC",0.7);
     Caneta c3 = new Caneta("Faber castel ", 1.0);
     c1.setModelo("BIC");
     c1.setPonta(0.5);
     c1.status();
     c1.teste();
     c2.setModelo("Faber castell");
     c2.setPonta(0.7);
    
     c2.status();
     c2.teste();
     c3.status();
     c3.teste();
     
     
        
     
    }
    
}
