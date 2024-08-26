package e.array;

public class A_array2 {
	/*
	 * 
	 */

	public static void main(String[] args) {

		int[] iArr = new int[5];
		System.out.println(iArr.hashCode());

		double[] dArr = new double[3];
		System.out.println(dArr.hashCode());

		/*
		 * 실제 리터럴값을 곧바로 담을 수 있는 변수를 일반변수라고 한다. 주소값을 담고 있는 변수는 참조변수라고 한다.(레퍼런스 변수)
		 * 
		 * 기본자료형(원시타입) : boolean, int, char, byte, long, double 등등으로 선언도니 변수 => 실제 리터럴값을
		 * 바로 담을 수 있다. ex) int i = 10;
		 * 
		 * 그 외 자료형(String, Scanner, int[], double[], char[]....)-> 참조변수
		 * 
		 * 
		 */
		int[] iArr2 = new int[10];// 0~9번인덱스 사용가능, 0으로 초기화되어있음.
		for (int i = 0; i < iArr2.length; i++) {
			System.out.println(iArr2[i]);
		}
		double[] iArr3 = new double[4];// 0~3번 인덱스 사용가능, 0.0으로 초기화되어 잇음
		for (int i = 0; i < iArr3.length; i++) {
			System.out.println(iArr3[i]);
		}

		// 내가 각 인덱스의 초기화를 하지 않아도 값들이 담겨있다.
		//Heap이라는 메모리공간은 절대 빈공간을 허용하지 않는다.
		//=> 공간이 만들어질 때 JVM이 기본값으로라도 초기화를 진행한다.
		
	System.out.println(iArr2);//배열의  자료형 + @ + 주소값의 16진수 형태
	System.out.println(iArr2.hashCode());//주소값의 10진수 형태
	
	int[] arr =null;//아무것도 참조하고 있지 않음을 의미.
	System.out.println(arr);
	
	/*
	 * null을 가지고 있는 참조변수에 접근하여 다른 정보를 구하고자 하면 어덯게 될까?
	 * 항상 오류가 발생한다.
	 * 
	 *  System.out.println(arr.hashCode());
	 */
	//System.out.println(arr.hashCode());//null인 것에 .hashCode()를 하면 항상 에러가 발생한다.(빈값이기에)
	
	
	
	/*arr= new int[5];
	 * ArrayIndexoutofboundsException
	 * : 배열에 부적절한 인덱스 제시하면 발생하는 에러
	 * 	System.out.println(arr[5]);
	 * 
	 */
	
	//배열의 가장 큰 단점
	// 한번 지정된 배열의크기는 변경이 불가능하단.
	//=> 배열의 크기를 변경하고자 한다면 다시 만들어야한다.=> 주소값이 변경된다.(새로운 곳을 참조하고 있다.)
		
	/*
	 * 연결이 끊어진 기존 배열은 Heap영역에 둥둥 떠다닌다(어떤 변수에도 참조되지 않는 상태, 불러올 수 없는 메모리)
	 * => 일정 시간이 지나면 "가비지컬렉터(GC)" 알아서 지워줌
	 * => 자바에서의 "자동메모리관리"
	 */
	
	arr=null;//배열을 강제로 삭제시키고자 한다면 => 연결고리를 끊어주면 된다(null대입)
	
	int[] arr2 = {1,1,1,1,1};
	int[] arr3 = {1,1,1,1,1};
	System.out.println(arr2 == arr3);//false => 참조변수는 ==을 통해서 비교시 주소값을 비교하기 때문에 서로 다르다.
	
	arr3=arr2;
	System.out.println(arr2 == arr3);
	

	}

}
