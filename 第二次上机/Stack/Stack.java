package Stack;

/**
 * Created by leehaoze on 16/10/28.
 */
public class Stack {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    private Node first = null;

    public boolean isEmpty(){
        if(first == null)
            return true;
        else
            return false;
    }

    public void Push(int num) {
        Node temp = new Node(num);
        temp.next = first;
        first = temp;
    }

    public int Pop(){
        if(first == null){
            System.out.println("栈已为空，无法继续弹出,返回-1");
            return -1;
        }
        else{
            int num = first.data;
            first = first.next;
            return num;
        }
    }
    public int Get_Top(){
        if(first == null){
            System.out.println("栈为空栈，不存在栈顶元素,返回-1");
            return -1;
        }
        else{
            return first.data;
        }
    }
}
