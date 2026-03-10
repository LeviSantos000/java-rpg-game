import java.util.Scanner;

public class Jogo {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println(" _____   ____   _____ \r\n" + //
                        "|     | |    | |     |\r\n" + //
                        "|_____| |____| |  ___ \r\n" + //
                        "| \\\\    |      |     |\r\n" + //
                        "|  \\\\   |      |_____|");
        System.out.println("-----------------------");


        System.out.println("Você não sabe como se perdeu na floresta, mas você precisa voltar para a sua familia. Você ver dois caminhos a sua frente, qual dos dois você vai seguir? (Esquerda ou direita)");
        String caminho = in.next();

        // CAMINHO DA ESQUERDA
        if (caminho.equalsIgnoreCase("Esquerda")) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Você seguiu pelo o caminho da esquerda. Cada vez que você andava pela a floresta, ela ficava mais escura. Você continua até que se depara com uma alcateia de lobos devorando um animal no chão. Qual item você usa? (Digite o número)");
            System.out.println("--------------------------------------------------------");
            System.out.println("INVENTÁRIO\r\n" + //
                                " ________________________\r\n" + //
                                "|1.Espada                |\r\n" + //
                                "|2.Escudo                |\r\n" + //
                                "|3.Arco e Flecha         |\r\n" + //
                                "|4.Feitiço de Camuflagem |\r\n" + //
                                "|5.Feitiço de Fogo       |\r\n" + //
                                "|6.Feitiço de Velocidade |\r\n" + //
                                "|________________________|");
            System.out.println("--------------------------------------------------------");
            int escolhaE1 = in.nextInt();

