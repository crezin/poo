package UML;

public class ReprodutorMusical {


        private void tocar(){
            System.out.println("tocando musica");
        }
        private void pausar(){
            System.out.println("pausando...");
        }
        private void selecionarMusica(String musica){
            switch (musica){
                case "Reprodutor":
                    System.out.println("Reprodozindo");
                case "proxima musica":
                    System.out.println("Proxima musica");
                case "soluciona a musica":
                        System.out.println("Solucionando a musica");
            }
        }
}
