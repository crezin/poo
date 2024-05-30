package UML;
public interface NavegadorInternet{
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class Nav implements NavegadorInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("exebindo pagina"+ url);
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("adicionando nova aba");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("atualizando pagina... ");

    }

}
