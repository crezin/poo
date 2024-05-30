package UML;
public interface ReprodutorMusical{

    void tocar(String musica);

    void pausar();
    void selecionarMusica(String musica);
}
class ReprodutorMusicalimpl implements ReprodutorMusical{
        @Override
        public void tocar(String musica){
            System.out.println("tocando musica" + musica );
        }
        @Override
        public void pausar(){
            System.out.println("pausando...");
        }
        @Override
        public void selecionarMusica(String musica){
            System.out.println("tocando musica" + musica);
        }
}
