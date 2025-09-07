import java.util.Scanner;

public class Carro {
    private boolean ligado = false;
    private int velocidade = 0;
    private String marcha = "Neutro";

    private static final String[] MARCHAS = {
            "Neutro", "Primeira marcha", "Segunda marcha", "Terceira marcha",
            "Quarta marcha", "Quinta marcha", "Sexta marcha"
    };

    //Faixa de velocidade permitida, um array contendo um minimo e um maximo de velocidade.
    private static final int[][] LIMITES_MARCHA ={
            {0,0},
            {0,20},
            {21,40},
            {41,60},
            {61,80},
            {81,100},
            {101,120}
    };


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
                    case 1 -> trocarMarcha(entrada);
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

    public void desligarCarro() {
        if (velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado !");
        } else {
            System.out.println("Pare o carro antes de desligar!");
        }
    }

    public void acelerar(){
        velocidade += 5;
        System.out.println("Velocidade atual: " + velocidade);

        if(velocidade > 20 && marcha.equals("Primeira marcha")) {
            System.out.println("Atenção! Você está indo muito rapido! Reduza a velocidade ou passe a marcha!");
        }
        }

        public void frear(){

        if(velocidade >= 0){
        velocidade -= 5;
        System.out.println("Velocidade atual: " + velocidade);
        }
    }

    public void trocarMarcha(Scanner entrada) {
        System.out.println("Marcha atual: " + marcha);
        System.out.println("Escolha uma nova marcha: ");

        /// Percorre o array de marchas, i = posição da marcha no array. Incrementa a posição e o index do array.
        for (int i = 1; i < MARCHAS.length; i++) {
            System.out.println(i + " - " + MARCHAS[i]);
        }
        System.out.println("7 - Sair");

        int opcao = entrada.nextInt();

        if (opcao >= 1 && opcao <= 6) {
            int min = LIMITES_MARCHA[opcao][0];
            int max = LIMITES_MARCHA[opcao][1];

            if (velocidade >= min && velocidade <= max) {
                marcha = MARCHAS[opcao];
                System.out.println("Marcha atual: " + marcha);
            } else {
                System.out.println("⚠️ Velocidade incompatível (" + velocidade + " Km/h) para essa marcha!");
            }
        } else if (opcao == 7) {
            System.out.println("Voltando ao menu de operações!");
            return;
        } else {
            System.out.println("Opção inválida!");
        }
    }


    public void verificarVelocidade(){
        System.out.println("Velocidade atual: " + velocidade + "Km/h");
    }


}
