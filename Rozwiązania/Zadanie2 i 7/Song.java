/**
 * Created by jas on 2017-03-13.
 */
public class Song
{

    public static int getAmountSong() //zadanie numer 7.
    {
        return amountSong; //zadanie numer 7.
    }

    public Song()
    {
        amountSong++; //zadanie numer 7.
    }

    private static int amountSong; //zadanie numer 7.


    private String artist;
    private String name;

    public String getArtist()
    {
        return artist;
    }

    public String getName()
    {
        return name;
    }

    public void setArtist(String artysta)
    {
        this.artist = artysta;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void getFullNameSong()
    {
        System.out.println("Full name song is : "+ artist + "-" + name);
    }
}
