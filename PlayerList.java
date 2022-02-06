
/**
 * Stores all players into a the players list.
 *
 * @author Christian Zaccaria
 * @version 07/03/2021
 */

import java.util.ArrayList;

public class PlayerList
{
    // 1. Variables
    private ArrayList<Player> players = new ArrayList<>();

    // 2. Default Constructor
    PlayerList()
    {
    }

    // 3. Methods
    
    //Method used to add a player to the ArrayList
    public void addPlayer(Player player)
    {
        players.add(player);
    }

    //Method used to get a player from the ArrayList
    public Player getPlayer(int index)
    {
        
        
        if(index >= 0 && index < players.size()) {
            return players.get(index);
        }
        else
        {
            return null;
        }
        
    }

    //Method used to list a player from the ArrayList
    public String listOfPlayers()
    {
        String allPlayers="";
        int index = 0;
        if(players.isEmpty())
        {
            allPlayers = "There are no Players in the System";
        }
        else
        {
            for (Player p: players)
            {
                allPlayers = allPlayers + "Index " + index + ": " + p + "\n";
                index = index + 1;
            }
        }

        return allPlayers;
    }
    
    //Method used to list players by the club they play for
    public String listPlayersBySpecificClub(String club)
    {
        String searchResults="";
        if(players.isEmpty())
        {
            searchResults = "There are no Players in the System";
        }
        else
        {
            for(Player p: players)
            {
                if(p.getClub().getClubName().toUpperCase().contains(club.toUpperCase()))
                {
                    searchResults = searchResults + p + "\n";
                }
                else
                {
                    searchResults = "There are no players that play for " + club + " in the System.";
                }
            }
            
        }
        return searchResults;
    }

    //Method used to list players by the sport they play
    public String listPlayersBySpecificSport(String sport)
    {
        String searchResults="";
        if(players.isEmpty())
        {
            searchResults = "There are no Players in the System";
        }
        else
        {
            for(Player p: players)
            {
                if(p.getSport().contains(sport.toUpperCase()))
                {
                    searchResults = searchResults + p + "\n";
                }
                else
                {
                    searchResults = "There are no players that play " + sport.toUpperCase();
                }
            }
        }
        return searchResults;
    }

    //Method used to return the number of players in the ArrayList
    public int numberOfPlayers()
    {
        return players.size();
    }

    //Method used to remove a player from the ArrayList
    public boolean removePlayer(int index)
    {
        
        if(index >= 0 && index < players.size())
        {
            players.remove(index);
            return true;
        }
        else
        {
            return false;
        }
        
       
    }
}
