package lang.immutable.address;

public class MemberMainV2 {

	public static void main(String[] args) {
		ImmutableAddress address = new ImmutableAddress("서울");

		MemberV2 ma = new MemberV2("회원1", address);
		MemberV2 mb = new MemberV2("회원2", address);
		

		System.out.println(ma);
		System.out.println(mb);
		System.out.println();
		
		
		
		mb.setAddress(new ImmutableAddress("부산"));
		System.out.println(ma);
		System.out.println(mb);

	}

}

