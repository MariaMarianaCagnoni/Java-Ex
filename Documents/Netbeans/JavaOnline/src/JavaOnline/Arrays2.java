package JavaOnline;

public class Arrays2 {

    public static void main(String[] args) {
        // o numero padrão de uma array int,byte,float,double,short,long é zero
        //char = unicode vazio(espaco em branco)
        //boolean será false
        //arrays de objetos será NULL_ex: String
        //Arrays NÃO SÃO expansiveis.
        int[] idade = new int[4];
        System.out.println(idade[0] + "," + idade[1] + "," + idade[2] + "," + idade[3]);
        //será impresso 0,0,0,0.

        String[] nome = new String[4];
        nome[0] = "Naruto";
        nome[1] = "Goku";
        nome[2] = "Inu yasha";
        nome[3] = "Victor";
        for (int i = 0; i < nome.length; i++) { // o lenght já pega o tamanho do array original
            System.out.println("Nomes: " + nome[i]);
        }
        //um for para varrer um Array.
    }

}
