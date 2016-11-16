package Map;


import java.util.Objects;
import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/16.
 */
public class Food {
    public static Map []food;
    public static int num;//菜的数量

    public static void Print(String s){
        System.out.println(s);
    }



    public static void Init(){
        Scanner in = new Scanner(System.in);
        Print("请先输入菜单\n请输入菜的数量");
        num = Integer.parseInt(in.nextLine());
        food = new Map[num];
        Print("请按照如下格式输入菜的信息:\n北京烤鸭 189");
        for(int i = 0; i < num; ++i){
            String ipt = in.nextLine();
            String name = new String();
            String price = new String();
            int length = ipt.length();
            for (int j = 0;j < length; ++j){
                if(ipt.charAt(j) == ' ')continue;
                if(!(ipt.charAt(j) > '0' && ipt.charAt(j) <'9')){
                    name += ipt.charAt(j);
                }
                else{
                    price += ipt.charAt(j);
                }
            }
            food[i] = new Map();
            food[i].name_ = name;
            food[i].price_ = Integer.parseInt(price);
        }
    }

    public static int Get_Price(String name){
        int length = food.length;
        for (int i = 0; i < length; ++i){
            if(name.equals(food[i].name_)){
                return food[i].price_;
            }
        }
        Print("这种菜不存在！");
        return -1;
    }

    public static void Make_Order(){
        Scanner in = new Scanner(System.in);
        Print("请输入要点的菜的名字，输入 点菜完毕 计算金额");
        String ipt;
        int sum = 0;
        while(true){
            ipt = in.nextLine();
            if(ipt.equals("点菜完毕"))break;
            else{
                int price = Get_Price(ipt);
                if(price != -1){
                    Print("您点的菜为" + ipt + "价格为" + price);
                    sum += price;
                }
            }
        }
        Print("点菜的总金额为" + sum);
    }

    public static void main(String args[]){
        Init();
        Make_Order();
    }
}
