package cn.sd;

import cn.net.sdkd.Teacher;

import java.util.Scanner;

/**
 * Created by leehaoze on 16/10/20.
 */
public class TeacherManagement {
    public boolean is_digit(String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    public void search(Teacher[] teacher) {
        System.out.println("请输入要查找的老师的姓名或年龄,输入EXIT退出");
        while (true) {
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            if (line.equals("EXIT")) break;
            boolean find = false;
            if (is_digit(line)) {
                int age = Integer.parseInt(line);
                for (int i = 0; i < teacher.length; ++i) {
                    if (teacher[i].getAge() == age) {
                        find = true;
                        System.out.println(teacher[i]);
                    }
                }
            } else {
                for (int i = 0; i < teacher.length; ++i) {
                    if (teacher[i].getName().equals(line)) {
                        find = true;
                        System.out.println(teacher[i]);
                    }
                }
            }
            if (!find) {
                System.out.println("没有符合条件的老师");
            }
        }
    }
}
