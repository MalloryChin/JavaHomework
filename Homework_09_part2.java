package Homework;

class Depot {
	private int stock = 0; // 帳戶金額
	private boolean isMomNotified = false;
	private boolean isBearNotified = false;

	synchronized public void save(int qty) {
		while (stock > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(isMomNotified){
			System.out.println("媽媽被熊大要求匯款");
			isMomNotified = false;
		}
		stock += qty;
		System.out.println("媽媽存了" + qty + "，帳戶共有：" + stock);
		notify();
		isBearNotified = true;
	}

	synchronized public void withdrawer(int qty) {
		while (stock < qty) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(isBearNotified){
			System.out.println("熊大被老媽告知帳戶裡已經有錢了!");
			isBearNotified = false;
		}
		stock -= qty;
		System.out.println("熊大領了" + qty + "，帳戶共有：" + stock);
		if (stock <= 1000) {
			System.out.println("熊大看到餘額在1000以下，要求匯款");
			notify();
			isMomNotified = true;
		}
	}
}

class Saver extends Thread {
	Depot depot;

	public Saver(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) //模擬10次存款
			depot.save(2000); // 媽媽每次存2000元
	}
}

class Withdrawer extends Thread {
	Depot depot;

	public Withdrawer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) //模擬10次領款
			depot.withdrawer(1000); // 熊大每次領1000元
	}
}

public class Homework_09_part2 {

	public static void main(String[] args) {
		Depot depot = new Depot();
		Saver saver = new Saver(depot);
		Withdrawer withdrawer = new Withdrawer(depot);
		saver.start();
		withdrawer.start();
		try {
			withdrawer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		saver.stop();
	}
	
}
