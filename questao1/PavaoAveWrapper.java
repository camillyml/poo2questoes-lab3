package questao1;

class PavaoAveWrapper implements Ave{

    private Pavao pavao;

    public PavaoAveWrapper (Pavao pa){
         this.pavao = pa;
    }
    @Override
    public void emitirSom() {
        
        pavao.cantar();
    }
    @Override
    public void voar() {
        
    }

    
}
