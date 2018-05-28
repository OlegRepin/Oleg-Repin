import java.util.Scanner;
public class zadaniye2
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Vvedite visotu ");
        int strok = scan.nextInt();
        System.out.print("Vvedite shirinu ");
        int stolbcov = scan.nextInt();


        for (int i = 0; i < strok ; i++)
        {
            for (int j = 0; j < stolbcov; j++)
            {
                System.out.print(8);
            }
            System.out.println();
        }


    }
}
