import java.util.Scanner;
public class Get_Max{
	public static int Cac_Max(int num){
		int ans = -1;
		while(num / 10 != 0){
			ans = ans > num % 10 ? ans : num % 10;
			num /= 10;
		}
		ans = ans > num ? ans : num;
		return ans;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		System.out.println(num + "各个位上最大的数字是:" + Cac_Max(num));
	}
}