
/**
 * Club class for creating club objects
 *
 * @author Christian Zaccaria
 * @version 22/02/2021
 */
public class Club
{
    // 1. Declaring Variables
    private String clubName;
    private String clubAddress;
    private String clubChairperson;
    private String clubSecretary;
    private String clubEmail;

    // 2. Constructor with some validation
    public Club (String clubName, String clubAddress, String clubChairperson, String clubSecretary, String clubEmail)
    {

        if(clubName.length() <= 40)
        {
            this.clubName = clubName;
        }
        else
        {
            this.clubName = clubName.substring(0,40);
        }

        if(clubAddress.length() <= 60)
        {
            this.clubAddress = clubAddress;
        }
        else
        {
            this.clubAddress = clubAddress.substring(0,60);
        }

        this.clubChairperson = clubChairperson;
        this.clubSecretary = clubSecretary;

        if(clubEmail.contains("@") && clubEmail.contains("."))
        {
            this.clubEmail = clubEmail;
        }
        else
        {
            this.clubEmail = "Invalid Format Email. Please include an @ and a .";
        }
    }

    // Getters for each Variable: (used to view the data)

    public String getClubAddress()
    {
        return clubAddress;
    }

    public String getClubChairperson()
    {
        return clubChairperson;
    }

    public String getClubEmail()
    {
        return clubEmail;
    }

    public String getClubName()
    {
        return clubName;
    }   

    public String getClubSecretary()
    {
        return clubSecretary;
    }

    // Setters for each Variable: (used to modify data)
    public void setClubAddress(String clubAddress)
    {
        if(clubAddress.length() <= 60)
        {
            this.clubAddress = clubAddress;
        }
        else
        {
            this.clubAddress = clubAddress.substring(0,60);
        }
    }

    public void setClubChairperson(String clubChairperson)
    {
        this.clubChairperson = clubChairperson;
    }

    public void setClubEmail(String clubEmail)
    {
        if(clubEmail.contains("@") && clubEmail.contains("."))
        {
            this.clubEmail = clubEmail;
        }
        else
        {
            this.clubEmail = "Invalid Format Email. Please include an @ and a .";
        }
    }

    public void setClubName(String clubName)
    {
        if(clubName.length() <= 40)
        {
            this.clubName = clubName;
        }
        else
        {
            this.clubName = clubName.substring(0,40);
        }
    }

    public void setClubSecretary(String clubSecretary)
    {
        this.clubSecretary = clubSecretary;
    }

    //toString (used to display data to the user in a human-readable form)
    public String toString()
    {
        return "GAA Club Name: " + clubName + ", "
        + "Address: " + clubAddress + ", "
        + "Club Chairperson: " + clubChairperson + ", "
        + "Club Secretary: " + clubSecretary + ", "
        + "Email: " + clubEmail + "\n";
    }
}
