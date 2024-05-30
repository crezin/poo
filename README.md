# iPhone Component UML Model

Este projeto modela e implementa as funcionalidades principais do iPhone, conforme apresentado no vídeo de lançamento do iPhone em 2007. As funcionalidades abrangem um Reprodutor Musical, um Aparelho Telefônico e um Navegador na Internet. A modelagem foi realizada utilizando UML e a implementação está em Java.

## Funcionalidades

1. **Reprodutor Musical**
    - `tocar()`: Inicia a reprodução de música.
    - `pausar()`: Pausa a reprodução de música.
    - `selecionarMusica(String musica)`: Seleciona uma música para reprodução.

2. **Aparelho Telefônico**
    - `ligar(String numero)`: Faz uma chamada para o número especificado.
    - `atender()`: Atende uma chamada.
    - `iniciarCorreioVoz()`: Inicia o correio de voz.

3. **Navegador na Internet**
    - `exibirPagina(String url)`: Exibe a página da URL especificada.
    - `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
    - `atualizarPagina()`: Atualiza a página atual.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **src/**
  - **ReprodutorMusical.java**: Interface para funcionalidades do Reprodutor Musical.
  - **AparelhoTelefonico.java**: Interface para funcionalidades do Aparelho Telefônico.
  - **NavegadorInternet.java**: Interface para funcionalidades do Navegador na Internet.
  - **iPhone.java**: Classe que implementa todas as funcionalidades mencionadas.

## Diagrama UML

![Diagrama UML](path/to/uml-diagram.png)

O diagrama UML acima representa a estrutura das classes e interfaces do projeto.

## Como Executar

1. Clone este repositório:
    ```sh
    git clone https://github.com/seu-usuario/iphone-uml-model.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd iphone-uml-model
    ```
3. Compile os arquivos Java:
    ```sh
    javac src/*.java
    ```
4. Execute a classe principal (se houver uma classe principal para testar):
    ```sh
    java src.iPhone
    ```

## Exemplo de Uso

Aqui está um exemplo de como utilizar a classe `iPhone`:

```java
public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Funcionalidades do Reprodutor Musical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Funcionalidades do Aparelho Telefônico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Funcionalidades do Navegador na Internet
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
# iPhone Component UML Model

Este projeto modela e implementa as funcionalidades principais do iPhone, conforme apresentado no vídeo de lançamento do iPhone em 2007. As funcionalidades abrangem um Reprodutor Musical, um Aparelho Telefônico e um Navegador na Internet. A modelagem foi realizada utilizando UML e a implementação está em Java.

## Funcionalidades

1. **Reprodutor Musical**
    - `tocar()`: Inicia a reprodução de música.
    - `pausar()`: Pausa a reprodução de música.
    - `selecionarMusica(String musica)`: Seleciona uma música para reprodução.

2. **Aparelho Telefônico**
    - `ligar(String numero)`: Faz uma chamada para o número especificado.
    - `atender()`: Atende uma chamada.
    - `iniciarCorreioVoz()`: Inicia o correio de voz.

3. **Navegador na Internet**
    - `exibirPagina(String url)`: Exibe a página da URL especificada.
    - `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
    - `atualizarPagina()`: Atualiza a página atual.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **src/**
  - **ReprodutorMusical.java**: Interface para funcionalidades do Reprodutor Musical.
  - **AparelhoTelefonico.java**: Interface para funcionalidades do Aparelho Telefônico.
  - **NavegadorInternet.java**: Interface para funcionalidades do Navegador na Internet.
  - **iPhone.java**: Classe que implementa todas as funcionalidades mencionadas.

## Diagrama UML

![Diagrama UML](path/to/uml-diagram.png)

O diagrama UML acima representa a estrutura das classes e interfaces do projeto.

## Como Executar

1. Clone este repositório:
    ```sh
    git clone https://github.com/seu-usuario/iphone-uml-model.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd iphone-uml-model
    ```
3. Compile os arquivos Java:
    ```sh
    javac src/*.java
    ```
4. Execute a classe principal (se houver uma classe principal para testar):
    ```sh
    java src.iPhone
    ```

## Exemplo de Uso

Aqui está um exemplo de como utilizar a classe `iPhone`:

```java
public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Funcionalidades do Reprodutor Musical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Funcionalidades do Aparelho Telefônico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Funcionalidades do Navegador na Internet
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
