//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到
//C:\data\Object.dat裡。注意物件寫入需注意的事項,若C:\內沒有data資料夾,
//請用程式新增這個資料夾
package Homework;

import java.io.*;

public class Homework_07_5{

	public static void main(String[] args) throws Exception{
		final int TWO = 2;
		Cat[] cat = new Cat[TWO];
		cat[0] = new Cat("Kitty");
		cat[1] = new Cat("catling");
		Dog[] dog = new Dog[TWO];
		dog[0] = new Dog("lucky");
		dog[1] = new Dog("doggy");
		File dir = new File("c:\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}
		FileOutputStream fos = new FileOutputStream("c:\\data\\Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < TWO; i++){
			oos.writeObject(cat[i]);
			oos.writeObject(dog[i]);
		}
		oos.close();
		fos.close();
	}
}
