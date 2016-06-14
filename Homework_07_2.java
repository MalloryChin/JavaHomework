//請寫一個程式讀取Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
//(分別使用FileInputStream, FileReader, BufferedReader處理)
package Homework;

import java.io.*;

public class Homework_07_2 {

	public static void main(String[] args) {
		int bytes = 0, chars = 0, lines = 0;
		try {
			FileInputStream fis = new FileInputStream("Sample.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			while(bis.read() != -1)
				bytes++;
			fis.close();
			bis.close();
			FileReader fr = new FileReader("Sample.txt");
			while(fr.read() != -1)
				chars++;
			fr.close();
			fr = new FileReader("Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			while(br.readLine() != null)
				lines++;
			System.out.printf("Sample.txt檔案共有%d個位元組,%d個字元,%d列資料",bytes,chars,lines);
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}