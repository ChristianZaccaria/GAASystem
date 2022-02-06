
/**
 * Player class to create player objects
 *
 * @author Christian Zaccaria
 * @version 22/02/2021
 */
public class Player
{
    // 1. Declaring Variables
    private String Firstname;
    private String Surname;
    private String address;
    private String mobile;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String sport;
    private Club club;

    // 2. Constructor with some validation
    public Player (String Firstname, String Surname, String address, String mobile, int dayOfBirth, int monthOfBirth, int yearOfBirth, String sport, Club club)
    {
        if(Firstname.length() <= 40)
        {
            this.Firstname = Firstname;
        }
        else
        {
            this.Firstname = Firstname.substring(0,40);
        }

             
        if(Surname.length() <= 40)
        {
            this.Surname = Surname;
        }
        else
        {
            this.Surname = Surname.substring(0,40);
        }

        this.address = address;
        this.mobile = mobile;

        if (dayOfBirth > 0 && dayOfBirth <= 31)
        {
            this.dayOfBirth = dayOfBirth;
        }
        
        if (monthOfBirth > 0 && monthOfBirth <= 12)
        {
            this.monthOfBirth = monthOfBirth;
        }
        
        this.yearOfBirth = yearOfBirth;
        this.sport = sport.toUpperCase();
        this.club = club;
    }

    // Getters for each Variable: (used to view the data)
    public String getAddress()
    {
        return address;
    }

    public Club getClub()
    {
        return club;
    }

    public int getDayOfBirth()
    {
        return dayOfBirth;
    }

    public String getFirstname()
    {
        return Firstname;
    }   

    public String getMobile()
    {
        return mobile;
    }

    public int getMonthOfBirth()
    {
        return monthOfBirth;
    }

    public String getSport()
    {
        return sport;
    }

    public String getSurname()
    {
        return Surname;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    // Setters for each Variable: (used to modify data)
    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setClub(Club club)
    {
        this.club = club;
    }

    public void setDayOfBirth(int dayOfBirth)
    {
        if (dayOfBirth > 0 && dayOfBirth <= 31)
        {
            this.dayOfBirth = dayOfBirth;
        }
    }

    public void setFirstname(String Firstname)
    {
        if(Firstname.length() <= 40)
        {
            this.Firstname = Firstname;
        }
        else
        {
            this.Firstname = Firstname.substring(0,40);
        }
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public void setMonthOfBirth(int monthOfBirth)
    {
        if (monthOfBirth > 0 && monthOfBirth <= 12)
        {
            this.monthOfBirth = monthOfBirth;
        }
    }

    public void setSport(String sport)
    {
        this.sport = sport;
    }

    public void setSurname(String Surname)
    {
        if(Surname.length() <= 40)
        {
            this.Surname = Surname;
        }
        else
        {
            this.Surname = Surname.substring(0,40);
        }
    }

    public void setYearOfBirth(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }

    //toString (used to display data to the user in a human-readable form)
    public String toString()
    {
        return "\n" + "First Name: " + Firstname + "\n"
        + "Surname: " + Surname + "\n"
        + "Address: " + address + "\n"
        + "Mobile Number: " + mobile + "\n"
        + "Date of Birth: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth + "\n"
        + "Sport: " + sport + "\n"
        + "Club: " + club + "\n";
    }
}
