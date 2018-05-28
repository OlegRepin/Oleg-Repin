public class Dog extends Pet
{
    public Dog(String name,String mas,String age,String floor)
    {
        super(name,mas,age,floor);

    }

    public static void main(String[] args)
    {
        Dog pes= new Dog("Vasya" ,"15", "3", "men" );
        System.out.print(pes.getImya()+" ");
        System.out.print(pes.getVes()+" ");
        System.out.print(pes.getVozrast()+" ");
        System.out.print(pes.getPol()+" ");

    }
}