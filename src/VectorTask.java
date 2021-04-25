import java.util.Scanner;

public class VectorTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println(" Поиск длин векторов A, B и угла между ними");
        System.out.println("--------------------------------------------");

        System.out.print(" Введите координаты X, Y и Z конца вектора A: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();

        System.out.print(" Введите координаты X, Y и Z конца вектора B: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double z2 = in.nextDouble();

        System.out.println("--------------------------------------------");

        double v1 = Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
        double v2 = Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2);
        double a = Math.acos((x1 * x2 + y1 * y2 + z1 * z2) / (v1 * v2));
        a = a * 180 / Math.PI;
        if(a == 90) {
            System.out.println("Угол найден");
        }else{
            System.out.println("Угол не равен 90 градусов");;

        }

        System.out.printf(" Длина вектора A = %.2f\n", v1);
        System.out.printf(" Длина вектора B = %.2f\n", v2);
        System.out.printf(" Угол между A и B = %.2f градусов\n", a);

        if(a == 90) {
            System.out.println("Угол найден");
        }else{
            System.out.println("Угол не равен 90 градусов");;

        }
    }
}
