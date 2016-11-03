package DLinkList;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/3.
 */
public class Main {
    public static void Print(String p){
        System.out.println(p);
    }

    public static boolean Wait_Order(DLinkList list){
        Scanner in = new Scanner(System.in);
        Print("请输入指令");
        Print("1.插入一个新的元素");
        Print("2.在某个位置删除元素");
        Print("3.删除链表中与X相同的元素");
        Print("4.返回当前链表中对象的个数");
        Print("5.判断链表是否为空");
        Print("6.遍历输出所有数据");
        Print("7.取某个位置的元素的值");
        Print("0.退出");
        int order = in.nextInt();
        switch (order){
            case 1:list.Insert();return true;
            case 2:list.Delete_by_Postion();return true;
            case 3:list.Delete_by_Value();return true;
            case 4:list.Get_Size();return true;
            case 5:list.isEmpty() ;return true;
            case 6:list.Traverse();return true;
            case 7:list.Get_Data();return true;
            case 0:return false;
            default:Print("输入的指令不合法！");return false;
        }

    }

    public static void Init_List(DLinkList list){
        list.Init();
    }

    public static void main(String []args){
        DLinkList list = new DLinkList();
        Init_List(list);
        while(Wait_Order(list)){
            Print("按下回车以继续");
            Scanner in = new Scanner(System.in);
            in.nextLine();
        }
    }
}
