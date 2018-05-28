
public class Human extends Ape
{
    private  String Surname;
    public String getSurname()
    {
        return Surname+" ";
    }

    public Human (String name, String Mlek, String vid,String Surname)
    {
        super(name,Mlek, vid);
        this.Surname=Surname;
    }
    public static void main(String[] args)
    {

        Human c=new  Human("Ivan","Mlekopitaushee", "Chelovek", "Petrov");
        System.out.print(c.getName());
        System.out.print(c.getSurname());
        System.out.print(c.getMlek());
        System.out.print(c.getVid());

    }
}