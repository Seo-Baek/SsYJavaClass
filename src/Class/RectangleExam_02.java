package Class;

public class RectangleExam_02 {
		
		int width;
		int heigh;
		
		public RectangleExam_02() {  }
		
		public RectangleExam_02(int w, int h) {
			width = w;
			heigh = h;
		}
		
		void prn1() {
			System.out.println("사각형의 둘레 ==> " + ((width  + heigh) * 2));
		}
		
		void prn2() {
			System.out.println("사각형의 넓이 ==> " + (width * heigh));
		}
}


