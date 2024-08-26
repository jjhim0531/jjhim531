package java240730;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;

	public int existMemberNum() {
		int exist = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				exist++;
			} else {
				break;
			}
		}
		return exist;

	}

	public boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				return true;
			}

			String userId = m[i].getId();

			if (userId.equals(inputId)) {
				return false;
			}

		}
		return true;

	}

	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender.charAt(0), age);
				break;
			}
		}
	}

	public String searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}
		}
		return null;
	}

	public Member[] searchName(String name) {
		Member[] arr = new Member[this.SIZE];
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getName().equals(name)) {
				arr[index++] = m[i];
			}
		}
		return arr;
	}

	public Member[] searchEmail(String email) {
		Member[] earr = new Member[this.SIZE];
		int index = 0;

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getEmail().equals(email)) {
				earr[index++] = m[i];

			}
		}
		return earr;
	}

	public boolean updatePassword(String id, String password) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;

			}
		}
		return false;

	}

	public boolean updateName(String id, String name) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;

	}

	public boolean updateEmail(String id, String email) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getEmail().equals(email)) {
				m[i].setEmail(email);
				return true;
			}
		}

		return false;

	}

	public boolean delete(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				return false;
			} else if (m[i].getId().equals(id)) {
				for (int j = i; j < m.length; j++) {
					m[j] = m[j + 1];
				}
				m[m.length - 1] = null;
				return true;
			}
		}

		return false;

	}

//	public void delete() {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m.length - 1; j++) {
//				m[j] = m[j + 1];
//
//				m[m.length - 1] = null;
//			}
//		}
//	}
	public void delete() {
		this.m = new Member[this.SIZE];
		
	}

	public Member[] printAll() {
		return this.m;
	}
}
