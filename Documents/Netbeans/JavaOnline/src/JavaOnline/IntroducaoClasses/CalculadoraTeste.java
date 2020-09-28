package JavaOnline.IntroducaoClasses;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(2, 2, 0);
        calc.divideDoisNumeros(20, 3);
    
        int[] numeros = {1,2,3,4,5};
        calc.somaDeArrays(numeros);
        
        calc.somaVarArgs(3,6,7,9,6,4); //com o varargs não é necessaro criar o array previamente
    }                               //o Java ja de cria,basta passar os numeros como argumento separadas por vírgula.
}
