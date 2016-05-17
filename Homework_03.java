package Homework;
import java.util.Arrays;
import java.util.Scanner;

public class Homework_03 {

	public static void main(String[] args) {
		int[] num = new int[3];
		int ranNum, guessNum;
		int digit, ten, col = 0, count = 0, hateNum;		
		final int LOTTERY = 49;
		int[] goodArray = new int[LOTTERY];

		Scanner sc = new Scanner(System.in);
		
		//↓↓↓↓↓↓↓↓第１題↓↓↓↓↓↓↓↓		
		System.out.println("請輸入三個整數:");
		while (!sc.hasNextInt()) { //接受輸入直到使用者輸入整數為止
			sc = new Scanner(System.in);
		}
		for (int i = 0; i < num.length; i++)
			num[i] = sc.nextInt(); //將三邊長存入陣列
		Arrays.sort(num); //排序
		if (num[0] <= 0 || num[1] <= 0 || num[2] <= 0)
			System.out.println("不是三角形");
		else if ((num[0] + num[1]) < num[2])
			System.out.println("不是三角形");
		else if (num[0] == num[1] && num[1] == num[2])
			System.out.println("正三角形");
		else if (num[0] == num[1] || num[1] == num[2]){			
			System.out.println("等腰三角形");
			if(num[0] * num[0] + num[1] * num[1] == num[2] * num[2])
				System.out.println("直角三角形");
		}
		else if(num[0] * num[0] + num[1] * num[1] == num[2] * num[2])
			System.out.println("直角三角形");
		else
			System.out.println("其他三角形");
			
		
		
		//↓↓↓↓↓↓↓↓第２題↓↓↓↓↓↓↓↓
		ranNum = (int) (Math.random() * 101);
		System.out.println("開始猜數字吧");
		do {			
			if (sc.hasNextInt()) {
				guessNum = sc.nextInt();
				if (guessNum > ranNum)
					System.out.println("猜錯囉! 數字比" + guessNum + "小");
				else if(guessNum < ranNum)
					System.out.println("猜錯囉! 數字比" + guessNum + "大");
				else
					break; //猜對跳出迴圈
				
			}
			sc = new Scanner(System.in);
		} while (true);
		System.out.println("答對了!答案就是" + ranNum);
		
		//↓↓↓↓↓↓↓↓第３題↓↓↓↓↓↓↓↓
		System.out.println("阿文...請輸入你討厭哪個數字");
		sc = new Scanner(System.in);
		while (!sc.hasNextInt()) { //接受輸入直到使用者輸入整數為止
			sc = new Scanner(System.in);
		}
		hateNum = sc.nextInt();
		System.out.println();
	
		for (int i = 1 ; i <= LOTTERY ; i++) {
			digit = i % 10; //紀錄個位數字
			ten = i / 10; //紀錄十位數字
			if (digit != hateNum && ten != hateNum) {//個位數十位數都不是阿文討厭的數字則印出
				System.out.print(i + "\t");
				goodArray[i - 1] = i;
				col++;
				count++;
			}
			else
				goodArray[i - 1] = 0;
			if (col == 6) { //每印6個換一行
				col = 0;
				System.out.println();
			}
		}
		
		System.out.println("總共有" + count + "數字可選");
		System.out.println("電腦幫你選了...");
		for(int i = 0 ; i < 6 ; i++){
			int ran = (int) (Math.random() * LOTTERY);
			while(goodArray[ran] == 0){
				ran = (int) (Math.random() * LOTTERY);
			}				
			System.out.print(goodArray[ran]+ "\t");
			goodArray[ran] = 0;				
		}
		
	}
}
