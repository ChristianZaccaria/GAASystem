/**
 * User-Interface for the user
 *
 * @author Christian Zaccaria
 * @version 13/03/2021
 */
import java.util.ArrayList;

public class GAASystem
{
    //creating object clublist1 from the ClubList class
    private ClubList clublist1 = new ClubList();
    //creating object playerlist1 from the PlayerList class
    private PlayerList playerlist1 = new PlayerList();

    //default Constructor
    public GAASystem()
    {
    }

    public static void main(String[] args)
    {
        GAASystem ms1 = new GAASystem();

        ms1.runMenu();
    }

    //This method displays the different options to the User.
    public static int mainMenu()
    {
        System.out.println("\n GAA Club Menu");
        System.out.println("______________________");

        System.out.println("   1. Add a GAA Club to the System");
        System.out.println("   2. List All Clubs in the System");
        System.out.println("   3. Remove a Club from the System");
        System.out.println("______________________");
        System.out.println("   4. Add a player to the System");
        System.out.println("   5. List All players in the System");
        System.out.println("   6. Search for Players by the Sport they play");
        System.out.println("   7. Search for players by the Club they play for");
        System.out.println("   8. Remove a player from the System");
        System.out.println("______________________");
        System.out.println("   0. Exit the Menu");
        System.out.println();
        System.out.println("Enter choice [0-8]: ");

        // get choice
        int choice = EasyScanner.nextInt();
        System.out.println("\n ______________________");
        return choice;
    }

    public void runMenu()
    {
        int option = mainMenu();
        while(option !=0)
        {
            switch (option)
            {
                case 1:
                addClub();
                break;

                case 2:
                System.out.println(clublist1.listOfClubs());
                break;

                case 3:
                deleteClub();
                break;

                case 4:
                addPlayer();
                break;

                case 5:
                System.out.println(playerlist1.listOfPlayers());
                break;

                case 6:
                listPlayersBySport();
                break;

                case 7:
                listPlayersByClub();
                break;

                case 8:
                deletePlayer();
                break;

                default:
                System.out.println("Please select a valid option...");

            }
            System.out.println();
            option = mainMenu();
        }
    }

    //This method adds a club to the System.
    public Club addClub()
    {
        String cName;
        String cAddress;
        String cChairperson;
        String cSecretary;
        String cEmail;

        System.out.println("Please enter the following details to add a new Club to the System");

        System.out.print("Enter the Name of the club: ");
        cName = EasyScanner.nextString();

        System.out.print("Enter the Address of the club: ");
        cAddress = EasyScanner.nextString();

        System.out.print("Enter the Chairperson of the club: ");
        cChairperson = EasyScanner.nextString();

        System.out.print("Enter the Secretary of the club: ");
        cSecretary = EasyScanner.nextString();

        System.out.print("Enter the email of the club: ");
        cEmail = EasyScanner.nextString();
        if (!cEmail.contains ("@") || !cEmail.contains ("."))
        {
            do
            {
                System.out.print("Please enter a valid Email with the '@' and '.' signs included: ");
                cEmail = EasyScanner.nextString();
            }
            while(!cEmail.contains ("@") || !cEmail.contains ("."));
        }

        Club club = new Club(cName, cAddress, cChairperson, cSecretary, cEmail);
        clublist1.addClub(club);
        System.out.println("\nClub has been added successfully.");
        return club;
    }

    //This method deletes a club by index
    public void deleteClub()
    {
        if(clublist1.numberOfClubs() == 0)
        {
            System.out.println("Sorry, there are no Clubs in the System.");
        }
        else if (clublist1.numberOfClubs() > 0)
        {
            System.out.println("\nPlease enter the index number of the Club you wish to delete from the System: " + "\n" + clublist1.listOfClubs());
            System.out.println();

            int index = EasyScanner.nextInt();
            if (index >= clublist1.numberOfClubs() || index < 0)
            {
                do
                {
                    System.out.println(clublist1.listOfClubs()  + "Please try again and enter a valid index number.");
                    index = EasyScanner.nextInt();
                }
                while(index >= clublist1.numberOfClubs() || index < 0);
                clublist1.removeClub(index);
                System.out.println("Index: " + index + " Club Removed from the System");
            }
            else
            {
                clublist1.removeClub(index);
                System.out.println("Index: " + index + " Club Removed from the System");
            }
        }
    }

