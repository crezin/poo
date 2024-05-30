package UML;


import java.util.Scanner;
abstract class IPHONE  implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet{
    public static void main(String[] args){
        //pega as classes e contrui um metodo pra pessoa escolhe
       ReprodutorMusicalimpl r = new ReprodutorMusicalimpl();
        r.tocar("Slipknot");
        r.selecionarMusica("Slipknot");
        r.pausar();

        // Usando AparelhoTelefônico
        telene t = new telene();
        t.atender();
        t.ligar("123456789");
        t.iniciarCorreioVoz();

        // Usando NavegadorInternet
        Nav n = new Nav();
        n.adicionarNovaAba();
        n.atualizarPagina();
        n.exibirPagina("http://example.com");


    }
}
