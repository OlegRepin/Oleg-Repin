import java.util.Scanner;
public class laba4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite 1 chislo ");
        int ch1 = sc.nextInt();
        System.out.print("Vvedite 2 chislo ");
        int ch2 = sc.nextInt();
        System.out.println(minch(ch1,ch2));

    }
    public static int minch(int ch1, int ch2)
    {
        int c1;
        if (ch1 < ch2)
            c1 = ch1;
        else
            c1 = ch2;
        return c1;

    }
}
