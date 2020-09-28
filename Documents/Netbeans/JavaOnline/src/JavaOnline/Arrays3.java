package JavaOnline;



public class Arrays3 {

    public static void main(String[] args) {
        int[] numeros = new int[5];// o Arrray não está inicializado
        int[] numeros2 = {1, 2, 3}; // Array já inicializado
        int[] numeros3 = new int[]{3, 4, 5}; //IMPORTANTE: não se pode passar o numero,se não dá erro
        
        
       for(int i=0;i<numeros2.length;i++){
           System.out.println((i+1)+"- valores: "+numeros2[i]);
        }
         for(int aux: numeros2){ // AUX variavel local.
             System.out.println(aux); // FOREACH
             
             
         }  
        }
        

    }


