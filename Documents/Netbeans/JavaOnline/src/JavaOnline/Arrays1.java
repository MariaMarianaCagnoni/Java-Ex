package JavaOnline;

public class Arrays1 {
 //todo array é um objeto
    //somento um array pode ser declarado com seu tipo primitivo EX: linha 7
    public static void main(String[] args) {
        int[] idades = new int[3]; //int[] idades = é a parte REFERENCE;enquanto new  int[3] é onde é criado o espaço na memoria
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;
        System.out.println("Idades:" + idades[0] + "," + idades[1] + "," + idades[2]);
        
    }
}
