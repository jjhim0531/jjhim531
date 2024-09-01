package enumeration.test.http;

public enum HttpStatus {
	OK(200, "OK"), BAD_REQUEST(400, "Bad Request"), NOT_FOUND(404, "Not Found"),
	INTERNAL_SERVER_ERROR(500, "Internal Server Error");

	public final int code;
	public final String message;

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	private HttpStatus(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public static HttpStatus findByCode(int code) {
		for (HttpStatus st : values()) {
			if (st.getCode() == code) {
				return st;
			}
		}
		return null;
	}

	public boolean isSuccess() {
		
		return code>=200 && code<=299;
	}
}
