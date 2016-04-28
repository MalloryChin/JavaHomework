
public class Homework_02 {

	public static void main(String[] args) {
		int sum = 0;
		int while_count = 1;
		for(int even = 2 ; even <= 1000 ; even += 2){
			sum += even;			
		}
		System.out.println("2+4+6+...+1000=" + sum);
		
		sum = 1;
		for(int count = 1 ; count <= 10 ; count++){
			sum *= count;
		}
		System.out.println("1*2*3*...*10=" + sum);
		
		sum = 1;		
		while(while_count <= 10){
			sum *= while_count;
			while_count++;
		}
		System.out.println("1*2*3*...*10=" + sum);
		
		for(int count = 1 ; count <= 10 ; count++){			
			System.out.print(count * count + " ");
		}		
	}

}
