public class Mult{
	public static long cac(long num){
		if(num == 1) return 1;
		else return num * cac(num - 1);
	}
	public static void main(String[] args){
		System.out.println("1!+2!+...20!的答案是:");
		long ans = 0;
		for (long i = 1;i <= 20 ;++i ) {
			ans += cac(i);
		}
		System.out.println(ans);
	}
}