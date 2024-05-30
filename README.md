# Projeto UML: IPHONE

Este projeto implementa um modelo UML de um iPhone com funcionalidades de reprodutor musical, aparelho telefônico e navegador de internet, utilizando interfaces e classes em Java.

## Estrutura do Projeto

O projeto está organizado em diferentes arquivos Java, cada um representando uma funcionalidade específica do iPhone:

1. `IPHONE.java` - Classe principal e abstrata que demonstra o uso das interfaces implementadas.
2. `ReprodutorMusical.java` - Interface e implementação para funcionalidades de reprodutor musical.
3. `AparelhoTelefônico.java` - Interface e implementação para funcionalidades de aparelho telefônico.
4. `NavegadorInternet.java` - Interface e implementação para funcionalidades de navegador de internet.

## Arquivos e Classes

### IPHONE.java

```java
package UML;

import java.util.Scanner;

abstract class IPHONE implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet {
    public static void main(String[] args) {
        // Usando ReprodutorMusical
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
