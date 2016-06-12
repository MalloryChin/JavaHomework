package Homework;


public class Homework_09_part1 implements Runnable {
	int count = 10;
	String name;

	public Homework_09_part1(String name) {
		this.name = name;
	} // 建構者函數
	
	public void run() { // 執行緒執行的地方
		for (int i = 1; i <= count; i++) {
			System.out.printf("%s吃第%d碗飯%n", name, i);

			try {
				Thread.sleep((int)(Math.random()*2500)+500); // 暫停0.5~3秒
			} catch (Exception e) {
			}
		}
		System.out.printf("%s吃完了!\n", name);
	}

	public static void main(String arg[]) {
		Homework_09_part1 r1 = new Homework_09_part1("饅頭人");// 產生Runnable物件
		Thread t1 = new Thread(r1); // 再由Runnable物件, 產生執行緒Thread物件
		Homework_09_part1 r2 = new Homework_09_part1("詹姆士");
		Thread t2 = new Thread(r2);
		System.out.println("----大胃王快食比賽開始!----");
		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
		t2.start();
		
		try{
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("----大胃王快食比賽結束!----");
	}
}

