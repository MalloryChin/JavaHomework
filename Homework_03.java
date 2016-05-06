import java.util.Arrays;
import java.util.Scanner;

public class Homework_03 {

	public static void main(String[] args) {
		int[] num = new int[3];
		int ranNum, guessNum = -1;
		int digit, ten, col = 0, count = 0, hateNum = -1;
		final int LOTTERY = 49;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		if(sc.hasNextInt()){
			for(int i = 0; i < num.length ; i++)
				num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		if(num[0] <= 0 || num[1] <= 0 || num[2] <= 0)
			System.out.println("不是三角形");
		else if((num[0] + num[1]) < num[2])
			System.out.println("不是三角形");
		else if(num[0] == num[1] && num[1]== num[2])
			System.out.println("正三角形");
		else if(num[0] == num[1] || num[1] == num[2])
			System.out.println("等腰三角形");
		else
			System.out.println("其他三角形");
		
		ranNum = (int)(Math.random() * 10);
		
		
		System.out.println("開始猜數字吧");

		do{
			sc = new Scanner(System.in);
			if(sc.hasNextInt())
				guessNum = sc.nextInt();
			if(guessNum != ranNum)
				System.out.println("猜錯囉");								
		}while(guessNum != ranNum);
		System.out.println("答對了!答案就是" + ranNum);
		
		System.out.println("阿文...請輸入你討厭哪個數字");
		sc = new Scanner(System.in);
		if(sc.hasNextInt())
			hateNum = sc.nextInt();
		System.out.println();
		for(int lottery = 1 ; lottery <= LOTTERY ; lottery++){
			digit = lottery % 10;
			ten = lottery / 10;
			if(digit != hateNum && ten != hateNum){
				System.out.print(lottery + "\t");
				col++; count++;
			}
			if(col == 6){
				col = 0;
				System.out.println();
			}
		}
		System.out.println("總共有" + count + "數字可選");
		
		
	}

}
