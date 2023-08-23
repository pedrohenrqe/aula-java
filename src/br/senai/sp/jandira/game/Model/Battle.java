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
        System.out.println(player.nome);
        System.out.println(enemy.nome);

    }
}
