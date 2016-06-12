package Homework;

public class Homework_10_1 {

	public static boolean isPrime(int num) {
		if(num == 1)
			return false;
		for(int i = 2 ; i <= Math.sqrt(num) ; i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] num = new int[5];
		for(int i = 0 ; i < num.length ; i++){
			num[i] = (int)(Math.random() * 100) + 1;
			if(isPrime(num[i]))
				System.out.println(num[i] + "是質數");
			else
				System.out.println(num[i] + "不是質數");
		}
	}
}
