package DLinkList;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/3.
 */
public class DLinkList {
    private int data, size;
    private DLinkList next, pre;

    private void Println(String s){
        System.out.println(s);
    }
    private void Print(String s){
        System.out.print(s);
    }
    private void Println(int num){
        System.out.println(num);
    }
    private void Print(int num){
        System.out.print(num);
    }

    public DLinkList() {
        pre = null;
        next = null;
        size = 0;
    }

    public void Init(){
        this.next = new DLinkList();
        DLinkList now = this;
        for (int i = 0; i < 10; ++i){
            now.next = new DLinkList();
            now.next.pre = now;
            now = now.next;
            now.data = (int)(1+Math.random()*(10-1+1));
            now.next = null;
            ++size;
        }
        Print("已初始化好一条链表:");
        now = this.next;
        while(now != null){
            Print(now.data + " ");
            now = now.next;
        }
        Print("\n");
    }

    public void Insert() {
        int value, pos;
        Scanner in = new Scanner(System.in);
        Println("请输入要插入的值:");
        value = in.nextInt();
        Println("请输入要插入的位置(当前链表共有" + size + "个元素):");
        pos = in.nextInt();
        DLinkList now = this;
        if (pos > size + 1 || pos < 1) {
            Println("输入的位置不合法!");
        } else {
            for (int i = 0; i < pos - 1; ++i){
                now = now.next;
            }
            DLinkList temp = new DLinkList();
            temp.data = value;
            temp.next = now.next;
            temp.pre = now;
            now.next = temp;
            ++size;
            Println("插入成功!");
        }
        Print("当前链表为:");
        now = this.next;
        while(now != null){
            Print(now.data + " ");
            now = now.next;
        }
        Print("\n");
    }

    public void Delete_by_Value() {
        Scanner in = new Scanner(System.in);
        int value;
        Println("请输入要删除的元素的值:");
        value = in.nextInt();
        DLinkList now = this.next;
        boolean delete_success = false;
        while(now != null){
            if(now.data == value){
                if(now.next != null)
                    now.next.pre = now.pre;
                if(now.pre != null)
                    now.pre.next = now.next;
                delete_success = true;
                --size;
            }
            now = now.next;
        }
        if(!delete_success){
            Println("该元素不存在!");
        }
        else{
            Println("删除成功!");
        }
    }

    public void Delete_by_Postion() {
        Scanner in = new Scanner(System.in);
        int pos;
        Println("请输入要删除的元素的位置(当前链表内共有" + size + "个元素):");
        pos = in.nextInt();
        if (pos > size || pos < 1) {
            Println("输入的位置不合法!");
        } else {
            DLinkList now = this;
            for (int i = 0; i < pos; ++i){
                now = now.next;
            }
            if(now.next != null)
                now.next.pre = now.pre;
            if(now.pre != null)
                now.pre.next = now.next;
            Println("删除成功!");
            --size;
        }
    }

    public int Get_Size() {
        Println("当前链表内元素的个数为:" + size);
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            Println("链表是空的");
            return true;
        }
        else {
            Println("链表里有"+size+"个元素");
            return false;
        }
    }

    public void Traverse() {
        if(size == 0){
            Println("链表为空");
        }
        else {
            DLinkList now = this.next;
            boolean first_print = true;
            while (now != null) {
                if (!first_print) Print(" ");
                Print(now.data);
                if (first_print) first_print = false;
                now = now.next;
            }
            Print("\n");
        }
    }

    public void Get_Data() {
        Scanner in = new Scanner(System.in);
        Println("请输入要取出元素的位置(当前链表共有" + size + "个元素):");
        int pos = in.nextInt();
        if(pos > size){
            Println("输入的位置不合法!");
        }
        else {
            DLinkList temp = this;
            for (int i = 0; i < pos; ++i) {
                temp = temp.next;
            }
            Println("在第" + pos + "位上的元素为" + temp.data);
        }
    }

}
