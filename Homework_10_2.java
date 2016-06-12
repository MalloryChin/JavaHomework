package Homework;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_10_2 {
	public static void main(String[] args) {
		double number;
		String option;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字:");
		while(true){
			try{
				number = sc.nextDouble();
				break;
			} catch(InputMismatchException e){
				System.out.println("數字格式不正確，請再輸入一次!");
				sc = new Scanner(System.in);
			}	
		}
		System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
		while(true){
			option = sc.next();
			if(option.matches("[123]")) {
				break;
			} else {
				System.out.println("格式不正確，請再輸入一次!(1)千分位(2)百分比(3)科學記號:");
				sc = new Scanner(System.in);
			}
		}
		sc.close();
		switch (option) {
		case "1":
			Format dfm1 = new DecimalFormat("#,###.00");
			System.out.println(dfm1.format(number));
			System.out.printf("%,.2f", number);
			break;
		case "2":
			Format dfm2 = new DecimalFormat("#%");
			System.out.println(dfm2.format(number));
			System.out.printf("%.0f%%", number * 100);
			break;
		case "3":
			Format dfm3 = new DecimalFormat("0.###E0");
			System.out.println(dfm3.format(number));
			System.out.printf("%.3e", number);
			break;
		}
	}
}
