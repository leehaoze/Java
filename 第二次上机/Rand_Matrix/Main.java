package Rand_Matrix;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/3.
 */
public class Main {
    public static boolean Wait_Order(Matrix A){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入指令的编号:");
        System.out.println("1.求最大元素值，指出其在矩阵中的所有出现位置");
        System.out.println("2.求该矩阵的转置矩阵");
        System.out.println("3.生成一个新的矩阵");
        System.out.println("4.输出该矩阵");
        System.out.println("0.退出");
        int order = in.nextInt();
        switch (order){
            case 0:return false;
            case 1:A.Get_Max_Value();return true;
            case 2:A.Transpose();return true;
            case 3:A.Creat_Matrix();System.out.println("生成的新矩阵为:"); A.Print();return  true;
            case 4:A.Print();return true;
            default:System.out.println("输入的指令不合法！");return false;
        }
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String temp;
        Matrix A = new Matrix();
        A.Creat_Matrix();
        System.out.println("随机生成的矩阵为:");
        A.Print();
        while(Wait_Order(A)){
            System.out.println("按下回车以继续");
            temp = in.nextLine();
        }
    }
}
