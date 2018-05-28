import java.util.Scanner;
public class zadaniye2
{
    public static void full(int[] array,int a,int b)
    {
        for (int i = 0; i < 9; i++) {
            array[i] = random(a, b);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static int random(int a, int b)
    {
        int s;
        s = ((int) (Math.random() * a) + (b));
        return s;
    }
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите нижнюю границу ");
        int a = scan.nextInt();
        System.out.print("Введите верхнюю границу ");
        int b = scan.nextInt();
        int[] mas = new int[10];
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        int[] mas3 = new int[10];
        int[] mas4 = new int[10];
        full(mas, a, b);
        full(mas1, a, b);
        full(mas2, a, b);
        full(mas3, a, b);
        full(mas4, a, b);
    }
}
