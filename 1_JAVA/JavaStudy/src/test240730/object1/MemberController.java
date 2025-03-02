package test240730.object1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	// map 선언 (제네릭 사용 X)
	HashMap map = new HashMap(); // HashMap<Object, Object>로 인식됨

	// 회원가입 기능을 구현한 메서드
	public boolean joinMembership(String id, Member m) {
		// id를 key로 값을 가져왔을 때 값이 없다면 회원추가
		if (map.get(id) == null) { // 새 회원 정보를 HashMap에 추가
			return true;
		}
		return false;// 이미 존재하는 아이디 → 회원가입 실패

	}

	public String login(String id, String password) {
		Member m = (Member) map.get(id);
		if (m != null) {
			if (m.getPassword().equals(password)) {
				return m.getName();
			}
		}

		return null;
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		Member m = (Member) map.get(id);
		if (m != null && m.getPassword().equals(oldPw)) {
			m.setPassword(newPw);
			return true;
		}
		return false;
	}

	public void changeName(String id, String newName) {
		Member m = (Member) map.get(id);
		if (m != null) {
			m.setName(newName);
		}
	}

	public TreeMap sameName(String name) {
		// map은 여러 개를 뽑는 것이 불가능. -> set으로 바꿔줘야한다.
		// map.keySet() -> id가 모여있는 set 자료구조(Map의 키들만 모아서 Set으로 반환)
		Set<Object> keySet = map.keySet(); // keySet()의 반환값은 Set<Object>(제네릭 설정을 안해줬기 때문)

		// key에 따른 정렬(오름차순)
		TreeMap result = new TreeMap(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		// for-each 문에서 key를 Object로 받음
		// keySet()이 Set<Object>이므로, map.keySet()의 요소인 id도 Object 타입.
		for (Object id : map.keySet()) {
			// set이 된 id로 value 값인 멤버객체를 하나씩 꺼낼 수 있음.
			// 즉, 뒤의 코드부터 m을 사용하기 위해 꺼내는 과정.
			Member m = (Member) map.get(id);
			if (m.getName().equals(name)) {
				result.put(id, m.getName());
			}
		}

		return result;
	}
}
