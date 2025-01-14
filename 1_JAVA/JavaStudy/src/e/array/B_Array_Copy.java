package e.array;

public class B_Array_Copy {
	public static void main(String[] args) {
		/*
			int[] origin = {1, 2, 3, 4, 5};
			
			System.out.println("==원본 배열 출력==");
			
			for(int i=0; i < origin.length; i++) {
				System.out.print(origin[i] + " ");
			}
			System.out.println(); //개행
			
			//단순하게 origin을 다시 대입시킨 copy배열 생성
			int[] copy = origin;
			System.out.println("==복사본 배열 출력==");
			
			for(int i=0; i < copy.length; i++) {
				System.out.print(copy[i] + " ");
			}
			System.out.println();
			
			copy[2] = 99;
			System.out.println("----------------복사본 값 변경후--------------");
			
			System.out.println("==원본 배열 출력==");
			for(int i=0; i < origin.length; i++) {
				System.out.print(origin[i] + " ");
			}
			System.out.println(); 
		*/
		
		//copy의 값만을 수정해도 원본의 값이 함께 변경된다.
		// 왜? origin과 copy가 같은 메모리를 참조하고 있기 때문(참조변수의 주소값이 동일)
		// 얕은복사 : 주소값 복사
		
		//배열 복사 방법
		/*
		 * 1. for문을 활용한 방법
		 * 새로운 배열을 만들어서 반복문을 통해 원본배열의 값들을 새로운 배열에 대입
		 */
		
		/*
			int[] origin = {1,2,3,4,5};
			
			//origin배열과 크기가같은 copy배열 생성
			int[] copy = new int[origin.length];
			
			//origin배열에 있는 모든 값을 copy배열로 전달
			for(int i=0; i<origin.length; i++) {
				copy[i] = origin[i];
			}
			
			copy[2] = 99;
			
			System.out.println("==원본 배열 출력==");
			for(int i=0; i < origin.length; i++) {
				System.out.print(origin[i] + " ");
			}
			System.out.println(); //개행
			
			System.out.println("==복사본 배열 출력==");
			for(int i=0; i < copy.length; i++) {
				System.out.print(copy[i] + " ");
			}
			System.out.println();
		*/
		
		//2. 새로운 배열 생성 후 arraycopy() 메소드를 이용해서 복사하기
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; 
		
		
	/*
	 * System.arraycopy(
		    원본배열,       // 복사할 데이터가 있는 원본 배열
		    원본 인덱스,    // 원본 배열에서 복사를 시작할 위치
		    복사본 배열,    // 복사한 데이터를 저장할 배열
		    복사본 인덱스,  // 복사본 배열에서 데이터를 저장하기 시작할 위치
		    복사할 길이     // 복사할 요소의 개수
		);
		//배열의 부분복사 가능.
	 */
			    
		
		System.arraycopy(origin, 2, copy, 4, 3);
		//origin[2], origin[3], origin[4] 값(3, 4, 5)을 복사
		//복사본 배열의 인덱스 4, 5, 6 위치에 저장.
		//origin 배열에서 3개의 값을 복사.
		
		System.out.println("===복사본 배열 출력===");
		for(int i=0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
			//원본 배열의 3, 4, 5가 copy 배열의 인덱스 4, 5, 6에 복사됨.
			//나머지 값(초기화되지 않은 요소)은 기본값 0.
			//===복사본 배열 출력===
			//0 0 0 0 3 4 5 0 0 0


		}		
		
//		int[] copy = origin.clone();
		//배열의 **얕은 복사(Shallow Copy)**를 수행
		//복제된 배열(copy)은 원본 배열(origin)과 같은 데이터를 가지지만, 서로 독립적인 배열 객체입니다.

		
	}
}
