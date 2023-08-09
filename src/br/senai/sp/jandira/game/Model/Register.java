package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Register {

    // Instancia Player //
    Player player = new Player();

    // Instancia Enemy //
    Enemy enemy = new Enemy();

    // Instancia Teclado //
    Scanner teclado = new Scanner(System.in);

    public void BothRegister(){
        PlayerRegister();
        EnemyRegister();
    }

    public void PlayerRegister(){
        System.out.println("--------------------------------------");
        System.out.println("----------- Cadastro Player ----------");
        System.out.println("Qual é seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Selecione sua skin [Red - Blue - Green] :");
        player.skin = teclado.nextLine();

        System.out.println("-------------- Player Cadastrado com sucesso ------------------");
        System.out.println("---------------------------------------------------------------");
    }

    public void EnemyRegister(){
        System.out.println("--------------------------------------");
        System.out.println("----------- Cadastro Enemy ----------");
        System.out.println("Qual é seu nome: ");
        player.nome = teclado.nextLine();
        System.out.println("Selecione sua skin [Red - Blue - Green] :");
        player.skin = teclado.nextLine();
    }

    public void Decision(){

        String decision;

    System.out.println("------------ Bien vindo ------------");
    System.out.println("O que deseja cadastrar [Player - Enemy - Ambos]: ");
    decision = teclado.nextLine();

    switch (decision){

        case "Player":
            PlayerRegister();
            break;

        case "Enemy":
            EnemyRegister();
            break;

        case "Ambos":
           BothRegister();
            break;

        default:
            System.out.println("Escolha uma opção válida");
    }

    }

}
