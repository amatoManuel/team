package Es;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team {
    public ArrayList<Player> players = new ArrayList<Player>();
    private int maxPlayer = 15;

    public void addNewPlayer(String name, String surname, int numberOfShirt, String role){
     if(players.size() == maxPlayer) System.out.println("Non puoi inserire altri giocatori");
     else {
         Player player = new Player(name, surname, numberOfShirt, role);
         players.add(player);
     }
    }

    public ArrayList<Player> searchPlayerByName(String name){
        ArrayList<Player> playersFound = new ArrayList<Player>();
        for(int i=0; i<players.size(); i++)
            if(players.get(i).getName().equals(name))
                playersFound.add(players.get(i));
        return playersFound;
    }

    public ArrayList<Player> searchPlayerBySurname(String surname){
        ArrayList<Player> playersFound = new ArrayList<Player>();
        for(int i=0; i<players.size(); i++)
            if(players.get(i).getSurname().equals(surname))
                playersFound.add(players.get(i));
        return playersFound;
    }

    public ArrayList<Player> searchPlayerByRole(String role){
        ArrayList<Player> playersFound = new ArrayList<Player>();
        for(int i=0; i<players.size(); i++)
            if(players.get(i).role.equals(role))
                playersFound.add(players.get(i));
        return playersFound;
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "Giocatori=" + players +
                '}';
    }
}
