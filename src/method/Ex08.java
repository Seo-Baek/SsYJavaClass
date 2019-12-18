package method;

public class Ex08 {
	public static void change(int[] array) {
		System.out.println(array);
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;
		
	}

	public static void main(String[] args) {
		
		// int 형 배열 생성
		int[] arr = new int[3];	//arr : 참조변수
		
		arr[0] = 10; arr[1] = 20; arr[2] = 30;
		
		System.out.println(arr);
		System.out.println("change() 메소드 호출 전 ...");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		change(arr);	// change() 메소드 호출 시 인자로 참조변수(주소값)을 전달
	
		System.out.println("change() 메소드 호출 후 ...");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
	}

}
