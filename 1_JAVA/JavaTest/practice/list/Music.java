package list;

import java.util.Objects;

public class Music {
	// 매개변수
	private String title;
	private String singer;
	
	// 기본 생성자
	public Music() {
		super();
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	// 메소드
	@Override
	public String toString() {
		return singer + " - " + title;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}

	// getter
	public String getTitle() {
		return this.title;
	}

	public String getSinger() {
		return this.singer;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
}