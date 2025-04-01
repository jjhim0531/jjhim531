package test240731.object1;

import java.time.LocalDate;
import java.util.Objects;

public class Farm {
	private String kind;
	private LocalDate date;

	public Farm() {
		super();
	}

	public Farm(String kind) {
		super();
		this.kind = kind;
	}

	public Farm(LocalDate date) {
		super();
		this.date = date;
	}

	public Farm(String kind, LocalDate date) {
		super();
		this.kind = kind;
		this.date = date;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Farm [kind=" + kind + "]";
	}

	@Override
	public int hashCode() {

		return Objects.hash(this.getKind());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Farm) {
			Farm f = ((Farm) obj);
			if (f.getKind().equals(this.getKind())) {
				return true;
			}
		}
		return false;
	}

}
