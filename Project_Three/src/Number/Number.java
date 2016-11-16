package Number;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/15.
 */
public class Number {
    public static int Get_Num(int num) {
        int count = 0;
        while (num != 0) {
            ++count;
            num /= 10;
        }
        return count;
    }

    public static void Is_Par(int num) {
        int length = Get_Num(num);
        boolean is_par = true;
        int[] stack = new int[length];
        int num_bak = num;
        int pos = length - 1;
        while (num_bak != 0) {
            stack[pos] = num_bak % 10;
            num_bak /= 10;
            --pos;
        }
        pos = 0;
        while (num != 0) {
            if (stack[pos] != num % 10) {
                is_par = false;
                break;
            } else {
                pos++;
                num /= 10;
            }
        }
        if (is_par) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }

    public static void UI() {
        int order;
        int num = -1;
        Scanner in = new Scanner(System.in);

        if (num == -1) {
            System.out.println("请输入一个整数");
            num = in.nextInt();
        }
        while (true) {
            System.out.println("请选择要进行的操作:");
            System.out.println("1.得到输入的整数的位数");
            System.out.println("2.判断输入的整数是否为回文数");
            System.out.println("3.重新输入一个整数");
            System.out.println("0.退出");
            order = in.nextInt();
            switch (order) {
                case 0:
                    return;
                case 1:
                    System.out.println("输入的整数为 : " + num + "，位数为" + Get_Num(num));
                    break;
                case 2:
                    Is_Par(num);
                    break;
                case 3:
                    System.out.println("请输入一个整数：");
                    num = in.nextInt();
                    break;
                default:
                    return;
            }

            System.out.println("按下回车继续");
            String temp;
            temp  = in.nextLine();
            temp  = in.nextLine();
        }
    }

    public static void main(String[] args) {
        UI();
    }
}