            switch (escolhaE1) {
                case 1:
                    System.out.println("Você escolheu a espada! Você ataca os lobos, mas eles são muitos.");
                    System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                                "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                                "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                                "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                                "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                break;

                case 2:
                    System.out.println("Você escolheu o escudo! O seu ataque contra os lobos não é eficiente com o escudo e não tem como se defender de vários.");
                    System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                    "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                    "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                    "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                    "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                break;

                case 3:
                    System.out.println("Você escolheu o arco e flecha! Os lobos desviam de todas as suas flechas, você é muito ruim de mira ou eles são muito bons.");
                    System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                    "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                    "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                    "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                    "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                break;

                case 4:
                    System.out.println("Você escolheu o feitiço de camuflagem! Você se camufla com os arbustos e passa pelo os lobos.");
                    System.out.println("Você consegue passar pelos os lobos e continua seu caminho. Você está andando quando pisa em um chão falso e quase cai. Nesse momento você percebe que naquele local existe armadilhas escondidas. Escolha 2 itens para passar: (Escreva o nome de 2 itens)");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("INVENTÁRIO\r\n" + //
                                " ________________________\r\n" + //
                                "|1.Espada                |\r\n" + //
                                "|2.Escudo                |\r\n" + //
                                "|3.Arco e Flecha         |\r\n" + //
                                "|4.Feitiço de Camuflagem |\r\n" + //
                                "|5.Feitiço de Fogo       |\r\n" + //
                                "|6.Feitiço de Velocidade |\r\n" + //
                                "|________________________|");
                    String escolhaE21 = in.nextLine();
                    String escolhaE22 = in.nextLine();
                    escolhaE22 = in.nextLine();

                    if ((escolhaE21.equalsIgnoreCase("escudo") && escolhaE22.equalsIgnoreCase("feitiço de velocidade")) || (escolhaE21.equalsIgnoreCase("feitiço de velocidade") && escolhaE22.equalsIgnoreCase("escudo"))) {
                        System.out.println("Você correu pelas armadilhas, ativando todas elas, mas usou os escudos para se defender delas, você passou de um jeito bem inusitado, mas funcionou.");

                        System.out.println("Você está muito cansado e depois de muito andar, você chega em uma muralha de flores espihosas, atrás dela você ver a luz do sol, indicando a saída daquela floresta escura. O que você faz? (Digite o número)");

                        boolean loop2 = true;

                        while (loop2) {
                            loop2 = false;

                            System.out.println("--------------------------------------------------------");
                            System.out.println("INVENTÁRIO\r\n" + //
                            " ________________________\r\n" + //
                            "|1.Espada                |\r\n" + //
                            "|2.Escudo                |\r\n" + //
                            "|3.Arco e Flecha         |\r\n" + //
                            "|4.Feitiço de Camuflagem |\r\n" + //
                            "|5.Feitiço de Fogo       |\r\n" + //
                            "|6.Feitiço de Velocidade |\r\n" + //
                            "|________________________|");
                            int escolhaF2 = in.nextInt();
                            System.out.println("--------------------------------------------------------");
                                                
                            // 6 ESCOLHAS
                            switch (escolhaF2) {
                                // FINAL BOM ESCOLHA 3 - FIM DE JOGO (DIREITA)
                                case 1:
                                loop2 = false;
                                System.out.println("Você escolheu a espada! Ela cortou facilmente as flores espinhosas e abriu caminho para a saída.");
                                System.out.println("Você chegou em casa e voltou para a sua família! Parabéns você venceu o jogo!");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 2:
                                    loop2 = true;
                                    System.out.println("Você escolheu o escudo! Ele infelizmente fez efeito nenhum nas flores, tente outro item.");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 3:
                                    loop2 = true;
                                    System.out.println("Você escolheu o arco e flecha, sério? Você é idiota por acaso? Obvio que isso não ia funcionar, tente outro item.");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 4:
                                    loop2 = true;
                                    System.out.println("Você escolheu o feitiço de camuflagem! Você não vai passar usando isso, tente outro item.");

                                break;

                                // FINAL BOM ESCOLHA 3 - FIM DE JOGO (DIREITA)
                                case 5:
                                    loop2 = false;
                                    System.out.println("Você escolheu o feitiço de fogo! As flores foram rapidamente queimadas e abriu o caminho para você passar!");
                                    System.out.println("Você chegou em casa e voltou para a sua família! Parabéns você venceu o jogo!");

                                break;

                                // FINAL RUIM ESCOLHA 3 (DIREITA)
                                case 6:
                                    loop2 = false;
                                    System.out.println("Você escolheu o feitiço de velocidade! Você correu rápido pelas as flores, você conseguiu passar mas totalmente arranhado, para a sua sorte as flores eram venenosas também. Gêniokkkkk.");
                                    System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                                break;

                                default:
                                    System.out.println("Erro");
                                break;
                            }
                        }
                    }

                    else {
                        System.out.println("Seu item não foi útil para as armadilhas.");
                        System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                        "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                        "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                        "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                        "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");
                    }
                break;

                case 5:
                    System.out.println("Você escolheu o feitiço de fogo! Você joga fogo nos lobos, eles ficam com medo e fogem.");
                    System.out.println("Você consegue passar pelos os lobos e continua seu caminho. Você está andando quando pisa em um chão falso e quase cai. Nesse momento você percebe que naquele local existe armadilhas escondidas. Escolha 2 itens para passar: (Escreva o nome de 2 itens)");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("INVENTÁRIO\r\n" + //
                                " ________________________\r\n" + //
                                "|1.Espada                |\r\n" + //
                                "|2.Escudo                |\r\n" + //
                                "|3.Arco e Flecha         |\r\n" + //
                                "|4.Feitiço de Camuflagem |\r\n" + //
                                "|5.Feitiço de Fogo       |\r\n" + //
                                "|6.Feitiço de Velocidade |\r\n" + //
                                "|________________________|");
                    String escolhaE23 = in.nextLine();
                    String escolhaE24 = in.nextLine();

                    if ((escolhaE23.equalsIgnoreCase("escudo") && escolhaE24.equalsIgnoreCase("feitiço de velocidade")) || (escolhaE23.equalsIgnoreCase("feitiço de velocidade") && escolhaE24.equalsIgnoreCase("escudo"))) {
                        System.out.println("Você correu pelas armadilhas, ativando todas elas, mas usou os escudos para se defender delas, você passou de um jeito bem inusitado, mas funcionou.");

                        System.out.println("Você está muito cansado e depois de muito andar, você chega em uma muralha de flores espihosas, atrás dela você ver a luz do sol, indicando a saída daquela floresta escura. O que você faz? (Digite o número)");

                        boolean loop2 = true;

                        while (loop2) {
                            loop2 = false;

                            System.out.println("--------------------------------------------------------");
                            System.out.println("INVENTÁRIO\r\n" + //
                            " ________________________\r\n" + //
                            "|1.Espada                |\r\n" + //
                            "|2.Escudo                |\r\n" + //
                            "|3.Arco e Flecha         |\r\n" + //
                            "|4.Feitiço de Camuflagem |\r\n" + //
                            "|5.Feitiço de Fogo       |\r\n" + //
                            "|6.Feitiço de Velocidade |\r\n" + //
                            "|________________________|");
                            int escolhaF2 = in.nextInt();
                            System.out.println("--------------------------------------------------------");
                                                
                            // 6 ESCOLHAS
                            switch (escolhaF2) {
                                // FINAL BOM ESCOLHA 3 - FIM DE JOGO (DIREITA)
                                case 1:
                                loop2 = false;
                                System.out.println("Você escolheu a espada! Ela cortou facilmente as flores espinhosas e abriu caminho para a saída.");
                                System.out.println("Você chegou em casa e voltou para a sua família! Parabéns você venceu o jogo!");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 2:
                                    loop2 = true;
                                    System.out.println("Você escolheu o escudo! Ele infelizmente fez efeito nenhum nas flores, tente outro item.");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 3:
                                    loop2 = true;
                                    System.out.println("Você escolheu o arco e flecha, sério? Você é idiota por acaso? Obvio que isso não ia funcionar, tente outro item.");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 4:
                                    loop2 = true;
                                    System.out.println("Você escolheu o feitiço de camuflagem! Você não vai passar usando isso, tente outro item.");

                                break;

                                // FINAL BOM ESCOLHA 3 - FIM DE JOGO (DIREITA)
                                case 5:
                                    loop2 = false;
                                    System.out.println("Você escolheu o feitiço de fogo! As flores foram rapidamente queimadas e abriu o caminho para você passar!");
                                    System.out.println("Você chegou em casa e voltou para a sua família! Parabéns você venceu o jogo!");

                                break;

                                // FINAL RUIM ESCOLHA 3 (DIREITA)
                                case 6:
                                    loop2 = false;
                                    System.out.println("Você escolheu o feitiço de velocidade! Você correu rápido pelas as flores, você conseguiu passar mas totalmente arranhado, para a sua sorte as flores eram venenosas também. Gêniokkkkk.");
                                    System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                                break;

                                default:
                                    System.out.println("Erro");
                                break;
                            }
                        }
                    }

                    else {
                        System.out.println("Seu item não foi útil para as armadilhas.");
                        System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                        "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                        "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                        "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                        "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");
                    }
                break;

                case 6:
                    System.out.println("Você escolheu o feitiço de velocidade! Você chama a atenção dos lobos passando por eles rápido, eles te perseguem até acabar o efeito do seu feitiço.");
                    System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                    "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                    "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                    "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                    "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                break;

                default:
                    System.out.println("Erro");
                break;
            }
        }

        // --------------------------------------------------------------------------------------


        // CAMINHO DA DIREITA
        else if (caminho.equalsIgnoreCase("Direita")) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Você seguiu pelo o caminho da direita. Era um caminho muito tranquilo, mas você acaba encontrando um monstro de pedra. Escolha dois itens para matá-lo: (Digite o nome do item)");
            System.out.println("--------------------------------------------------------");

            System.out.println("INVENTÁRIO\r\n" + //
                                " ________________________\r\n" + //
                                "|1.Espada                |\r\n" + //
                                "|2.Escudo                |\r\n" + //
                                "|3.Arco e Flecha         |\r\n" + //
                                "|4.Feitiço de Camuflagem |\r\n" + //
                                "|5.Feitiço de Fogo       |\r\n" + //
                                "|6.Feitiço de Velocidade |\r\n" + //
                                "|________________________|");
            String escolhaD1 = in.nextLine();
            escolhaD1 = in.nextLine();
            String escolhaD11 = in.nextLine();

            // FINAL BOM DA ESCOLHA 1 (DIREITA)
            if ((escolhaD1.equalsIgnoreCase("Espada") && escolhaD11.equalsIgnoreCase("Escudo")) || escolhaD1.equalsIgnoreCase("Escudo") && escolhaD11.equalsIgnoreCase("Espada")) {
                System.out.println("Você teve uma luta épica contra o monstro, foi muito difícil, mas você consegue derrota-lo e seguir o seu caminho.");
                
                System.out.println("--------------------------------------------------------");
                System.out.println("Você continua caminhando quando ouve uma voz pedindo socorro na direção de uns arbustos. Escolha uma opção: (Digite o número)");
                System.out.println("--------------------------------------------------------");
                System.out.println("1.Segue a voz\n2.Ignora e segue em frente\n3.Usa um item do inventário");
                int escolhaD2 = in.nextInt();
                System.out.println("--------------------------------------------------------");


                // ESCOLHA 2 - 3 ESCOLHAS
                switch (escolhaD2) {
                    // FINAL RUIM DA ESCOLHA 2 (DIREITA)
                    case 1:
                        System.out.println("Você segue a voz para tentar ajudar a pessoa que está gritando. Chegando lá você ver que na verdade era um monstro imitando uma voz humana, ele estava esperando você chegar mais perto. Mais sorte na próxima!");
                        System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                        "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                        "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                        "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                        "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                    break;

                    // FINAL BOM ESCOLHA 2 (DIREITA)
                    case 2:
                        System.out.println("Você ignora a voz com um peso na consciência pensando que poderia ter ajudado alguém, mas a chance de ser uma armadilha não deixa você ir ajudar.");

                        System.out.println("Você está muito cansado e depois de muito andar, você chega em uma muralha de flores espinhosas, atrás dela você ver a luz do sol, indicando a saída daquela floresta escura. O que você faz? (Digite o número)");

                        boolean loop1 = true;

                        while (loop1) {
                            loop1 = false;
                            System.out.println("--------------------------------------------------------");
                            System.out.println("INVENTÁRIO\r\n" + //
                                    " ________________________\r\n" + //
                                    "|1.Espada                |\r\n" + //
                                    "|2.Escudo                |\r\n" + //
                                    "|3.Arco e Flecha         |\r\n" + //
                                    "|4.Feitiço de Camuflagem |\r\n" + //
                                    "|5.Feitiço de Fogo       |\r\n" + //
                                    "|6.Feitiço de Velocidade |\r\n" + //
                                    "|________________________|");
                            int escolhaF1 = in.nextInt();
                            System.out.println("--------------------------------------------------------");
                            
                            // 6 ESCOLHAS
                            switch (escolhaF1) {
                                // FINAL BOM ESCOLHA 3 - FIM DE JOGO (DIREITA)
                                case 1:
                                    loop1 = false;
                                    System.out.println("Você escolheu a espada! Ela cortou facilmente as flores espinhosas e abriu caminho para a saída.");
                                    System.out.println("Você chegou em casa e voltou para a sua família! Parabéns você venceu o jogo!");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 2:
                                    loop1 = true;
                                    System.out.println("Você escolheu o escudo! Ele infelizmente fez efeito nenhum nas flores, tente outro item.");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 3:
                                    loop1 = true;
                                    System.out.println("Você escolheu o arco e flecha, sério? Você é idiota por acaso? Obvio que isso não ia funcionar, tente outro item.");

                                break;

                                // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                case 4:
                                    loop1 = true;
                                    System.out.println("Você escolheu o feitiço de camuflagem! Você não vai passar usando isso, tente outro item.");

                                break;

                                // FINAL BOM ESCOLHA 3 - FIM DE JOGO (DIREITA)
                                case 5:
                                    loop1 = false;
                                    System.out.println("Você escolheu o feitiço de fogo! As flores foram rapidamente queimadas e abriu o caminho para você passar!");
                                    System.out.println("Você chegou em casa e voltou para a sua família! Parabéns você venceu o jogo!");

                                break;

                                // FINAL RUIM ESCOLHA 3 (DIREITA)
                                case 6:
                                    loop1 = false;
                                    System.out.println("Você escolheu o feitiço de velocidade! Você correu rápido pelas as flores, você conseguiu passar mas totalmente arranhado, para a sua sorte as flores eram venenosas. Gêniokkkkk.");
                                    System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                    "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                    "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                    "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                    "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                                break;
                            }
                        }

                    break;

                    // ESCOLHA 2 QUE GERA MAIS ESCOLHAS
                    case 3:
                        System.out.println("INVENTÁRIO\r\n" + //
                                " ________________________\r\n" + //
                                "|1.Espada                |\r\n" + //
                                "|2.Escudo                |\r\n" + //
                                "|3.Arco e Flecha         |\r\n" + //
                                "|4.Feitiço de Camuflagem |\r\n" + //
                                "|5.Feitiço de Fogo       |\r\n" + //
                                "|6.Feitiço de Velocidade |\r\n" + //
                                "|________________________|");
                        System.out.println("Digite o número do item que você vai usar:");
                        int escolhaD22 = in.nextInt();
                        in.nextLine();
                        System.out.println("--------------------------------------------------------");

                        switch (escolhaD22) {
                            // FINAL RUIM ESCOLHA 2 (DIREITA)
                            case 1:
                                System.out.println("Você escolheu a espada! Você chega próximo do arbusto e percebe que suas suspeitas estavam certas, pena que você chegou perto de mais, acontece.");
                                System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                            break;

                            // FINAL RUIM ESCOLHA 2 (DIREITA)
                            case 2:
                                System.out.println("Você escolheu o escudo! Antes de você ver quem está atrás do arbusto você recebe um ataque, suas suspeitas estavam certas, era um monstro! Ainda bem que você escolheu um escudo, mas... como você vai atacar?");
                                System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                            break;

                            // FINAL BOM ESCOLHA 2 (DIREITA)
                            case 3:
                                System.out.println("Você atira uma flecha no arbusto suspeitando que não possa ser uma pessoa. Você estava certo! A flecha acertou perfeitamente a cabeça do monstro e matou ele.");
                                System.out.println("Você está muito cansado e depois de muito andar, você chega em uma muralha de flores espihosas, atrás dela você ver a luz do sol, indicando a saída daquela floresta escura. O que você faz? (Digite o número)");

                                boolean loop2 = true;

                                while (loop2) {
                                    loop2 = false;
                                    System.out.println("--------------------------------------------------------");
                                    System.out.println("INVENTÁRIO\r\n" + //
                                            " ________________________\r\n" + //
                                            "|1.Espada                |\r\n" + //
                                            "|2.Escudo                |\r\n" + //
                                            "|3.Arco e Flecha         |\r\n" + //
                                            "|4.Feitiço de Camuflagem |\r\n" + //
                                            "|5.Feitiço de Fogo       |\r\n" + //
                                            "|6.Feitiço de Velocidade |\r\n" + //
                                            "|________________________|");
                                    int escolhaF2 = in.nextInt();
                                    System.out.println("--------------------------------------------------------");
                                    
                                    // 6 ESCOLHAS
                                    switch (escolhaF2) {
                                        // FINAL BOM ESCOLHA 3 - FIM DE JOGO (DIREITA)
                                        case 1:
                                            loop2 = false;
                                            System.out.println("Você escolheu a espada! Ela cortou facilmente as flores espinhosas e abriu caminho para a saída.");
                                            System.out.println("Você chegou em casa e voltou para a sua família! Parabéns você venceu o jogo!");

                                        break;

                                        // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                        case 2:
                                            loop2 = true;
                                            System.out.println("Você escolheu o escudo! Ele infelizmente fez efeito nenhum nas flores, tente outro item.");

                                        break;

                                        // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                        case 3:
                                            loop2 = true;
                                            System.out.println("Você escolheu o arco e flecha, sério? Você é idiota por acaso? Obvio que isso não ia funcionar, tente outro item.");

                                        break;

                                        // TENTE NOVAMENTE ESCOLHA 3 (DIREITA)
                                        case 4:
                                            loop2 = true;
                                            System.out.println("Você escolheu o feitiço de camuflagem! Você não vai passar usando isso, tente outro item.");

                                        break;

                                        // FINAL BOM ESCOLHA 3 - FIM DE JOGO (DIREITA)
                                        case 5:
                                            loop2 = false;
                                            System.out.println("Você escolheu o feitiço de fogo! As flores foram rapidamente queimadas e abriu o caminho para você passar!");
                                            System.out.println("Você chegou em casa e voltou para a sua família! Parabéns você venceu o jogo!");

                                        break;

                                        // FINAL RUIM ESCOLHA 3 (DIREITA)
                                        case 6:
                                            loop2 = false;
                                            System.out.println("Você escolheu o feitiço de velocidade! Você correu rápido pelas as flores, você conseguiu passar mas totalmente arranhado, para a sua sorte as flores eram venenosas também. Gêniokkkkk.");
                                            System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                            "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                            "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                            "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                            "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                                        break;

                                        default:
                                            System.out.println("Erro");
                                        break;
                                    }
                                }

                            default:
                                System.out.println("Erro");   
                            break;

                            // FINAL RUIM ESCOLHA 2 (DIREITA)
                            case 4:
                                System.out.println("Você escolheu o feitiço de camuflagem! Cara, te falar que o monstro tinha uma visão avançada, que pena pra você, mais sorte na próxima.");
                                System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                            break;

                            // FINAL RUIM ESCOLHA 2 (DIREITA)
                            case 5:
                                System.out.println("Você escolheu o feitiço de fogo! Você usou o feitiço contra o arbusto e saiu um monstro de lá! Suas suspeitas estavam certas, mas parece que o fogo não está fazendo efeito e ele está vindo em sua direção e agora?");
                                System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                            break;

                            // FINAL RUIM ESCOLHA 2 (DIREITA)
                            case 6:
                                System.out.println("Você escolheu o feitiço de velocidade! Você passou rápido pelo arbusto e notou o monstro, você com medo corre para longe, mas acaba se perdendo do seu caminho. Infelizmente você não conseguiu sair da floresta depois de perder o caminho.");
                                System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");

                            break;
                        }

                    break;

                    default:
                        System.out.println("Erro");
                    break;
                }
            }

            // FINAL RUIM DA ESCOLHA 1 (DIREITA)
            else {
                System.out.println("Você luta bravamente, mas infelizmente não foi o suficiente.");
                System.out.println(" _____   ____   __     __   ____  _____      ____            ____  _____\r\n" + //
                                        "|     | |    | |  \\   /  | |     |     |    |    | \\      / |     |     |\r\n" + //
                                        "|  ___  |____| |   \\_/   | |____ |_____|    |    |  \\    /  |____ |_____|\r\n" + //
                                        "|     | |    | |         | |     | \\\\       |    |   \\  /   |     | \\\\\r\n" + //
                                        "|_____| |    | |         | |____ |  \\\\      |____|    \\/    |____ |  \\\\");
            }
        }

        else {
            System.out.println("As opções são esquerda ou direita, você colocou outra opção porquê?");
        }
    }
}