public class zadaniye4
{
    public static void main(String[] args)
    {
       int n=5;
       int m=8;
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
            {
                mas[i][j] = ((int) (Math.random() * 89)+10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
