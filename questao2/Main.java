
public class Main {
    public static void main(String[] args) {
        CalculadoraBinaria calculadoraBinariaExistente = new CalculadoraBinariaExistente();
        Calculadora calculadoraBinaria = new CalculadoraBinariaWrapper(calculadoraBinariaExistente);

        int resultadoBinarioSoma = calculadoraBinaria.somar(5, 3);  
        int resultadoBinarioSubtracao = calculadoraBinaria.subtrair(5, 3); 
        int resultadoBinarioMultiplicacao = calculadoraBinaria.multiplicar(5, 3);  

        System.out.println("soma binária: " + Integer.toBinaryString(resultadoBinarioSoma));  
        System.out.println("subtração binária: " + Integer.toBinaryString(resultadoBinarioSubtracao));  
        System.out.println("multiplicação binária: " + Integer.toBinaryString(resultadoBinarioMultiplicacao));  

        Calculadora calculadoraDecimal = new CalculadoraDecimalWrapper();

        int resultadoDecimalSoma = calculadoraDecimal.somar(5, 3);
        int resultadoDecimalSubtracao = calculadoraDecimal.subtrair(5, 3);
        int resultadoDecimalMultiplicacao = calculadoraDecimal.multiplicar(5, 3);

        System.out.println("soma decimal: " + resultadoDecimalSoma);  
        System.out.println("subtração decimal: " + resultadoDecimalSubtracao);  
        System.out.println("multiplicação decimal: " + resultadoDecimalMultiplicacao); 
    }
}
