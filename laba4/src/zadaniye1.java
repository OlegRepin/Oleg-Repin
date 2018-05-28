import java.util.Scanner;
public class zadaniye1
{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] c = new int[20];


        for (int i = 0; i < 20; i++)
        {
            c[i]=random(a,b);
            System.out.print(c[i]+" ");
        }
    }

    public static int random(int a,int b)
    {
        int s;
        int raz=b-a;
        s  = ((int)(Math.random() * raz));
        return s+raz;
    }

}
