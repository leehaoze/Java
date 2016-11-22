package Random_Teacher;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/11/16.
 */
public class Random_Teacher {
    public static String[] getRandomTeachers(String []teachers,int n){
        String[] ans = new String [n];
        boolean []hash = new boolean[teachers.length];
        for (int i = 0; i < n; ++i){
            int num = (int)(0+Math.random()*(teachers.length - 1 - 0 + 1));
            if(hash[num] == false)hash[num] = true;
            else {
                --i;
                continue;
            }
            ans[i] = teachers[num];
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("请先输入老师的信息:");
        System.out.println("请输入老师的数量:");
        int n;
        n = Integer.parseInt(in.nextLine());
        String []teachers = new String [n];
        System.out.println("请输入老师的姓名");
        for (int i = 0; i < n; ++i){
            teachers[i] = in.nextLine();
        }
        System.out.println("请输入要抽取的老师的数量:");
        n = in.nextInt();
        String []ans = getRandomTeachers(teachers,n);
        System.out.println("抽取的老师的姓名为:");
        for (int i = 0;i < n; ++i){
            System.out.println(ans[i]);
        }
    }

}
