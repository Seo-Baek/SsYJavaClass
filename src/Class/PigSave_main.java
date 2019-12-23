package Class;

public class PigSave_main {

	public static void main(String[] args) {
		
		// 돼지저금통 객체 생성
		PigSave pig = new PigSave(0);
		
		pig.deposit(3000);
		System.out.println();
		pig.deposit(5000);
		System.out.println();
		pig.withdraw(2000);
		System.out.println();
		pig.withdraw(500);
		
		//pig.balance = 100000;
		
	}

}
