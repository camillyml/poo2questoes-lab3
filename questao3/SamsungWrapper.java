public class SamsungWrapper implements Carregador {
    
        private CarregadorSamsung carregadorSamsung;
    
        public SamsungWrapper(CarregadorSamsung carregadorSamsung) {
            this.carregadorSamsung = carregadorSamsung;
        }
    
        @Override
        public void carregar() {
            carregadorSamsung.conectarSamsung();
        }
    
}
