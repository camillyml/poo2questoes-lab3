
public class Main {
    public static void main(String[] args) {
        
        Pato patoDomestico = new PatoDomestico();
        Ave patoAve = new PatoAveWrapper(patoDomestico);

        System.out.println("Usando PatoAveWrapper:");
        patoAve.emitirSom(); 
        patoAve.voar();   

      
        Pavao pavaoAzul = new PavaoAzul();
        Ave pavaoAve = new PavaoAveWrapper(pavaoAzul);

        System.out.println("\nUsando PavaoAveWrapper:");
        pavaoAve.emitirSom(); 
        pavaoAve.voar();      
    }
}