    //this method adds a player to the system.
    public void addPlayer()
    {
        String pFirstname;
        String pSurname;
        String pAddress;
        String pMobile;
        int pDayOfBirth;
        int pMonthOfBirth;
        int pYearOfBirth;
        String pSport;
        Club pClub;

        System.out.println("Please enter the following details to add a Player to the System");

        System.out.print("Enter the First Name of the Player: ");
        pFirstname = EasyScanner.nextString();

        System.out.print("Enter the Surname of the Player: ");
        pSurname = EasyScanner.nextString();

        System.out.print("Enter the Address of the Player: ");
        pAddress = EasyScanner.nextString();

        System.out.print("Enter the phone number of the Player: ");
        pMobile = EasyScanner.nextString();

        System.out.print("Enter the Day of birth of the Player [1-31]: ");
        pDayOfBirth = EasyScanner.nextInt();
        if (pDayOfBirth <= 0 || pDayOfBirth > 31)
        {
            do 
            {
                System.out.print("Please enter a valid Day of birth of the Player [1-31]: ");
                pDayOfBirth = EasyScanner.nextInt();
            }
            while(pDayOfBirth <= 0 || pDayOfBirth > 31);
        }

        
        System.out.print("Enter the Month of birth of the Player [1-12]: ");
        pMonthOfBirth = EasyScanner.nextInt();
        if (pMonthOfBirth <= 0 || pMonthOfBirth > 12)
        {
            do 
            {
                System.out.print("Please enter a valid Month of birth of the Player [1-12]: ");
                pMonthOfBirth = EasyScanner.nextInt();
            }
            while(pMonthOfBirth <= 0 || pMonthOfBirth > 12);
        }

        
        
        
        System.out.print("Please enter the current year: ");
        int currentYear = EasyScanner.nextInt();
        if (currentYear <= 2020 || currentYear > 2900)
        {
            do
            {
                System.out.print("Please enter the Current Year [Example: 2021]");
                currentYear = EasyScanner.nextInt();
            }
            while(currentYear <= 2020 || currentYear > 2900);
        }
        System.out.print("Enter the Year of birth of the Player: ");
        pYearOfBirth = EasyScanner.nextInt();
        if ((currentYear - pYearOfBirth) < 4)
        {
            do 
            {
                System.out.print("The player must be atleast 4 years of age.\nPlease enter a valid Year Of Birth [Example: 2007]: ");
                pYearOfBirth = EasyScanner.nextInt();
            }
            while((currentYear - pYearOfBirth) < 4);
        }

        System.out.print("Enter the Sport played by the Player: ");
        pSport = EasyScanner.nextString();

        
        
        
    
        System.out.println();
        System.out.println("List of Clubs in the System - Please enter the Index number of the Club that the Player plays for: " + "\n" + clublist1.listOfClubs());

        if (clublist1.numberOfClubs() == 0)
        {
            addClub();

            System.out.println("List of Clubs in the System - Please enter the Index of the Club for the Player: " + "\n" + clublist1.listOfClubs());
            int index = EasyScanner.nextInt();
            if (index >= clublist1.numberOfClubs() || index < 0)
            {
                do
                {
                    System.out.println(clublist1.listOfClubs() + "Please enter a valid club Index number for the Player: ");
                    index = EasyScanner.nextInt();
                }
                while(index >= clublist1.numberOfClubs() || index < 0);
            }

            pClub = clublist1.getClub(index);
        }

        else
        {

            int index = EasyScanner.nextInt();
            if (index >= clublist1.numberOfClubs() || index < 0)
            {
                do
                {
                    System.out.println(clublist1.listOfClubs() + "Please enter a valid club Index number for the Player: ");
                    index = EasyScanner.nextInt();
                }
                while(index >= clublist1.numberOfClubs() || index < 0);
            }

            pClub = clublist1.getClub(index);
        }

        Player player = new Player(pFirstname, pSurname, pAddress, pMobile, pDayOfBirth, pMonthOfBirth, pYearOfBirth, pSport, pClub);

        playerlist1.addPlayer(player);

        System.out.println("Player has been added succesfully.");
    }

    //This method lists the players that play a specific sport
    public void listPlayersBySport()
    {
        if (playerlist1.numberOfPlayers() == 0)
        {
            System.out.println("Sorry, there are no Players in the System");
        }
        else
        {
            System.out.print("Enter the name of the Sport: ");
            String name = EasyScanner.nextString();
            System.out.println(playerlist1.listPlayersBySpecificSport(name));
        }
    }

    //This method lists the players that play for a specific club
    public void listPlayersByClub()
    {
        if (playerlist1.numberOfPlayers() == 0)
        {
            System.out.println("Sorry, there are no Players in the System");
        }
        else
        {
            System.out.print("Enter the name of the Club: ");
            String name = EasyScanner.nextString();
            System.out.println(playerlist1.listPlayersBySpecificClub(name));
        }
    }

    //This method deletes a player by index number
    public void deletePlayer()
    {
        if (playerlist1.numberOfPlayers() == 0)
        {
            System.out.println("Sorry, there are no Players in the System");

        }
        else if (playerlist1.numberOfPlayers() > 0)
        {

            System.out.println("List of Players in the System: " + "\n" + playerlist1.listOfPlayers());
            System.out.println("--------------------------\n\nPlease enter the index number of the Player you wish to delete from the System: ");

            int index = EasyScanner.nextInt();
            if (index >= playerlist1.numberOfPlayers() || index < 0)
            {   
                do{

                    System.out.println(playerlist1.listOfPlayers() + "Please try again and enter a valid index number." );
                    index = EasyScanner.nextInt();

                }
                while(index >= playerlist1.numberOfPlayers() || index < 0);
                playerlist1.removePlayer(index);
                System.out.println("Index: " + index + " Player Removed from the System");
            }
            else
            {
                playerlist1.removePlayer(index);
                System.out.println("Index: " + index + " Player Removed from the System");
            }

        }

    }
}
