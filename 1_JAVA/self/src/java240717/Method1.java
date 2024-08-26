package java240717;

public class Method1 {

	public static void main(String[] args) {
		Student a = new Student();
		paper(a, "학생1", 15, 90);
		
		Student b = new Student();
		paper(b, "학생1", 15, 90);
		
		
		printStudent(a);
		printStudent(b);
		
		
		

	}
	public static void paper(Student student, String name, int age, int grade) {
		student.name =name;
		student.age=age;
		student.grade=grade;
		
	}
	static void printStudent(Student a) {
		System.out.println("이름 : "+a.name + ", 나이 : " + a.age + ", 성적 : "+a.grade);
	}

}
