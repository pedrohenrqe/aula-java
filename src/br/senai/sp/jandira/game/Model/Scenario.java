package br.senai.sp.jandira.game.Model;

public class Scenario {


    public String Scenario(int scenarioOption){

        String scenario = "Senai Jandira";

        switch (scenarioOption){

            case 1:
                scenario = "Arabia junto com o Ney";
                break;

            case 2:
                scenario = "Grecia";
                break;

            case 3:
                scenario = "Los Angeles";
                break;

            case 4:
                scenario = "Rio de Janeiro";
                break;

            case 5:
                scenario = "Toquio";
                break;

            case 6:
                scenario = "Berlim";
                break;
        }

        return scenario;

    }


}
