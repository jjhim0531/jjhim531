package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MusicController {
	private Music m = new Music();
	private List list = new ArrayList();
	
	// 메소드
	public int addList(Music music) {
		// 마지막 리스트에 객체 저장, 1 리턴
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		// 첫 번째 리스트에 객체 저장, 1 리턴
		list.add(0, music);
		return 1;
	}
	
	
	public List printAll() {
		// List 반환
		return list;
	}
	
	public Music searchMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
		for(Object obj : list) {
			Music m = (Music)obj;
			if(m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		Music m = this.searchMusic(title);
		if(m != null) {
			this.list.remove(m);
			return m;
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
		Music m = this.searchMusic(title);
		if(m != null) {
			int index = this.list.indexOf(m);
			this.list.set(index, music);
			return m;
		}
		return null;
	}
	
	public int ascTitle() {
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		//Collections.sort : 컬렉션에서 정렬기능을 제공하는 메소드
		// 정렬하고싶은 컬렉션객체와 정렬기준을 정한 객체(Comparator구현한 객체)를
		// 전달하면 정렬기준에 맞춰 정렬을 수행해준다.
		Collections.sort(list, (Comparator) new AscTitle());
		return 1;
	}
	
	public int descSinger() {
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		Collections.sort(list, new Comparator<Music>() {
			@Override
			public int compare(Music o1, Music o2) {
				return o2.getSinger().compareTo(o1.getSinger());
			}
		});
		return 1;
	}
}
