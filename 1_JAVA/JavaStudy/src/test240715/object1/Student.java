package test240715.object1;

public class Student {
	//필드
	//접근제한자 자료형 변수이름;
	private String name;
	private int classRoom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;
	
	//기본생성자
	public Student() {
		super();
	}
	//**super()**는 부모 클래스의 생성자를 호출한다.
	//생성자 내부에서 가장 첫 줄에 작성해야 합니다.
	//여기서는 Student 클래스의 부모 클래스인 Object 클래스의 기본 생성자를 호출합니다.
	//생성자에 super();를 명시적으로 쓰지 않더라도, 컴파일러가 자동으로 추가해줍니다. 단지 시각적으로 더 명확히 표현하기 위해서 적어준다.
	//하지만, 부모 클래스에 기본 생성자가 없거나, 매개변수 있는 생성자를 호출하려면 super(매개변수);를 명시적으로 작성해야 합니다.

	public Student(String name, int classRoom, double javaScore, double sqlScore, double practiceScore) {
		super();
		this.name = name;
		this.classRoom = classRoom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
	}
	
	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public double getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}

	public double getSqlScore() {
		return sqlScore;
	}

	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	
	public String toString() {
		return this.classRoom + " " + this.name+ " " + this.javaScore + 
				" " + this.sqlScore + " " + this.practiceScore;
	}
	
	
	public double getEvg() {
		double sum = this.javaScore + this.practiceScore + this.sqlScore;
		return sum/3;
	}
	
	public boolean isPassed() {
		if(this.javaScore >= 50 && this.sqlScore >= 50 
				&& this.practiceScore >= 50 && this.getEvg() >= 60) {
			return true;
		}
		
		return false;
	}
	
	public void reTest() {
	    this.setJavaScore(Math.min(Math.random() * 101, 100.0));        // 0.0 ~ 100.0
	    this.setPracticeScore(Math.min(Math.random() * 101, 100.0));   // 0.0 ~ 100.0
	    this.setSqlScore(Math.min(Math.random() * 101, 100.0));        // 0.0 ~ 100.0
	}
	//Math.min()은 두 값 중 더 작은 값을 반환합니다.
	//Math.random() * 101로 생성된 값이 100.0을 초과할 경우, 강제로 100.0으로 제한합니다.



}