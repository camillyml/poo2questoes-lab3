
public class Main {
    public static void main(String[] args) {
        // Criando um PatoDomestico
        Pato patoDomestico = new PatoDomestico();
        Ave patoAve = new PatoAveWrapper(patoDomestico);

        System.out.println("Usando PatoAveWrapper:");
        patoAve.emitirSom(); // Deve imprimir "Pato doméstico grasnando"
        patoAve.voar();      // Deve imprimir "Pato doméstico voando"

        // Criando um PavaoAzul
        Pavao pavaoAzul = new PavaoAzul();
        Ave pavaoAve = new PavaoAveWrapper(pavaoAzul);

        System.out.println("\nUsando PavaoAveWrapper:");
        pavaoAve.emitirSom(); // Deve imprimir "Pavão azul cantando"
        pavaoAve.voar();      // Não faz nada (método voar não é implementado para Pavao)
    }
}
