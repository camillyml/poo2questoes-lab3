public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos carregadores
        CarregadorApple carregadorApple = new CarregadorApple();
        CarregadorSamsung carregadorSamsung = new CarregadorSamsung();

        // Envolvendo os carregadores com seus wrappers
        Carregador appleWrapper = new AppleWrapper(carregadorApple);
        Carregador samsungWrapper = new SamsungWrapper(carregadorSamsung);

        // Testando o carregamento dos dispositivos
        System.out.println("teste do carregador Apple:");
        appleWrapper.carregar();  // Deve exibir "Carregando dispositivo Apple..."

        System.out.println("\nteste do carregador Samsung:");
    
        samsungWrapper.carregar();  // Deve exibir "Carregando dispositivo Samsung..."
    }
} 
    

