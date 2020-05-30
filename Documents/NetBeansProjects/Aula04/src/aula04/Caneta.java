
package aula04;


public class Caneta {
    protected String modelo;
    private double ponta; 

    public Caneta(String modelo, double ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
        
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }
    

public void status(){
    System.out.println("Sobre a caneta:");
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ponta: " + this.getPonta());
}
 public void teste(){
     if (ponta == 0.5)
         System.out.println("Portanto, sua ponta é fina");
     else
     {
        if (ponta == 0.7)
             System.out.println("Portanto, Sua ponta é grossa");
        else
        {
            System.out.println("Tua ponta não consta no cadastro");
        }
     }
 }



}


    
