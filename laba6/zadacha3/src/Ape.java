public class Ape extends Anymal {
    private String vid;
    public String getVid()
    {
        return vid+" ";
    }
    public Ape(String name, String Mlek, String vid)
    {
        super(name, Mlek);
        this.vid = vid;
    }

}