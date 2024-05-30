package UML;
public interface AparelhoTelefônico{
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}
class telene implements AparelhoTelefônico {
    @Override
    public void ligar(String numero){
        System.out.println("ligando..." + numero);
    }
    @Override
    public void atender(){
        System.out.println("atendendo telefone..." );
    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("iniciando um correio de voz");
    }
}
