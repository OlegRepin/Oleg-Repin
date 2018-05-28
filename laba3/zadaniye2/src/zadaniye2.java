public class zadaniye2
{
    public static void main(String[] args)
    {
        int[] mas = new int[101];
        for (int i = 0; i <= 99; i++) {
            if (( mas[i] = i + 1) % 2 == 1)
            {
                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();
        for (int i = 100; i >1;  i--)
        {
            if ((mas[i]=i - 1) % 2 == 1)
            {
                System.out.print(mas[i] + " ");
            }
        }
    }
}
