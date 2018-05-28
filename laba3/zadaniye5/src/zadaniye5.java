public class zadaniye5
{
    public static void main(String[] args) {
        int[][] arr = new int[7][4];
        int[] proizv = new int[7];
        int p=0;
        int i = 0;
        int j = 0;
        int max=0,max_i=0;
        for ( i = 0; i < 7; i++)
        {
            for ( j = 0; j < 4; j++) {
                arr[i][j] = ((int) (Math.random() * 11) - 5);
                System.out.print(arr[i][j] + " " );
                if(j==0)
                    proizv[i]=arr[i][j];
                else
                    proizv[i]*=arr[i][j];
                if(j==arr[i].length-1);
            }
            System.out.println();
        }

        for(i=0;i<proizv.length;i++){
            if(Math.abs(proizv[i])>max)
            {
                max=proizv[i];
                max_i=i;
            }
        }
        System.out.println("Индекс строки с наибольшим произведением - "+max_i+1);


    }

}
