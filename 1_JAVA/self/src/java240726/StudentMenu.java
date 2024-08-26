package java240726;

public class StudentMenu {
	StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		Student [] arr = ssm.printStudent();
		for(int i=0; i<arr.length; i++) {
			String info = arr[i].inform();
			System.out.println(info);

		}
		
		System.out.println("========== 학생 성적 출력 ==========");
		double[] all = ssm.avgScore();
		System.out.println("합계 : "+ all[0]);
		System.out.println("평균 : "+ all[1]);
		
		System.out.println("========== 성적 결과 출력 ==========");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getScore()<ssm.cutline) {
				System.out.println("재시험 대상입니다.");
			}else {
				System.out.println("통과입니다.");
			}
		}

	
	}
}