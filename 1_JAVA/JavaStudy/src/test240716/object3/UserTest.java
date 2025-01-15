package test240716.object3;

public class UserTest {
	public static void main(String args[]) {
		User[] users = new User[3];
		
		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");

		System.out.println("users list -----------------------------------------------------");
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].toString());
		}
		
		
		User[] copyUsers = new User[users.length];
		for(int i=0; i<users.length; i++) {
			copyUsers[i] = (User)users[i].clone();//다운캐스팅
			//clone() 메서드는 Object 클래스에서 제공되므로, 반환값은 기본적으로 Object 타입
			//User 타입으로 다운캐스팅해야함.
			//copyUsers[i] = (User)users[i].clone(); 단순히 이렇게만 쓰면 얕은복사가 이루어짐.
			//그러나 여기서는 오버라이딩으로 객체를 생성해놔서 깊은복사가 이루어졌다.
		}
		
//		for(int i=0; i<copyUsers.length; i++) {
//			User copy = copyUsers[i];
//			System.out.println(copy.toString());
//		}
		
		for(User copy : copyUsers) {
			System.out.println(copy.toString());
		}
		
		
		for(int i=0; i<copyUsers.length; i++) {
			System.out.println(copyUsers[i]==(users[i]));//false
			System.out.println(copyUsers[i].equals(users[i]));//true
			System.out.println();
		}
	}
}
