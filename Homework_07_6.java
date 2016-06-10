//承上題,請寫一個程式,能讀出Object.dat這四個物件,並執行speak()方法
//觀察結果如何 (請利用多型簡化本題的程式設計)
package Homework;

import java.io.*;

abstract class Animal{
	abstract void speak();
}

public class Homework_07_6{

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("c:\\data\\Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}
}
