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
