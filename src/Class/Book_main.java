package Class;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		
		Book[] book = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("책 제목 입력 : ");
			String title = sc.nextLine();
			System.out.print("책 저자 입력 : ");
			String author = sc.nextLine();
			System.out.println("::::::::::::::::::::::::::::::::::::::");
			
			book[i] = new Book(title, author);
		}
		
		System.out.print("찾으실 책을 입력하세요. : ");
		String found = sc.nextLine();
		for(int i = 0; i < book.length; i++) {
			if(found.equalsIgnoreCase(book[i].title)) {
				System.out.println("[책 제목 : " + book[i].title + "]\n     저자 : " + book[i].author);
			}
		}
		System.out.println();
		
		System.out.println("저장된 책의 목록");
		for(int i = 0; i < book.length; i++) {
			System.out.println((i+1) + ". [책 제목 : " + book[i].title + "]");
			System.out.println("          저자 : " + book[i].author);
			System.out.println();
		}
		
		sc.close();

	}

}
