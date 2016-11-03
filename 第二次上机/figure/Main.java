package figure;

/**
 * Created by leehaoze on 16/10/20.
 */

public class Main {

    public static void Rec() {
        Rectangle rec = new Rectangle(10, 20);
        System.out.println("矩形的周长是:" + rec.Get_Perimeter());
        System.out.println("矩形的面积是:" + rec.Get_area());
    }

    public static void Cir() {
        Circle cir = new Circle(10);
        System.out.println("圆形的周长是:" + cir.Get_Perimeter());
        System.out.println("圆形的面积是:" + cir.Get_area());
    }

    public static void Tir() {
        Triangle tri = new Triangle(6, 8, 10);
        System.out.println("三角形的周长是:" + tri.Get_Perimeter());
        System.out.println("三角形的面积是:" + tri.Get_area());
    }

    public static void main(String[] args) {
        Tir();
        Rec();
        Cir();
    }
}
