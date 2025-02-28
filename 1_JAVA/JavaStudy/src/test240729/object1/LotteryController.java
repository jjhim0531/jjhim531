package test240729.object1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery lt) {
		return lottery.add(lt);//중복되지 않는 참가자만 추가 (Set 특성)
		//정상적으로 추가가 되면 true, 안되면 false 반환.
	}
	
	public boolean deleteObject(Lottery lt) {
		boolean isRemove = lottery.remove(lt);//전체 목록에서 삭제.
		if (isRemove && win != null) {
			win.remove(lt);//당첨된 경우 win(당첨자목록)에서도 제거
		}
		return isRemove;
	}
	
	//전체 인원에서 4명을 랜덤으로 뽑아 win(HashSet)에 저장
	public HashSet winObject() {
		if(lottery.size() < 4) {
			return null;//참가자가 4명보다 적으면 추첨 불가
		}
		
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// HashSet은 순서가 없어서 랜덤한 요소를 뽑는 list.get(index) 같은 기능을 사용할 수 없음.
		//ArrayList로 변환하면 인덱스를 사용하여 특정 요소를 쉽게 가져올 수 있음.
		//즉, 랜덤 인덱스를 생성하여 요소를 가져오기 위해 List로 변환하는 것!
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		
		//당첨자 4명을 뽑기 위한 반복 4번
		while(win.size() < 4) { //당첨자 4명 뽑을 때까지 반복
			int rand = (int)(Math.random() * list.size()); //'0'부터 'list 크기-1' 사이의 랜덤 숫자 생성
			//(int)로 변환하면 소수점 이하가 제거되어 0 ~ list.size()-1 사이의 정수 값이 생성됨.
			win.add(list.get(rand));//랜덤 자리에 있는 사람을 당첨 목록에 추가
			//win이 set이라서 자동으로 중복제거.(같은 사람이 여러 번 뽑히는 것을 방지)
			//새로운 값이 추가되면 true 반환, 이미 존재하는 값이면 false 반환.
		}
		
		return win;
	}
	
	// 당첨자를 정렬하여 TreeSet으로 반환
	public TreeSet sortedWinObject() {
		// SortedLottery 클래스에서 정렬 기준을 설정하여 자동 정렬 가능.
		//당첨자 목록을 TreeSet으로 변환하여 정렬.
		TreeSet sortedWinSet = new TreeSet(new SortedLottery()); //정렬 기준 적용
		sortedWinSet.addAll(win);
		return sortedWinSet;// 정렬된 당첨자 목록 반환
	}
	/*
	 TreeSet은 내부적으로 Comparator<T>를 사용하여 정렬된 상태로 데이터를 저장함.
	즉, new SortedLottery()를 TreeSet의 정렬 기준으로 전달하면, 자동으로 compare() 기준에 맞게 정렬됨.
	따라서 요소를 추가할 때마다 compare()가 호출되어 항상 정렬된 상태를 유지하게 됨.
	 */
	
	//특정 참가자가 당첨자(win) 목록에 있는지 확인
	public boolean searchWinner(Lottery lt) {
		return win.contains(lt);
	}  
}
