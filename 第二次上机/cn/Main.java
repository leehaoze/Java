package cn;

import cn.net.sdkd.Teacher;
import cn.sd.TeacherManagement;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/10/27.
 */
public class Main {
    public static void Input(Teacher[] teachers) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < teachers.length; ++i) {
            System.out.println("请输入老师的名字，回车结束:");
            String name = in.nextLine();
            System.out.println("请输入老师的年龄，回车结束:");
            String sage = in.nextLine();
            System.out.println("请输入老师的学院，回车结束:");
            String seminary = in.nextLine();
            teachers[i] = new Teacher();
            teachers[i].setNo(i);
            teachers[i].setName(name);
            int age = Integer.parseInt(sage);
            teachers[i].setAge(age);
            teachers[i].setSeminary(seminary);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入老师的个数，回车结束:");
        int num = in.nextInt();
        Teacher teachers[] = new Teacher[num];
        Input(teachers);
        TeacherManagement management = new TeacherManagement();
        management.search(teachers);
    }
}
