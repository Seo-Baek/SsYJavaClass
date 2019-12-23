package practise;

import java.util.Scanner;

public class Bill1_main {
	
	public static final float TAX_RATE = 1.1f;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("품목의 개수를 입력하세요.");
		Bill1[] bill = new Bill1[sc.nextInt()];
		int tot = 0;
		
		for(int i = 0; i < bill.length; i++) {
			bill[i] = new Bill1();
			System.out.println("품명, 가격, 수량을 입력하세요 : ");
			bill[i].setGoods(sc.next());
			bill[i].setPrice(sc.nextInt());
			bill[i].setSelling(sc.nextInt());
			tot += (bill[i].getPrice()*bill[i].getSelling());
		}
		
		System.out.println();
		System.out.println("품명\t단가\t수량\t  금액");
		System.out.println("------------------------------------");
		
		for(int i = 0; i < bill.length; i++) {
			System.out.printf("%s\t%,3d\t%2d\t%,7d원\n",bill[i].getGoods(), bill[i].getPrice(), 
							   bill[i].getSelling(), (bill[i].getPrice() * bill[i].getSelling()));
			}
		int sup = (int)(tot / TAX_RATE);
		int vat = tot - sup;
		

		System.out.println("------------------------------------");
		System.out.printf("공급가액\t\t\t%,7d원\n", sup);
		System.out.printf("부가세  \t\t\t%,7d원\n", vat);
		System.out.println("------------------------------------");
		System.out.printf("청구금액\t\t\t%,7d원", tot);
		
		sc.close();
		
	}

}
