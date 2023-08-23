package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Menu {
    Register register = new Register();

    Battle battle = new Battle();

    Scanner teclado = new Scanner(System.in);

    public void Menu(){

        boolean continuar = true;

        while (continuar){

            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("------- Bem vindo -------" );
            System.out.println("Escolha uma opção: ");
            System.out.println("[1 - register 2 - Battle 3 - Exit]");

            int userOption = teclado.nextInt();

            switch (userOption){
                case 1:
                    register.Decision();
                    break;

                case 2:
                    battle.ChoiceScenario();
                    battle.Battle();
                    System.out.println("Feature in Development");
                    break;

                case 3:
                    break;
            }
        }
    }
}

