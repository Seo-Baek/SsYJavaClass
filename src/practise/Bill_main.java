package practise;

import java.util.Scanner;

public class Bill_main {
	
	public static final float TAX_RATE = 1.1f;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("품목의 개수를 입력하세요.");
		Bill[] bill = new Bill[sc.nextInt()];
		int tot = 0;
		
		for(int i = 0; i < bill.length; i++) {
			System.out.println("품명, 가격, 수량을 입력하세요 : ");
			bill[i] = new Bill(sc.next(),sc.nextInt(),sc.nextInt());
		}
		
		System.out.println();  
		
		System.out.println("품명\t단가\t수량\t  금액");
		System.out.println("------------------------------------");
		for(int i = 0; i < bill.length; i++) {
			System.out.printf("%s\t%,3d\t%2d\t%,7d원\n",bill[i].goods, bill[i].price, 
							   bill[i].selling, (bill[i].price * bill[i].selling));
			tot += bill[i].price * bill[i].selling;
			}
		int sup = (int)(tot /TAX_RATE);
		int vat = tot - sup;
		
		
		System.out.println("------------------------------------");
		System.out.printf("공급가액\t\t\t%,7d원\n", sup);
		System.out.printf("부가세  \t\t\t%,7d원\n", vat);
		System.out.println("------------------------------------");
		System.out.printf("청구금액\t\t\t%,7d원", tot);
		System.out.println();
		
		sc.close();
	}

}
