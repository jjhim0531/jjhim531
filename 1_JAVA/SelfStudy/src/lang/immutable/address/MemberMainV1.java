package lang.immutable.address;

public class MemberMainV1 {

	public static void main(String[] args) {
		Address address = new Address("서울");

		MemberV1 ma = new MemberV1("회원1", address);
		MemberV1 mb = new MemberV1("회원2", address);
		

		System.out.println(ma);
		System.out.println(mb);
		System.out.println();
		
		mb.getAddress().setValue("부산");
		System.out.println(ma);
		System.out.println(mb);

	}

}
