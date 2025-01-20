package test240724.object1;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	//StringBuilder는 가변(mutable) 객체(참고 : 멀티스레드 환경: StringBuffer 사용 (안전하지만 성능 저하))
	//문자열을 동적으로 조작할 수 있도록 도와주는 가변(mutable) 문자열 클래스.
	//String 클래스와 유사 but 문자열 수정, 추가, 삭제할 때 훨씬 더 효율적.
	
	public void fileSave(String file, StringBuilder s) {
		fd.fileSave(file, s.toString());
	}
	//.toString(): StringBuilder → String 변환
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder s) {
		fd.fileEdit(file, s.toString());
	}
}
