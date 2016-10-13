public class Is_Prime{
	public static boolean Prime(int num){
		boolean is_prime = true;
		if(num < 2) return is_prime;
		else{
			for (int i = 2; i <= Math.sqrt(num);++i ) {
				if(num % i == 0){
					is_prime = false;
					break;
				}
			}
		}
		return is_prime;
	}	
	
	public static void main(String[] args){
		System.out.println("100以内的素数有：");
		for (int i = 1; i <= 100 ; ++i) {
			if(Prime(i))
				System.out.println(i);
		}
	}
}