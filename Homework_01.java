
public class Homework_01 {

	public static void main(String[] args) {
		int num12 = 12 , num6 = 6;
		int egg = 200;
		int day, hour, min, sec = 256559;
		final float PI = 3.1415f;
		float principal = 150;
		
		//↓↓↓↓↓↓第1題↓↓↓↓↓↓
		System.out.println("sum=" + (num12 + num6)
						+ " product=" + (num12 * num6));
		
		//↓↓↓↓↓↓第2題↓↓↓↓↓↓
		System.out.println(egg / 12 + "打" + egg % 12 + "顆");
		
		//↓↓↓↓↓↓第3題↓↓↓↓↓↓
		day = sec / (60 * 60 * 24);
		sec = sec % (60 * 60 * 24); //扣掉天後剩餘的秒數
		hour = sec / (60 * 60);
		sec = sec % (60 * 60); //扣掉小時後剩餘的秒數
		min = sec / 60;
		sec = sec % 60; //扣掉分後剩餘的秒數
		System.out.println(day + "days " + hour + "hours " + min + "mins " + sec + "sec");
		
		//↓↓↓↓↓↓第4題↓↓↓↓↓↓
		System.out.println("areas=" + (5 * 5 * PI) + " perimeter=" + (2 * 5 * PI));
		
		//↓↓↓↓↓↓第5題↓↓↓↓↓↓
		for(int year = 1 ; year <= 10 ; year++){
			principal *= 1.02;
		}
		System.out.println(principal + "million dollars");
		
		//↓↓↓↓↓↓第6題↓↓↓↓↓↓
		//整數5+5=10，所以印出整數10
		System.out.println(5 + 5);
		
		//字元'5'的Unicode編碼為\u0035(16進制)
		//與整數5相加，被強制轉型為整數53(10進制)
		//所以最後5+53=58		
		System.out.println(5 + '5'); 
		
		//將數字5與字串5相連，所以印出55
		System.out.println(5 + "5");
	
	}

}
