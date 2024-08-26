package f.object.ex4;
//이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고 있는 개체를 만들어라

//데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get을 해줄수 있도로 ㄱ작성해라
//모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성

public class Student {
	// 필드영역(데이터)
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;

	// 기본생성자/ alt + shift + s + o
	public Student() {

	}

	public Student(String name, int age, int math, int eng, int kor) {
		super();
		this.name = name;
		this.age = age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
		

	// 메소드영역(기능)
	// getter, setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return this.name;
	}

	public void setAge(int age) {
		if(age<0) {
			this.age =0;
			return;
		}
		this.age = age;

	}

	public String getMath() {
		
		return this.name;
	}

	public void setMath(int Math) {
		if(math<0) {
			this.math =0;
			return;
		}
		this.math = math;
	}

	public String getEng() {
		return this.name;
	}

	public void setEng(int eng) {
		if(eng<0) {
			this.eng =0;
			return;
		}
		this.eng = eng;
	}

	public String getKor() {
		return this.name;
	}

	public void setKor(int kor) {
		if(kor<0) {
			this.kor =0;
			return;
		}
		this.kor = kor;
	}
	public double getEvg() {
		double evg = (this.kor + this.eng + this.math)/3;
		return evg;
	}
	public void printEvg() {
		System.out.println(this.getName() + "님의 평균 : " + this.getEvg());
	}
	
}
