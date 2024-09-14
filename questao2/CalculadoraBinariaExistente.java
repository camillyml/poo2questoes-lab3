public class CalculadoraBinariaExistente implements CalculadoraBinaria {
    @Override
    public String somar(String a, String b) {
        int result = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(result);
    }

    @Override
    public String subtrair(String a, String b) {
        int result = Integer.parseInt(a, 2) - Integer.parseInt(b, 2);
        return Integer.toBinaryString(result);
    }
}

