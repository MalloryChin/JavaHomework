package Homework;

import java.util.Scanner;

public class Homework_04 {

	public static void main(String[] args) {		
		//↓↓↓↓↓↓↓↓第1題↓↓↓↓↓↓↓↓
		int[] ia = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0, avg;
		
		for(int i = 0 ; i < ia.length ; i++){
			sum += ia[i];
		}
		avg = sum / ia.length;
		System.out.println("Average is " + avg);
		System.out.println("Elements greater than average are...");
		for(int i = 0 ; i < ia.length ; i++){
			if(ia[i] > avg)
				System.out.print(ia[i] + "\t");
		}
		System.out.println();
		
		//↓↓↓↓↓↓↓↓第2題↓↓↓↓↓↓↓↓
		String s ="Hello World";
		//方法一
		String rs = new StringBuffer(s).reverse().toString();
		System.out.println(rs);
		//方法二
		char[] ca = s.toCharArray();
		for(int i = (ca.length - 1) ; i >= 0 ; i--)
			System.out.print(ca[i]);
		System.out.println();
		
		//↓↓↓↓↓↓↓↓第3題↓↓↓↓↓↓↓↓
		String[] sa = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		char[][] alp = new char[sa.length][];
		int vowel = 0;
		for(int i = 0 ; i < sa.length ; i++){
			alp[i] = sa[i].toCharArray();
			for(int j = 0 ; j < alp[i].length ; j++){
				switch(alp[i][j]){
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						vowel++;
				}
			}
		}
		System.out.println("there are " + vowel + " vowels");
		
		//↓↓↓↓↓↓↓↓第4題↓↓↓↓↓↓↓↓
		int[][] iaColeage$ = { {25, 2500},
							   {32, 800},
							   {8, 500},
							   {19, 1000},
							   {27, 1200} };
		int borrow$, ppl = 0;
		System.out.println("輸入欲借金額:");
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt())
			sc = new Scanner(System.in);
		borrow$ = sc.nextInt();
		System.out.print("有錢可借的員工編號:");
		for(int i = 0 ; i < iaColeage$.length ; i++){
			if(iaColeage$[i][1] >= borrow$){
				System.out.print(iaColeage$[i][0] + " ");
				ppl++;
			}
		}
		if(ppl == 0)
			System.out.print("無 ");
		System.out.print("共" + ppl + "人!");
	}

}
