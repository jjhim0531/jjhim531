package I.io.ex3;

import java.io.FileOutputStream;

public class FileByte {
	/*
	 * "바이트 스트림"을 통한 입출력해보기
	 * 
	 * - 바이트스트림 : 데이터를 1바이터 단위로 전송하는 통로(좁은 통로 -> 한글깨짐)
	 * -기반 스트림 : 외부 매체와 직접저긍로 연갈하는 통로
	 * 
	 * xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부로부터 데이터를 읽어오겠다.)
	 * xxxOutputStream : xxx매체로부터 데이터를 출력하는 ㄴ통로(외부매체로 데이터를 내보내겠다.)
	 */
	
	//프로그램(자바) -> 외부매체(파일) 데이터를 출력(프로그램상의 데이터를 파일로 내보내보자)
	public void fileSave()
	{try {
		fout = new FileOutputStream("byte_test.txt");
		
	}catch(FileOutputStream e)
		e.printStackTrace();
	}
	}
}
