
/**
 * Stores all clubs into the clubs list
 *
 * @author Christian Zaccaria
 * @version 05/03/2021
 */

import java.util.ArrayList;

public class ClubList
{
    // 1. Variables 
    private ArrayList<Club> clubs = new ArrayList<>();

    // 2. Default Constructor
    ClubList()
    {
    }

    // 3. Methods
    
    //Method used to add a club to the ArrayList
    public void addClub (Club club)
    {
        clubs.add(club);
    }

    //Method used to get a club from the ArrayList
    public Club getClub(int indexIn)
    {   
        if(indexIn >= 0 && indexIn < clubs.size()) {
            return clubs.get(indexIn);
        }
        else
        {
            return null;
        }
    }

    //Method used to list all clubs from the ArrayList
    public String listOfClubs()
    {
        String allClubs="";
        int index = 0;
        if(clubs.isEmpty())
        {
            allClubs = "Sorry, there are no Clubs in the System\n------------------------\n";
            
        }
        else
        {
            for (Club c: clubs)
            {
                allClubs = allClubs + "Index " + index + ": " + c + "\n";
                index = index + 1;
            }
        }
        return allClubs;
    }

    //Method used to return the number of clubs in the ArrayList
    public int numberOfClubs()
    {
        return clubs.size();
    }

    //Method used to remove a club from the ArrayList
    public boolean removeClub(int index)
    {   
        if(index >= 0 && index < clubs.size())
        {

            clubs.remove(index);
            return true;
        }
        else {
            return false;
        }
    }

}
