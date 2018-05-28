public class Pegas extends Horse
{
    public void polet()
    {
        System.out.println("Пегас "+name+ " взлетел");
    }

    public Pegas(String name) {
        super(name);
    }

    public static void main(String[] args)
    {
        Pegas p = new Pegas("Pegasus");
        p.polet();
    }
}
