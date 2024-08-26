package java240802.ex1;

public class Album extends Item {
	String artist;

	public Album(String name, int price, String artist) {
		super(name, price);
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("- 아티스트 : " + artist);
	}
	

}
