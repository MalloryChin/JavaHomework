package Homework;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static int powerXY(int x, int y) throws CalException{
		if(x==0 && y==0){
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}
		return (int) Math.pow(x, y);
	}

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("請輸入x的值:");
				x = sc.nextInt();
				System.out.println("請輸入y的值:");
				y = sc.nextInt();
				System.out.println(x + "的" + y + "次方等於" + powerXY(x, y));
				break;
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
				sc = new Scanner(System.in);
			} catch(CalException e){
				System.out.println(e.getMessage());
			}
		}
	}
	
}