public class Anymal extends Fish
{
    private String Mlek;
    public String getMlek()
    {
        return Mlek+" ";
    }
    public Anymal(String name, String Mlek)
    {
        super(name);
        this.Mlek=Mlek;

    }
}