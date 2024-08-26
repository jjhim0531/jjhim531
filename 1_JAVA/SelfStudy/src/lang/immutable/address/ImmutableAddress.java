package lang.immutable.address;

public class ImmutableAddress {
	private final String value;

	public ImmutableAddress(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Address{" + "value='" + value + "'}";
	}

}
