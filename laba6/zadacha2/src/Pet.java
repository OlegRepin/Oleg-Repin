public class Pet
{
    private String imya,ves,vozrast,pol;

    public String getImya()
    {
        return imya;
    }

    public String getVes()
    {
        return ves;
    }

    public String getVozrast()
    {
        return vozrast;
    }

    public String getPol() {
        return pol;
    }

    public Pet(String imya, String ves, String vozrast, String pol)
    {
        this.imya = imya;
        this.ves =  ves;
        this.vozrast= vozrast;
        this.pol = pol;
    }
}