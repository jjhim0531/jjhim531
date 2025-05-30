package test240731.object1;

import java.time.LocalDate;
import java.util.Objects;

public class Fruit extends Farm {
	private String name;
	LocalDate date;

	public Fruit() {
		super();
	}

	public Fruit(String name) {
		super();
		this.name = name;
	}

	public Fruit(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public Fruit(String kind, String name, LocalDate date) {
		super(kind, date); // 부모(Farm)에 kind, date 전달
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return super.getKind() + " : " + this.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, super.getKind());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Fruit) {
			Fruit f = (Fruit) obj;
			if (f.getName().equals(this.getName()) && f.getKind().equals(super.getKind())) {
				return true;
			}
		}
		return false;
	}

}
