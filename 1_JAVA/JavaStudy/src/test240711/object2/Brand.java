package test240711.object2;

public class Brand {
	private String name;
	private int year;
	private int size;
	private int account;
	
	public Brand() {
		super();
	}

	public Brand(String name, int year, int size, int account) {
		super();
		this.name = name;
		this.year = year;
		this.size = size;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV가격 : %d", name, year, size, account);

	}
	

}
