package time;

import java.time.ZoneId;

public class ZoneIdMain {

	public static void main(String[] args) {
		for(String azi : ZoneId.getAvailableZoneIds()) {
			ZoneId zi = ZoneId.of(azi);
			System.out.println(zi  +" | "+zi.getRules());
		}
		ZoneId seoulzi = ZoneId.systemDefault();
		System.out.println(seoulzi);
		

	}

}
