package test240726.object2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MusicController {
	//유연한 코드 작성 가능 (ArrayList → LinkedList 변경 가능)
	//다형성(Polymorphism) 활용 가능
	//다른 List 구현체(LinkedList, Vector)로 쉽게 변경 가능
	private List list = new ArrayList(); // ❌ 제네릭 미사용 (비추천)
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List printAll() {
		return this.list;
		
	}
	
	public Music searchMusic(String title) {
		for(Object obj : list) { // Object로 받음 (제네릭 미사용)
			Music m = ((Music)obj);  // 강제 형변환 필요
			if( m.getTitle().equals(title) ) {
				return m; // Music 객체 반환
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		Music m = this.searchMusic(title);
		if (m != null) {
			this.list.remove(m);
			return m;
		}
		return null;//찾은게 없으면 null 반환.
	}
	
	public Music setMusic(String title, Music newMusic) {
		Music m = this.searchMusic(title);
		if (m != null) {
			//indexOf(m)은 리스트에서 기존 곡이 몇 번째 위치에 있는지 찾는 역할
			// 만약 리스트에 m이 존재하지 않으면 -1을 반환!
			int index = list.indexOf(m);
			//list의 index 위치에 있는 데이터를 music으로 변경
			// 즉, 기존 곡을 새로운 Music 객체로 덮어쓰는 역할
			//list.set(int index, E element);
			this.list.set(index, newMusic);
			return m;
		}
		return null;
	}
	
	//Comparator를 별도 클래스로 구현한 경우 (ascTitle())
	public int ascTitle() {
		//Collections.sort : 컬렉션에서 정렬 기능을 제공하는 메소드
		//정렬하고 싶은 컬렉션 객체와 
		//정렬 기준을 정한 객체(Comparator 구현한 객체)를
		//전달하면 정렬기준에 맞춰 정렬을 수행해준다.
			
		//Comparator<Music> comparator = new AscTitle();
		//new AscTitle()은 Comparator 타입의 객체를 생성하는 것!	
		// compare() 메서드가 1, -1, 0을 반환하면 Collections.sort()가 이를 기반으로 정렬을 수행함.
		Collections.sort(list, new AscTitle());//AscTitle 클래스는 Comparator<Music>을 구현한 클래스.
		
		//list.sort(new AscTitle());
		//Collections.sort()는 내부적으로 List.sort()를 호출하여 정렬을 수행함.
		//즉, list.sort(c)는 Collections.sort(list, c);와 동일한 동작을 수행함!
		//Collections.sort() 대신 list.sort() 사용 가능!
		
		return 1;
	}
	
	//descSinger()에서는 AscTitle 같은 별도 클래스 없이 Comparator<Music>을 익명 클래스로 직접 구현!
	//계속 쓰는 함수가 아니라 한번만 쓰면 되는 경우엔 익명이 더 편함!
	public int descSinger() {
		Collections.sort(list, new Comparator<Music>() {
			@Override
			public int compare(Music o1, Music o2) {
				return o2.getSinger().compareTo(o1.getSinger());
			}
		});
		return 1;
	}
}
