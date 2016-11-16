package String_Statistics;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/16.
 */
public class Count_String {
    public static void Print(String s){
        System.out.println(s);
    }

    public static void Count(String ipt){
        int length = ipt.length();
        int count_of_big = 0,count_of_small = 0,count_of_others = 0;
        for(int i = 0; i < length; ++i){
            if(ipt.charAt(i) >= 'A' && ipt.charAt(i) <= 'Z'){
                ++count_of_big;
            }
            else if(ipt.charAt(i) >= 'a' && ipt.charAt(i) <= 'z'){
                ++count_of_small;
            }
            else{
                ++count_of_others;
            }
        }

        Print("大写字母的个数为" + count_of_big);
        Print("小写字母的个数为" + count_of_small);
        Print("其他字符的个数为" + count_of_others);
    }

    public static void main(String argsp[]){
        String ipt = new String();
        Scanner in = new Scanner(System.in);
        Print("请输入一个字符串");
        ipt = in.nextLine();
        Count(ipt);
    }
}
