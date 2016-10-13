import java.util.Scanner;
public class Narcissistic_Num{
	public static void solve(){
		System.out.println("100 ～ 999 之间的水仙花数为：");
		for (int i = 100; i <= 999 ; ++i) {
			int a,b,c;
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			if(i == a * a * a + b * b * b + c * c * c){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] atgs){
		solve();
	}
}