package test240717.object1;

public class PersonController {
	Student[] s = new Student[3];// s,s,n
	Employee[] e = new Employee[10];//e,e,e,n,n,n,n,n,n,n
	
	public int[] personCount() {
		int[] countArr = new int[2];
		
		//여러 변수를 한줄에 선언 가능.
		int studentCount = 0, employeeCount = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				break;
			}
			studentCount++;
		}
		
		for(Employee emp : e) {
			if(emp == null) {
				break;
			}
			employeeCount++;
		}
		
		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return countArr;
	}
	
	
	public void insertStudent(String name, int age, double height, double weight, int grade,String major) {
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				return;//삽입 작업이 끝난 뒤 메서드를 종료하려는 경우에 적합
				//만약 삽입 이후에 추가 작업(예: 로그 출력)이 필요하다면, break를 사용하는 것이 더 적합
			}
		}
	}
	
	public Student[] printStudent() {
		return this.s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	
	public Student[] printEmployee() {
		return null;
	}
}

