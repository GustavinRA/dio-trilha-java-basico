public class App {
    public static void main(String[] args) {

        smartTv smartTv = new smartTv();

        smartTv.ligar();
        System.out.println("Está ligada ? " + smartTv.ligada);

        smartTv.volumeAtual();
        System.out.println("volume atual " + smartTv.volume);

        smartTv.canalAtual();
        System.out.println("Canal atual: " + smartTv.canal);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual da TV é: " + smartTv.volume );

        smartTv.mudarCanal(21);
        System.out.println("Canal atual é: " + smartTv.canal);


    }
}
