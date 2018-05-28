import java.util.Scanner;
class Circle
{
    public double r,x,y;
    public int dist;

    public double Diametr()
    {
        return (Math.PI * 2 * this.r);
    }
    public void Perenos()
    {
        x = y + (int)(Math.random()*199-99);
        y = x + (int)(Math.random()*199-99);
    }

    public Circle()
    {
        r = 3;
        x = 1;
        y = 1;
    }

    public Circle(int r, double x, double y)
    {
        this.r=r;
        this.x=x;
        this.y=y;
    }

    public int Rastoyaniye(Circle second)
    {
        return (int) (Math.sqrt(Math.pow((this.x - second.x), 2) + Math.pow((this.y - second.y), 2)));
    }
    public boolean Kasaniye(Circle second)
    {
        return ((this.r + second.r == dist) || (this.r - second.r == dist) || (dist < (Math.abs(this.r-second.r))));
    }
}

public class laba5
{
        public static void main(String [] args){
            int k;
            double a,b;
            System.out.println("Введите радиус круга:");
            Scanner sc_k = new Scanner(System.in);
            k=sc_k.nextInt();
            System.out.println("Введите x круга:");
            Scanner sc_a = new Scanner(System.in);
            a=sc_a.nextInt();
            System.out.println("Введите у круга:");
            Scanner sc_b = new Scanner(System.in);
            b=sc_b.nextInt();
            Circle obj = new Circle();
            Circle obj1 = new Circle(k,a,b); //First task
            System.out.println("Диаметр первой окружности:\t" + obj.Diametr()); //
            obj.Perenos();
            System.out.println("Перенос первой окружности :\t" + obj.x + "\t" + obj.y + "\n");
            System.out.println("Длинна второй окружности :\t" + obj1.Diametr());
            System.out.println("Перенос второй окружности:\t" + obj1.x + "\t" + obj1.y);
            System.out.println("Расстояние между окружностями:\t" + obj.Rastoyaniye(obj1) +"\n");
            //Fifth task
            if (obj.Kasaniye(obj1))
            {
                System.out.println("Окружности пересекаются.");
            }
            else
            {
                System.out.println("Окружности не пересекаются.");
            }
        }
}
