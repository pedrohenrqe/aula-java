package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Register {

    int avaliaAmbos = 0;

    // Instancia Player //
    Player player = new Player();

    // Instancia Enemy //
    Enemy enemy = new Enemy();

    /**
     * Instancia Output
     */
    Output output = new Output();

    // Instancia Teclado //
    Scanner teclado = new Scanner(System.in);

    public void BothRegister() {
        avaliaAmbos = 1;

        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);
    }

    public Player PlayerRegister() {
        System.out.println("--------------------------------------");
        System.out.println("----------- Cadastro Player ----------");
        System.out.println("Qual é seu nome: ");
        player.nome = teclado.next();
        System.out.println("Selecione sua skin [Red - Blue - Green] :");
        player.skin = teclado.next();
        System.out.println("-------------- Player Cadastrado com sucesso ------------------");
        System.out.println("---------------------------------------------------------------");

        if (avaliaAmbos != 1) {
            output.PrintPlayer(player);
        }

        return player;
    }


    public Enemy EnemyRegister() {
        System.out.println("--------------------------------------");
        System.out.println("-----------     Cadastro Enemy ----------");
        System.out.println("Qual é seu nome: ");
        player.nome = teclado.next();
        System.out.println("Selecione sua skin [Red - Blue - Green] :");
        player.skin = teclado.next();

        if (avaliaAmbos != 1) {
            output.PrintEnemy(enemy);
        }

        return enemy;
    }

    public void Decision() {

        String decision;

        System.out.println("------------ Bem vindo ------------");
        System.out.println("O que deseja cadastrar [Player - Enemy - Ambos]: ");
        decision = teclado.next();

        switch (decision.toLowerCase()) {

            case "player":
                PlayerRegister();
                break;

            case "enemy":
                EnemyRegister();
                break;

            case "ambos":
                BothRegister();
                break;
        }

        System.out.println("----------------------------");
        System.out.println("Deseja Continuar [1-Sim  2- Não]: ");
        int continuar = teclado.nextInt();

        if (continuar == 1) {
            Decision();
        }

    }

}
