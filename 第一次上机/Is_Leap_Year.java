import java.util.Scanner;
public class Is_Leap_Year{
    public static int input(){
        System.out.println("请输入一个年份:");
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        return year;
    }

    public static void judge(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " 是闰年");
        }
        else{
            System.out.println(year + " 不是闰年");
        }
    }

    public static void main(String[] args){
        int year;
        year = input();
        judge(year);
    }
}