
public class Homework_02_bonus {

	public static void main(String[] args) {
		int digit;
		int ten;
		int count = 0;
		char alp = 'A';
		System.out.println("↓↓↓↓↓↓進階第１題↓↓↓↓↓↓");
		for(int lottery = 1 ; lottery <= 49 ; lottery++){
			digit = lottery % 10;
			ten = lottery / 10;
			if(digit != 4 && ten != 4){
				System.out.print(lottery + ",");
				count++;
			}		
		}
		System.out.println("\nthere are " + count + " numbers");
		
		System.out.println("↓↓↓↓↓↓進階第２題↓↓↓↓↓↓");
		for(int line_countdown = 10 ; line_countdown > 0 ; line_countdown--){
			for(int num = 1 ; num <= line_countdown ; num++){
				System.out.print(num);
			}
			System.out.println();
		}
		
		System.out.println("↓↓↓↓↓↓進階第３題↓↓↓↓↓↓");
		for(int line = 1; line <= 6 ; line++){
			for(char num = 1 ; num <= line ; num++){
				System.out.print(alp);
			}
			alp++;
			System.out.println();
		}
	}

}
