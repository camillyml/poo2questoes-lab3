
public class Main {
    public static void main(String[] args) {
        CalculadoraBinaria calculadoraBinariaExistente = new CalculadoraBinariaExistente();
        Calculadora calculadoraBinaria = new CalculadoraBinariaWrapper(calculadoraBinariaExistente);

        int resultadoBinarioSoma = calculadoraBinaria.somar(5, 3);  
        int resultadoBinarioSubtracao = calculadoraBinaria.subtrair(5, 3); 
        int resultadoBinarioMultiplicacao = calculadoraBinaria.multiplicar(5, 3);  

        System.out.println("Soma binária: " + Integer.toBinaryString(resultadoBinarioSoma));  
        System.out.println("Subtração binária: " + Integer.toBinaryString(resultadoBinarioSubtracao));  
        System.out.println("Multiplicação binária: " + Integer.toBinaryString(resultadoBinarioMultiplicacao));  


        Calculadora calculadoraDecimal = new CalculadoraDecimalWrapper();

        int resultadoDecimalSoma = calculadoraDecimal.somar(5, 3);
        int resultadoDecimalSubtracao = calculadoraDecimal.subtrair(5, 3);
        int resultadoDecimalMultiplicacao = calculadoraDecimal.multiplicar(5, 3);

        System.out.println("Soma decimal: " + resultadoDecimalSoma);  
        System.out.println("Subtração decimal: " + resultadoDecimalSubtracao);  
        System.out.println("Multiplicação decimal: " + resultadoDecimalMultiplicacao); 
    }
}
