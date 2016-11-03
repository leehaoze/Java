package Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leehaoze on 16/10/27.
 */
public class Main {
    public static void Input(EmployeeABC []employee){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入员工的类型，薪资，工作时间");
        System.out.println("按年结算的员工类型为1，按月结算的员工类型为2，按周结算的员工类型为3");
        for (int i = 0; i < employee.length;++i){
            System.out.println("请输入第" + (i+1) + "个员工的类型，回车结束");
            int size = in.nextInt();
            if(size == 1){
                System.out.println("请输入第" + (i+1) + "个员工的年薪，回车结束");
                int money = in.nextInt();
                System.out.println("请输入第" + (i+1) + "个员工的工作年数，回车结束");
                int year = in.nextInt();
                employee[i] = new EmployeeABC(money,year);
            }
            else if(size == 2){
                System.out.println("请输入第" + (i+1) + "个员工的月薪，回车结束");
                int money = in.nextInt();
                System.out.println("请输入第" + (i+1) + "个员工的工作月数，回车结束");
                int year = in.nextInt();
                employee[i] = new EmployeeABC(money,year);
            }
            else if(size == 3){
                System.out.println("请输入第" + (i+1) + "个员工的周薪，回车结束");
                int money = in.nextInt();
                System.out.println("请输入第" + (i+1) + "个员工的工作周数，回车结束");
                int year = in.nextInt();
                employee[i] = new EmployeeABC(money,year);
            }
            else{
                System.out.println("输入的员工类型不合法，请重新输入");
                --i;
            }
        }
    }

    public static int getEarnings(EmployeeABC []employee){
        int sum = 0;
        for (int i = 0;i < employee.length;++i){
            sum += employee[i].Get_Earnings();
        }
        return sum;
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入员工的个数:");
        int num = in.nextInt();
        EmployeeABC []employee = new EmployeeABC[num];
        Input(employee);
        System.out.println("这些员工的总薪水是" + getEarnings(employee) + "元");
    }
}
