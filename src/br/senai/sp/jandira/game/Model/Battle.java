package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Battle {
    String scenarioBattle;
    Scanner teclado = new Scanner(System.in);

    Scenario scenario = new Scenario();
    public void ChoiceScenario(){


        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("Escolha um Cenario: ");
        System.out.println("1 - Arabia 2- Grecia 3 - Los Angeles 4 - Rio de Janeiro 5 - Toquio 6 - Berlim");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");

        int userScenario = teclado.nextInt();

        scenarioBattle = scenario.Scenario(userScenario);

        System.out.println(scenario);
    }


    public void Battle(Player player, Enemy enemy) {

        while (true) {

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifePlayer == 0) {
                System.out.println(" O vencedor é o Enemy " + enemy.nome);
                break;
            } else if (lifeEnemy == 0) {
                System.out.println(" O vencedor é o Player " + player.nome);
                break;
            }

            System.out.println("-------------- Battle --------------");
            System.out.println(" Ataque Player [ R ] -" + player.nome + "life: " + lifePlayer);
            System.out.println(" Ataque Enemy [ Q ] -" + enemy.nome + "life: " + lifeEnemy);
            System.out.println("------------------------------------");

            String attack = teclado.next();

            if (attack.equalsIgnoreCase("R")) {
                System.out.println("--------------");
                System.out.println(" Player Atacou ");
                System.out.println("--------------");

                String defesa = teclado.next();

                int danoPlayer = (int) (Math.random() * 20) + 1;
                int defesaEnemy = (int) (Math.random() * 20) + 1;

                int chanceDefesa = (int) (Math.random() * 5) + 1;
                int danoReal;

                System.out.println("Digite um numero para Defesa [1-5]");

                int numberDefesa = teclado.nextInt();

                if (numberDefesa == chanceDefesa){
                    danoReal = danoPlayer - defesaEnemy;

                    System.out.println("-----------------------------------");
                    System.out.println("A defesa foi de: " + defesaEnemy);
                    System.out.println("-----------------------------------");
                } else {
                    danoReal = danoPlayer;
                }

                if (danoReal < 0) {
                    danoReal = 0;
                }

                enemy.SubtrairVida(danoReal);

                System.out.println("-----------------------------------");
                System.out.println(" O ataque foi de: " + danoPlayer);
                System.out.println("-----------------------------------");

            } else if (attack.equalsIgnoreCase("Q")) {

                System.out.println("--------------");
                System.out.println(" Player Atacou ");
                System.out.println("--------------");

                int danoEnemy = (int) (Math.random() * 20) + 1;
                int defesaPlayer = (int) (Math.random() * 20) + 1;

                int chanceDefesa = (int) (Math.random() * 5) + 1;
                int danoReal;

                System.out.println("Digite um numero para Defesa [1-5]");

                int numberDefesa = teclado.nextInt();

                if (numberDefesa ==  chanceDefesa){
                    danoReal = danoEnemy - defesaPlayer;
                    System.out.println("-----------------------------------");
                    System.out.println("A defesa foi de: " + defesaPlayer);
                    System.out.println("-----------------------------------");

                } else {
                    danoReal = danoEnemy;
                }

                if (danoReal < 0){
                    danoReal = 0;
                }

                player.SubtrairVida(danoEnemy);

                System.out.println(" O Ataque foi de: " + danoEnemy);

            } else {
                System.out.println(" Tecla Inválida!!!");
            }

        }
    }
}

