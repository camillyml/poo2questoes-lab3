package questao1;

class PatoAveWrapper implements Ave{

    private Pato pato;

    public PatoAveWrapper (Pato p){
        this.pato = p;
    }
    @Override
    public void emitirSom() {
        
        pato.gasnar();
    }

    @Override
    public void voar() {
        pato.voar();
        
    }
    

}
