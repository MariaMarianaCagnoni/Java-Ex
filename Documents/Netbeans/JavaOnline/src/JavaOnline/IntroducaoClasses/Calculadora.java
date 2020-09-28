package JavaOnline.IntroducaoClasses;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2, int resul) {

        System.out.println(resul = num1 * num2);

    }

    public void divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; // aqui o return funciona como um break

        }
        System.out.println("não pode dividir por zero");

    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("dentro do alteraDoisNumeros");
        System.out.println("num1"+num1);
        System.out.println("num2"+num2);
    }
    public void somaDeArrays(int[] numeros){
        int soma  = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int...numeros){ // por método só é um possivel UM varArgs,mais que um dará erro.
        int soma  = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    //é possivel passar outros parametros para o método(ex: double numero),porem o VarArgs tem que ser o ULTIMO.
    }
}
