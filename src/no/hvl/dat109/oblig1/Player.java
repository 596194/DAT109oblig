package no.hvl.dat109.oblig1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    //set number of players & add players to a ArrayList
    public static void addPlayers(){
        ArrayList<String> players = new ArrayList<String>();

        //set number of players
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("number of players?");
        int numberOfPlayers=scanner1.nextInt();

        //register name of players
        while(players.size()<numberOfPlayers){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("no.hvl.dat109.oblig1.Player name");
            String name = scanner2.nextLine();
            players.add(name);
        }
        System.out.println(players.toString());
    }
}
