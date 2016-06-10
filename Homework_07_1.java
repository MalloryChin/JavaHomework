//請寫一個程式,可以在讀入一個檔案後,顯示有多少個位元組
package Homework;

import java.io.FileInputStream;
import java.io.IOException;

public class Homework_07_1 {

	public static void main(String[] args) {
		int count = 0;
		try {
			FileInputStream fis = new FileInputStream("Sample.txt");
			while(fis.read() != -1)
				count++;
			fis.close();
			System.out.printf("共有%d個bytes",count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}