public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligar(){
        ligada=true;
    }

    public void desligada(){
        ligada=false;
    }

    public int volumeAtual(){
        return volume;
    }

    public void aumentarVolume() {
        volume ++;
        System.out.println("aumentando volume..." + volume );
    }

    public void diminuirVolume() {
        volume -- ;
    }

    public int canalAtual(){
        return canal;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    
    
}
