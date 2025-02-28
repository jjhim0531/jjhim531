package test240729.object1;

import java.util.Objects;

public class Lottery {
	private String name;
	private String phone;
	public Lottery() {
		super();
	}
	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/*
	 @Override
	public int hashCode() {
		String str = this.name + this.phone;
		return str.hashCode();
		//name 또는 phone이 null일 경우 NullPointerException 발생 가능.
		//문자열 연결(+)이 발생하여 성능 저하 가능.
		//필드가 추가되거나 변경될 경우 유지보수가 어려움.
	}
	 */
	@Override
	public int hashCode() {
	    return Objects.hash(name, phone); //더 가독성이 좋고 안전함
	}
	//Objects.hash(name, phone, age, address) 등과 같이 필드를 추가하는 것이 간단함.  
	
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Lottery) {
			Lottery lo = (Lottery)obj;
			if(this.name.equals(lo.getName()) &&
					this.phone.equals(lo.getPhone())) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]";
	}
}
