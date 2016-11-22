package Matrix_double;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/3.
 */
public class Main {
    public static void Init(Matrix A,Matrix B){
        System.out.println("请输入矩阵A:");
        A.Creat_Matrix();
        System.out.println("请输入矩阵B:");
        B.Creat_Matrix();
    }

    public static void Change_Value(Matrix A){
        Scanner in = new Scanner(System.in);
        int row,col,value;
        System.out.println("请输入要修改的值的行数:");
        row = in.nextInt();
        System.out.println("请输入要修改的值的列数:");
        col = in.nextInt();
        if(row > A.getRow() || col > A.getCol() || row < 1 || col < 1){
            System.out.println("超出矩阵的范围");
            return ;
        }
        System.out.println("您要修改的元素为:" + A.Get(row,col));
        System.out.println("请输入要修改的值:");
        value = in.nextInt();
        A.Set(row,col,value);
        System.out.println("修改成功");
    }

    public static void Get_Value(Matrix A){
        Scanner in = new Scanner(System.in);
        int row,col;
        System.out.println("请输入行数:");
        row = in.nextInt();
        System.out.println("请输入列数:");
        col = in.nextInt();
        if(row > A.getRow() || col > A.getCol() || row < 1 || col < 1){
            System.out.println("超出矩阵的范围");
            return ;
        }
        System.out.println("您要查找的值为:" + A.Get(row,col));
    }



    public static boolean Wait_Order(Matrix A,Matrix B){
        System.out.println("请选择要进行的操作:");
        System.out.println("1.修改第row行，第col列元素的值;");
        System.out.println("2.获取第row行，第col列元素的值;");
        System.out.println("3.获取矩阵的列数;");
        System.out.println("4.获取矩阵的行数;");
        System.out.println("5.将矩阵A与矩阵B相加;");
        System.out.println("6.将矩阵A与矩阵B相乘");
        System.out.println("7.将矩阵A转置;");
        System.out.println("8.打印当前矩阵;");
        System.out.println("0.退出;");
        int order;
        Scanner in = new Scanner(System.in);
        order = in.nextInt();
        switch (order){
            case 0:return false;
            case 1:Change_Value(A);return true;
            case 2:Get_Value(A);return true;
            case 3:System.out.println("矩阵的列数为:"+A.Width());return true;
            case 4:System.out.println("矩阵的行数为:"+A.Height());return true;
            case 5:System.out.println("相加后的矩阵为:");A.Add(B); A.Print(); return true;
            case 6:System.out.println("相乘后的矩阵为:");A.Multipy(B); A.Print(); return true;
            case 7:System.out.println("转置后的矩阵为:");A.Transpose();A.Print();return true;
            case 8:A.Print();return true;
        }
        System.out.println("输入的指令不合法！");
        return false;
    }

    public static void main(String []args){
        Matrix A,B;
        Scanner in = new Scanner(System.in);
        A = new Matrix();
        B = new Matrix();
        Init(A,B);
        while(Wait_Order(A,B)){
            System.out.println("\n按下回车返回上一层菜单");
            String temp = in.nextLine();
        }
    }
}
