public class zadaniye3
{
    public static void main(String[] args)
    {
        int[] mas = new int[15];
        int kol=0;
        for (int i = 0; i < 15; i++)
        {
            mas[i] = ((int)(Math.random() * 9) );
            System.out.print(mas[i]+" ");
            if(mas[i]%2==0)
            {
              kol++;
            }
        }
        System.out.println();
        System.out.println("Chetnih: "+kol);
    }
}
