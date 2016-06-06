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
			FileReader fr = new FileReader("Sample.txt");
			while(fr.read() != -1)
				chars++;
			BufferedReader br = new BufferedReader(fr);
			while(br.readLine() != null)
				lines++;
			System.out.printf("Sample.txt檔案共有%d個位元組,%d個字元,%d列資料",bytes,chars,lines);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
