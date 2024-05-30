# Projeto UML: IPHONE

Este projeto implementa um modelo UML de um iPhone com funcionalidades de reprodutor musical, aparelho telefônico e navegador de internet, utilizando interfaces e classes em Java.

## Estrutura do Projeto

O projeto está organizado em diferentes arquivos Java, cada um representando uma funcionalidade específica do iPhone:

1. `IPHONE.java` - Classe principal e abstrata que demonstra o uso das interfaces implementadas.
2. `ReprodutorMusical.java` - Interface e implementação para funcionalidades de reprodutor musical.
3. `AparelhoTelefônico.java` - Interface e implementação para funcionalidades de aparelho telefônico.
4. `NavegadorInternet.java` - Interface e implementação para funcionalidades de navegador de internet.

## Arquivos e Classes


# Funcionalidades

Reprodutor Musical:

tocar(String musica): Toca a música especificada.
pausar(): Pausa a reprodução da música.
selecionarMusica(String musica): Seleciona e toca a música especificada.
Aparelho Telefônico:

ligar(String numero): Liga para o número especificado.
atender(): Atende uma chamada.
iniciarCorreioVoz(): Inicia o correio de voz.
Navegador de Internet:

exibirPagina(String url): Exibe a página da URL especificada.
adicionarNovaAba(): Adiciona uma nova aba no navegador.
atualizarPagina(): Atualiza a página atual.
## Arquivos e Classes

# IPHONE.java

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
```

# ReprodutorMusical.java
```
Copiar código
package UML;

// Interface ReprodutorMusical com métodos tocar, pausar e selecionarMusica
public interface ReprodutorMusical {
    void tocar(String musica);
    void pausar();
    void selecionarMusica(String musica);
}

// Implementação da interface ReprodutorMusical
class ReprodutorMusicalimpl implements ReprodutorMusical {
    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}
```
  # AparelhoTelefônico.java
```
Copiar código
package UML;

// Interface AparelhoTelefônico com métodos ligar, atender e iniciarCorreioVoz
public interface AparelhoTelefônico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Implementação da interface AparelhoTelefônico
class telene implements AparelhoTelefônico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
```
# NavegadorInternet.java
```
Copiar código
package UML;

// Interface NavegadorInternet com métodos exibirPagina, adicionarNovaAba e atualizarPagina
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Implementação da interface NavegadorInternet
class Nav implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
