import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {


    //   first

    //opprette spillere
    //scanner for å skrive inn navn
    //velge farge


    //add players to a ArrayList
    public static void addPlayers(){
        ArrayList<String> players = new ArrayList<String>();

        //set number of players
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("number of players?");
        int numberOfPlayers=scanner1.nextInt();

        //register name of players
        while(players.size()<numberOfPlayers){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Player name");
            String name = scanner2.nextLine();
            players.add(name);
        }
        System.out.println(players.toString());
    }
    //let players register with their names



    //while spillere<4 && !done
    //scanner navn
    //neste spiller

    //array list





    //second
    //ENUM farge

}
