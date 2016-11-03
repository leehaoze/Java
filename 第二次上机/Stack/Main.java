package Stack;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/10/28.
 */
public class Main {
    public static void Trans_To_Binary(int num){
        Stack S = new Stack();
        System.out.println(num + " 转化成二进制为:");
        while(num != 0){
            S.Push(num % 2);
            num /= 2;
        }
        while(!S.isEmpty()){
            System.out.print(S.Pop());
        }
        System.out.print("\n");
    }

    public static void main(String[]args){
        System.out.println("请输入一个要转化为二进制的正整数,输入-1退出:");
        while(true) {
            int num;
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            if(num == -1)break;
            Trans_To_Binary(num);
        }
    }
}
