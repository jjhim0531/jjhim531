package t240729.MVC;

import java.util.Scanner;

public class MusicView {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// 메소드
	public void mainMenu() {
		
	}
	
	public void addList() {
		
	}
	
	public void addAtZero() {
		
	}
	
	public void printAll() {
		
	}
	
	public void searchMusic() {
		
	}
	
	public void removeMusic() {
		
	}
	
	public void setMusic() {
		
	}
	
	public void ascTitle() {
		System.out.println("******* 곡명 오름차순 정렬 *******");
		int res = mc.ascTitle();
		if(res == 1) {
			System.out.println("정렬 성공\n");
		}
		else {
			System.out.println("정렬 실패\n");
		}
	}
	
	public void dsecSinger() {
		
	}
}