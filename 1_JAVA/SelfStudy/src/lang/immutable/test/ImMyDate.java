package lang.immutable.test;

public class ImMyDate {
	private final int year;
	private final int month;
	private final int day;

	public ImMyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public ImMyDate withYear(int newYear) {
		return new ImMyDate(newYear, month, day);
	}

	public ImMyDate withMonth(int newmonth) {
		return new ImMyDate(year, newmonth, day);
	}

	public ImMyDate withDay(int newDay) {
		return new ImMyDate(year, month, newDay);
	}

	@Override
	public String toString() {
		return "ImMyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
