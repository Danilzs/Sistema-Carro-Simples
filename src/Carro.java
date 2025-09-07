import java.util.Scanner;

public class Carro {
    private boolean ligado = false;
    private boolean desligado = true;
    private int velocidade = 0;
    private String marcha;


    public void operacoes(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você entrou no carro . . . ");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Ligar o carro");
        System.out.println("2 - Sair do carro");
        var opcao = entrada.nextInt();

        while(opcao !=2) {
            if (ligado == false) {
                switch (opcao) {
                    case 1 -> ligarCarro();
                    case 2 -> System.out.println("Saindo do carro . . .");
                }

                System.out.println("O que deseja fazer agora? ");

                System.out.println(
                        "1 - Trocar a marcha\n" +
                        "2 - Acelerar\n" +
                        "3 - Frear\n" +
                        "4- Virar a direita\n" +
                        "5 - Virar a esquerda\n" +
                        "6 - Verificar Velocidade\n" +
                        "7- Desligar carro\n");

                var opcao2 = entrada.nextInt();

                while(opcao2 != 7) {

                    switch (opcao2){
                    }
                }
            }
        }
    }


    public boolean ligarCarro() {

        if (ligado = false) {
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
        if(ligado = true){
            System.out.println("Desligando o carro . . . !");
            System.out.println("Carro desligado!");
            desligado = true;

            return desligado;
        }
        return desligado;
    }

    public void acelerar(){
        int velocidadeAtual = velocidade + 1;
        velocidade = velocidadeAtual;
        System.out.println("Velocidade atual: " + velocidade);
        }

        public void frear(){

        int velocidadeAtual = velocidade - 1;
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
            + "6 - Vinte marcha\n");

             var opcao = entrada.nextInt();

             if(marcha == "Neutro"){
                 switch (opcao){
                     case 1 -> {
                         marcha = "Primeira marcha";
                     System.out.println("Trocando de marcha para . . . ");
                     System.out.println(marcha);
                     System.out.println("Velocidade = " + velocidade);
                     }
                     case 2 -> {
                         marcha = "Segunda marcha";
                         System.out.println("Trocando de marcha para . . . ");
                         System.out.println(marcha);
                         System.out.println("Velocidade = " + velocidade);
                     }
                     case 3 -> {
                         marcha = "Terceira marcha";
                         System.out.println("Trocando de marcha para . . . ");
                         System.out.println(marcha);
                         System.out.println("Velocidade = " + velocidade);
                     }
                     case 4 -> {
                         marcha = "Quarta marcha";
                         System.out.println("Trocando de marcha para . . . ");
                         System.out.println(marcha);
                         System.out.println("Velocidade = " + velocidade);
                     }
                     case 5 -> {
                         marcha = "Quinta marcha";
                         System.out.println("Trocando de marcha para . . . ");
                         System.out.println(marcha);
                         System.out.println("Velocidade = " + velocidade);
                     }
                     case 6 -> {
                         marcha = "Sexta marcha";
                         System.out.println("Trocando de marcha para . . . ");
                         System.out.println(marcha);
                         System.out.println("Velocidade = " + velocidade);
                     }
                     }
                     if(opcao == 1 && velocidade > 20){
                         System.out.println("Reduza a velocidade!");
                 }
             }


        }



    }
