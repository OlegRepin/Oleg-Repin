public class zadaniye1
{
    public static void main(String[] args)
    {
        int[] mas= new int[20];



        for (int i = 1; i <20; i++) {
            if ((mas[i] = i + 1) % 2 == 0) {
                System.out.print(mas[i] + " ");

            }
        }
        System.out.println();

        for (int i = 1; i <20; i++) {
            if ((mas[i] = i + 1) % 2 == 0) {
                System.out.println(mas[i] + " ");

            }
        }

    }
}
