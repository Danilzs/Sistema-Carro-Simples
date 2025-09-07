import java.util.Scanner;

public class Carro {
    private boolean ligado = false;
    private boolean desligado = true;
    private int velocidade = 0;
    private String marcha;


    public void operacoes() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você entrou no carro . . . ");

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Sair do carro");

            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> ligarCarro();
                case 2 -> {
                    System.out.println("Saindo do carro . . .");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
            while (ligado) {
                System.out.println("\nO que deseja fazer agora?");
                System.out.println(
                        "1 - Trocar a marcha\n" +
                                "2 - Acelerar\n" +
                                "3 - Frear\n" +
                                "4 - Virar a direita\n" +
                                "5 - Virar a esquerda\n" +
                                "6 - Verificar Velocidade\n" +
                                "7 - Desligar carro\n");

                int opcao2 = entrada.nextInt();

                switch (opcao2) {
                    case 1 -> trocarMarcha();
                    case 2 -> acelerar();
                    case 3 -> frear();
                    case 6 -> verificarVelocidade();
                    case 7 -> desligarCarro();
                    default -> System.out.println("Opção inválida!");
                }
            }
        }
    }



    public boolean ligarCarro() {

        if (!ligado) {
            System.out.println("Ligando o carro . . . !");
            System.out.println("Carro ligado!");
            velocidade = 0;
            marcha = "Neutro";
            ligado = true;

            System.out.println("Velocidade: " + velocidade);
            System.out.println("Marcha: " + marcha);
            return ligado;
        }
        return ligado;
    }

    public boolean desligarCarro() {
        if(velocidade == 0) {
            System.out.println("Desligando o carro . . . !");
            System.out.println("Carro desligado!");
            ligado = false;
            desligado = true;

            return desligado;
        }
        return desligado;
    }

    public void acelerar(){
        int velocidadeAtual = velocidade + 5;
        velocidade = velocidadeAtual;
        System.out.println("Velocidade atual: " + velocidade);

        if(velocidade > 20 && marcha.equals("Primeira marcha")) {
            System.out.println("Atenção! Você está indo muito rapido! Reduza a velocidade ou passe a marcha!");
        }

        }

        public void frear(){

        int velocidadeAtual = velocidade - 5;
        velocidade = velocidadeAtual;
        System.out.println("Velocidade atual: " + velocidade);
        }

        public void trocarMarcha(){
        Scanner entrada = new Scanner(System.in);
            marcha = "Neutro";
            System.out.println("Marcha atual: " + marcha);
            System.out.println("Passar pra qual marcha?");
            System.out.println("1 - Primeira marcha\n"
            + "2 - Segunda marcha\n"
            + "3 - Terceira marcha\n"
            + "4 - Quatro marcha\n"
            + "5 - Cinco marcha\n"
            + "6 - Sexta marcha\n"
            + "7 - Sair\n");

             var opcao = entrada.nextInt();

             if(marcha == "Neutro"){
                 switch (opcao){
                     case 1 -> {
                         if(velocidade <= 20) {
                             marcha = "Primeira marcha";
                             System.out.println("Trocando de marcha para . . . ");
                             System.out.println(marcha);
                             System.out.println("Velocidade = " + velocidade);
                         } else {
                             System.out.println("Aumente a velocidade! no momento você está a " + velocidade + "Km/h");
                         }
                     }
                     case 2 -> {
                         if(velocidade >= 21 && velocidade <= 40) {
                             marcha = "Segunda marcha";
                             System.out.println("Trocando de marcha para . . . ");
                             System.out.println(marcha);
                             System.out.println("Velocidade = " + velocidade);
                         }else {
                             System.out.println("Aumente a velocidade! no momento você está a " + velocidade + "Km/h");
                         }

                     }
                     case 3 -> {

                         if(velocidade >= 41 && velocidade <= 60) {
                             marcha = "Terceira marcha";
                             System.out.println("Trocando de marcha para . . . ");
                             System.out.println(marcha);
                             System.out.println("Velocidade = " + velocidade);
                         }else {
                             System.out.println("Aumente a velocidade! no momento você está a " + velocidade + "Km/h");
                         }

                     }
                     case 4 -> {
                         if(velocidade >= 61 && velocidade <= 80) {

                             marcha = "Quarta marcha";
                             System.out.println("Trocando de marcha para . . . ");
                             System.out.println(marcha);
                             System.out.println("Velocidade = " + velocidade);
                         }else {
                             System.out.println("Aumente a velocidade! no momento você está a " + velocidade + "Km/h");
                         }

                     }
                     case 5 -> {

                         if(velocidade >= 81 && velocidade <= 100) {

                             marcha = "Quinta marcha";
                             System.out.println("Trocando de marcha para . . . ");
                             System.out.println(marcha);
                             System.out.println("Velocidade = " + velocidade);
                         }
                         else {
                             System.out.println("Aumente a velocidade! no momento você está a " + velocidade + "Km/h");
                         }
                     }
                     case 6 -> {
                         if(velocidade >= 101 && velocidade <= 120) {
                             marcha = "Sexta marcha";
                             System.out.println("Trocando de marcha para . . . ");
                             System.out.println(marcha);
                             System.out.println("Velocidade = " + velocidade);
                         }else {
                             System.out.println("Aumente a velocidade! no momento você está a " + velocidade + "Km/h");
                         }

                     }
                     case 7 -> {
                         System.out.println("Voltando ao menu de operações!");
                         return;
                     }
                 }
             }

    }

    public void verificarVelocidade(){
        System.out.println("Velocidade atual: " + velocidade + "Km/h");
    }


}
