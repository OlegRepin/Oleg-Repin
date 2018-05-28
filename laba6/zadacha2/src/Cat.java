public class Cat extends Pet
{
    public Cat(String imya,String ves,String vozrast,String pol)
    {
        super(imya,ves,vozrast,pol);
    }


    public static void main(String[] args)
    {
        Cat cot = new Cat("Manya" ,"18", "14", "woman" );
        System.out.print(cot .getImya() +" ");
        System.out.print(cot .getVes()+" ");
        System.out.print(cot .getVozrast()+" ");
        System.out.print(cot .getPol()+" ");
    }
}