import java.util.Scanner;

public class Test {

	public static void main(String[] args) {	
		int digit, ten, col = 0, count = 0, hateNum;		
		RandomArray ranArray = new RandomArray(new int[6]);
		ranArray.Create();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字");
		
		while (!sc.hasNextInt()) { //接受輸入直到使用者輸入整數為止
			sc = new Scanner(System.in);
		}
		hateNum = sc.nextInt();
		
		for (int i = 1; i <= 49; i++) {
			digit = i % 10; //紀錄個位數字
			ten = i / 10; //紀錄十位數字
			if (digit != hateNum && ten != hateNum) {//個位數十位數都不是阿文討厭的數字，表示是OK的樂透號碼
				System.out.print(i + "\t"); //印出OK的樂透號碼
				col++;
				count++;
			} else{
				ranArray.ReplaceUnwantedElement(i);	//過濾掉不要的樂透號碼
			}
			if (col == 6) { //每印6個換一行
				col = 0;
				System.out.println();
			}
		}
		System.out.println("總共有" + count + "數字可選");
		
//		for(int i = 0 ; i<ranArray.getArray().length ; i++){ //印出不重複的亂數陣列
//			System.out.printf("array[%d]=%d\n", i, ranArray.getArray()[i]);
//		}
		
		System.out.println("電腦幫你選了...");
		for(int i = 0 ; i<ranArray.getArray().length ; i++){
			System.out.print(ranArray.getArray()[i] + "\t");
		}
	}
}

class RandomArray {
	private int number;//預設值為0
	private int array[];
	private boolean b;
	
	
	public int[] getArray() {
		return array;
	}

	public RandomArray(int[] array) {
		this.array = array;
	}

	public int[] Create(){
		for(int i = 0 ; i < array.length ; i++){
		b = true;
		while(b){
			b = false;
			number = (int)(Math.random() * 49 + 1);
			for(int j = 0 ; j < array.length ; j++){
				if(number == array[j]){
					b = true;
				}
			}
		}
		array[i] = number;
//		System.out.printf("array[%d]=%d\n", i, number); //印出不重複的亂數陣列
		}
		return array;
	}
	
	public int[] ReplaceUnwantedElement(int iUnwantedNum){
		for(int i = 0 ; i < array.length ; i++){			
			if(array[i] == iUnwantedNum){ //陣列裡有不要的樂透號碼
				b = true;
				while(b){ //換一個隨機產生的亂數 
					b = false;
					number = (int)(Math.random() * 49 + 1);
					for(int j = 0 ; j < array.length ; j++){ //若有重複或又換到不要的樂透號碼 則繼續換
						if(number == array[j] || number == iUnwantedNum){
							b = true;
						}
					}
				}
				array[i] = number;
			}
		}	
		return array;
	}

}
