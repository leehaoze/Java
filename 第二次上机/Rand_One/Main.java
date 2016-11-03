package Rand_One;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/3.
 */
public class Main {
    private static int[] data;

    public static void Init(){
        data = new int [101];
        for (int i = 0; i < 100; ++i){
            data[(int)(1+Math.random()*(10-1+1))] ++;
        }
    }

    public static boolean Input(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查找的值,输入0退出:");
        int value = in.nextInt();
        if(value == 0)return false;
        if(value > 100 || data[value] == 0){
            System.out.println("您要查找的值不存在");
        }
        else{
            System.out.println("您查找的值出现了" + data[value] + "次");
        }
        return true;
    }

    public static void main(String []args){
        Init();
        while(Input()){

        }
    }
}
