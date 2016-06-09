package Homework;

import java.io.*;

public class Homework_07_3{
	public static void main(String[] args) throws Exception{
		int[] ran = new int[10];
		FileOutputStream fos = new FileOutputStream("Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		for(int i = 0 ; i < ran.length ; i++){
			ran[i] = (int)(Math.random() * 1000) + 1;
			ps.println(ran[i]);//Prints an integer.
			//↓方法二
			//ps.append(String.valueOf(ran[i]));
			//ps.println();
		}
		//筆記:PrintStream的print(int i) vs.　FileOutputStream的write(int b)
		//ps.print(83);//Prints an integer.It'll show 83 in the file
		//fos.write(83);//Writes the specified "byte" to this output stream.
		                //It'll show S in the file
		ps.close();
		bos.close();
		fos.close();
	}
}
