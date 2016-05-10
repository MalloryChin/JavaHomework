import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int number = 0;
		int array[] = new int[6];
		boolean b;
		for(int i = 0 ; i < array.length ; i++){
			b = true;
			while(b){
				b = false;
				number = (int)(Math.random()*42+1);
				for(int j = 0 ; j<array.length ; j++){
					if(array[j] == number){
						b = true;
					}
				}
			}
			array[i] = number;
			System.out.printf("array[%d]=%d\n", i, number);
		}

		
		int digit, ten, col = 0, count = 0, hateNum;		
		final int LOTTERY = 49;
		int[] goodNum = new int[LOTTERY];
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字");
		sc = new Scanner(System.in);
		
		while (!sc.hasNextInt()) { //接受輸入直到使用者輸入整數為止
			sc = new Scanner(System.in);
		}
		hateNum = sc.nextInt();
		System.out.println();
		
		for (int lottery = 1; lottery <= LOTTERY; lottery++) {
			digit = lottery % 10; //紀錄個位數字
			ten = lottery / 10; //紀錄十位數字
			if (digit == hateNum || ten == hateNum) {//阿文討厭的數字
				for(int j = 0 ; j<array.length ; j++){
		
					if(array[j] == lottery){ //討厭數字在陣列裡
						b = true;
						while(b){
							b = false;
							number = (int)(Math.random()*42+1);
							for(int k = 0 ; k<array.length ; k++){
								if(array[k] == number || number == lottery){
									b = true;
								}
							}
						}
						array[j] = number;
					}
		
				}
			}
		}

		for(int i = 0 ; i<array.length ; i++){
			System.out.printf("array[%d]=%d\n", i, array[i]);
		}
		System.out.println("阿文...電腦幫你選了...");
		for(int i = 0 ; i<array.length ; i++){
			System.out.print(array[i] + "\t");
		}
	}

}
