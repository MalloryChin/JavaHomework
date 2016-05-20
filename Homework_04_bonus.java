package Homework;

import java.util.Scanner;

public class Homework_04_bonus {

	public static void main(String[] args) {
		//↓↓↓↓進階第1題↓↓↓↓
		int[] date = new int[3];
		int days = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("請輸入年月日... (例如:1984 9 8)");
			for (int i = 0; i < date.length; i++)
				date[i] = sc.nextInt();
			if(date[1] == 2 && date[2] > 29){
				System.out.println("2月沒有這一天，請重新輸入");
				continue;
			} else{
				break;
			}
		}
		for(int i = 1 ; i < date[1] ; i++){
			switch(i){
			case 2:
				// if ((西元年分是400的倍數)或(西元年分是4的倍數但不是100的倍數)): 閏年
				// else : 平年
				if(date[0] % 400 == 0 || (date[0] % 4 == 0 && date[0] % 100 != 0)){
					days += 29;
				} else{
					days += 28; 
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days += 30;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days += 31;
				break;
			}
		}
		days += date[2];
		System.out.println("西元" + date[0] + "年，第" + days + "天");
		
		//↓↓↓↓進階第2題↓↓↓↓
		//                     No1, No2, No3, No4, No5, No6, No7, No8, 
		int[][] gradeTable = {{ 10,  35,  40, 100,  90,  85,  75,  70}, //一考
							  { 37,  75,  77,  89,  64,  75,  70,  95}, //二考
							  {100,  70,  79,  90,  75,  70,  79,  90}, //三考
							  { 77,  95,  70,  89,  60,  75,  85,  89}, //四考
							  { 98,  70,  89,  90,  75,  90,  89,  90}, //五考
							  { 90,  80, 100,  75,  50,  20,  99,  75}};//六考
		int[] bestTime = new int[8];
		int col = 0;
		for(int i = 0 ; i < gradeTable.length ; i++){
			int max = gradeTable[i][0];
			for(int j = 0 ; j < gradeTable[i].length ; j++){
				if(gradeTable[i][j] > max)
					max = gradeTable[i][j];
			}
			for(int j = 0 ; j < gradeTable[i].length ; j++){
				if(gradeTable[i][j] == max)
					bestTime[j]++;
			}			
		}
		System.out.println("每位同學考最高分的次數...");
		for(int i = 0 ; i < bestTime.length ; i++){
			System.out.print((i + 1) + "號:" + bestTime[i] + "次\t");
			col++;
			if(col == 4){
				System.out.println();
				col = 0;
			}
		}
		
	}

}
