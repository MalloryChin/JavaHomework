//請設計一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個
//參數所代表的檔案會複製到第二個參數代表的檔案
package Homework;

import java.io.*;

public class Homework_07_4{
	
	public static void copyFile(String filename1, String filename2) throws Exception{
		FileReader in = new FileReader(filename1);
		BufferedReader brIn = new BufferedReader(in);
		FileWriter out = new FileWriter(filename2);
		BufferedWriter bwOut = new BufferedWriter(out);
		PrintWriter pwOut = new PrintWriter(bwOut);
		//PrintWriter screenOut = new PrintWriter(System.out,true);
		String s;

		while ((s = brIn.readLine()) != null) { // 讀到檔案的尾端時,read()會回傳-1
			pwOut.println(s);
			//screenOut.println(s); //螢幕印出方法一
			//System.out.println(s); //螢幕印出方法二
		}

		pwOut.close(); bwOut.close(); out.close();
		brIn.close(); in.close();
	}
	
	public static void main(String[] args) throws Exception{
		copyFile("Data.txt", "Data-複製.txt");
	}
}
