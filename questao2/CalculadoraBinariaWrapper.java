public class CalculadoraBinariaWrapper implements Calculadora {
    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraBinariaWrapper(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String result = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(result, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String result = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));
        return Integer.parseInt(result, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;  
    }

}


