public class Main {
    public static void main(String[] args) {
        
        CarregadorApple carregadorApple = new CarregadorApple();
        CarregadorSamsung carregadorSamsung = new CarregadorSamsung();

        Carregador appleWrapper = new AppleWrapper(carregadorApple);
        Carregador samsungWrapper = new SamsungWrapper(carregadorSamsung);

        System.out.println("teste do carregador Apple:");
        appleWrapper.carregar();  

        System.out.println("\nteste do carregador Samsung:");
        samsungWrapper.carregar();  
    }
} 
    

