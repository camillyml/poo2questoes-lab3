public class AppleWrapper implements Carregador{
    private CarregadorApple carregadorApple;

    public AppleWrapper(CarregadorApple carregadorApple) {
        this.carregadorApple = carregadorApple;
    }

    @Override
    public void carregar() {
        carregadorApple.conectarIPhone();
    }
}
