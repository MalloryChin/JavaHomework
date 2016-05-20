package Homework;

import java.util.Scanner;

public class Homework_05 {
	//↓↓↓↓第1題method↓↓↓↓
	public static void starSquare(int width, int height){
		for(int i = 0 ; i < height ; i++){
			for(int j = 0 ; j < width ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//↓↓↓↓第2題method↓↓↓↓
	public static void randAvg(){
		int[] array = new int[10];
		int sum = 0;
		System.out.println("本次亂數結果:");
		for(int i = 0 ; i < 10 ; i++){
			array[i] = (int)(Math.random() * 101);
			System.out.print(array[i] + " ");
			sum += array[i];
		}
		System.out.println();
		System.out.println("平均值為..." + sum / 10.0f);
	}
	//↓↓↓↓第3題methods↓↓↓↓
	public static int maxElement(int x[][]){
		int max = x[0][0];
		for(int i = 0 ; i < x.length ; i++){
			for(int j = 0 ; j < x[i].length ; j++){
				if(x[i][j] > max){
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	public static double maxElement(double x[][]){
		double max = x[0][0];
		for(int i = 0 ; i < x.length ; i++){
			for(int j = 0 ; j < x[i].length ; j++){
				if(x[i][j] > max){
					max = x[i][j];
				}
			}
		}
		return max;
	}
	//↓↓↓↓進階題method↓↓↓↓
	public static void genAuthCode(){
		char[] authCode = new char[8];
		System.out.println("本次隨機產生驗證碼為:");
		for(int i = 0 ; i < authCode.length ; i++){
			switch((int)(Math.random() * 3)){
			case 0://數字0~9
				authCode[i] = (char)(Math.random() * 10 + 48);
				break;
			case 1://字母A~Z
				authCode[i] = (char)(Math.random() * 26 + 65);
				break;
			case 2://字母a~z
				authCode[i] = (char)(Math.random() * 26 + 97);
				break;
			}
			System.out.print(authCode[i]);
		}
	}
	//↓↓↓↓main method↓↓↓↓
	public static void main(String[] args) {
		System.out.println("↓↓↓↓第1題↓↓↓↓");
		int w, h;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		w = sc.nextInt();
		h = sc.nextInt();
		starSquare(w, h);

		
		System.out.println("↓↓↓↓第2題↓↓↓↓");
		randAvg();

		
		System.out.println("↓↓↓↓第3題↓↓↓↓");
		int[][] intArray = {{1, 6, 3},
							{9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2},
								  {7.4, 2.1, 8.2}};
		System.out.println(maxElement(intArray));
		System.out.println(maxElement(doubleArray));
		
		//第4題在另一個java檔
		
		System.out.println("↓↓↓↓進階題↓↓↓↓");
		genAuthCode();
	}

}
