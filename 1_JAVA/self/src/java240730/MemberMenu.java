package java240730;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public MemberMenu() {

	}

	public void mainMenu() {
		int choice = 0;

		while (choice != 9) {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");

			if (mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
			} else {

				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제"); // ➔ deleteMember()
			System.out.println("5. 모두 출력"); // ➔ printAll()
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				this.insertMember();
				break;
			case 2:
				this.searchMember();
				break;
			case 3:
				this.updateMember();
				break;
			case 4:
				this.deleteMember();
				break;
			case 5:
				this.printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}

	}

	public void insertMember() {
		System.out.println("새 회원을 입력합니다.");
		String id, gender;

		while (true) {
			System.out.print("아이디 : ");

			id = sc.next();

			if (mc.checkId(id)) {
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}

		System.out.print("이름 : ");

		String name = sc.next();
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();

		while (true) {
			System.out.print("성별 : ");

			gender = sc.next();
			if (gender.equals("M") || gender.equals("F") || gender.equals("m") || gender.equals("f")) {
				break;
			} else {
				System.out.println("성별을 다시 입력해주세요");
			}
		}

		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, pwd, email, gender, age);

	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");

		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			this.searchId();
			break;
		case 2:
			this.searchName();
			break;
		case 3:
			this.searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
		}

	}

	public void searchId() {
		System.out.println("검색할 아이디 : ");
		String id = sc.next();

		String info = mc.searchId(id);

		if (info == null) {
			System.out.println("검색 결과 없습니다.");
		} else {
			System.out.println("찾으신 회원조회 결과입니다.");

			System.out.println(info);
		}

	}

	public void searchName() {
		System.out.println("검색할 이름 : ");
		String name = sc.next();

		Member[] arr = mc.searchName(name);
		if (arr[0] == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원조회 결과입니다.");

			for (int i = 0; i < arr.length; i++) {
				/*
				 * 위의 배열[0]==null과는 다른 이유로 써준것이다. 위에서는 아예 배열이 비어있는 걸 검사하는 거고 여기서는 계속 검사를 하다가 배열의
				 * n번째가 null이면 탈출하기 위해서 써준것이다.
				 */
				if (arr[i] == null) {
					break;
				}
				String info = arr[i].inform();
				System.out.println(info);
			}
		}

	}

	public void searchEmail() {
		System.out.println("검색할 이메일 : ");
		String id = sc.next();
		Member[] earr = mc.searchEmail(id);

		if (earr == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원조회 결과입니다.");
			for (int i = 0; i < earr.length; i++) {
				if (earr[i] == null) {
					break;
				}
				String info = earr[i].inform();
				System.out.println(info);
			}
		}

	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");

		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			this.updatePassword();
			break;
		case 2:
			this.updateName();
			break;
		case 3:
			this.updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
		}

	}

	public void updatePassword() {
		while (true) {
			System.out.println("수정할 회원의 아이디 입력 : ");

			String id = sc.next();

			String idInfo = mc.searchId(id);

			if (idInfo == null) {

				System.out.println("검색 결과 없습니다.");
			} else {

				System.out.println("수정할 회원의 비밀번호 입력 : ");
				String pwd = sc.next();

				boolean finalInfo = mc.updatePassword(id, pwd);
				if (finalInfo) {
					System.out.println("수정이 성공적으로 되었습니다.");
					break;
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			}
		}
	}

	public void updateName() {
		while (true) {
			System.out.println("수정할 회원의 아이디 입력 : ");
			String id = sc.next();

			String idInfo = mc.searchId(id);

			if (idInfo == null) {
				System.out.println("검색 결과 없습니다.");

			} else {
				System.out.println("수정할 회원의 이름 입력 : ");
				String name = sc.next();

				boolean finalInfo = mc.updateName(id, name);
				if (finalInfo) {
					System.out.println("수정이 성공적으로 되었습니다.");
					break;

				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			}
		}
	}

	public void updateEmail() {
		while (true) {
			System.out.println("수정할 회원의 아이디 입력 : ");

			String id = sc.next();

			String idInfo = mc.searchId(id);
			if (idInfo == null) {
				System.out.println("검색결과 없습니다.");
			} else {

				System.out.println("수정할 회원의 이메일 입력 : ");
				String email = sc.next();

				boolean info = mc.updateEmail(id, email);
				if (info) {
					System.out.println("수정이 성공적으로 되었습니다.");
					break;
				} else {
					System.out.println("존재하지 않는 이메일입니다.");
				}

			}
		}
	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			this.deleteOne();
		case 2:
			this.deleteAll();
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;

		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");

		}
	}

	public void deleteOne() {
		System.out.println("삭제할 아이디 입력 : ");
		String id = sc.next();

		System.out.println("정말 삭제하시겠습니까?(Y/N");
		char result = sc.next().charAt(0);
		if (result == 'Y' || result == 'y') {
			if (mc.delete(id)) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}

	}

	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까?(Y/N)");

		char result = sc.next().charAt(0);
		if (result == 'Y' || result == 'y') {
			mc.delete();
			System.out.println("정상적으로 삭제되었습니다.");

		}
	}

	public void printAll() {
		if (mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			Member[] arr = mc.printAll();
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==null) {
					break;
				}
				System.out.println(arr[i].inform());
			}
		}

	}

}
