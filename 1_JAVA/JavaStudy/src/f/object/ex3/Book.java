package f.object.ex3;

public class Book {
	/*
	 	접근제한자 : 해당구조에 접근할 수 있는 범위를 제한한다.
	 		public > protected > default > private
	 	
	 	클래스에 사용 가능한 접근제한자 2가지
	 	default, public
	 	
	 	필드와 메소드에 사용할 수 있는 접근제한자 4가지
	 	public : 어디서든(같은패키지, 다른패키지 모두) 접근 가능
	 	protected : 같은패키지 + 다른패키지일 경우 상속관계에서만 접근가능
	 	default : 같은패키지일때만 접근 가능
	 	private : 오직 해당 클래스에서만 접근 가능
	 */
	
	//필드
	private String title; //제목
	private String genre; //장르
	private String author; //저자
	private int maxPage; //페이지수
	
	
	//생성자
	//객체를 생성할 때 데이터를 초기화해주는 작업이 필수적으로 필요하기에
	//초기화를 위한 메소드를 만들어준다. -> 생성자라는 규칙이 생김
	//생성자영역(데이터를 초기화해주기위한 특수목적의 메소드를 정의하는 영역) - 생성자를 작성하지 않으면 Java가 기본 생성자를 자동으로 제공
	// * ex) 객체가 생성될 때 필드 초기화 등을 수행
	
//	public void init(String title, String genre, String author, int maxPage) {
//		this.title = title; //내가 가진(this)의 title에 넘겨받은 title을 넣는다.
//		this.genre = genre;
//		this.author = author;
//		this.maxPage = maxPage;
//	}
//	
	
	/*
	 생성자
	 - 클래스의 이름과 동일한 메소드로 반환형이 없다
	 - 필드 데이터의 초기화를 위한 특수목적의 메소드이다.
	 - 매개변수가 하나도 없는 생성자를 우리는 기본생성자라고합니다.
	 
	 - 생성자를 개발자가 직접 만들지 않는다면 컴파일러는 기본생성자를 만들어준다.
	 - 개발자가 직접 생성자를 작성하면 기본생성자를 만들어주지 않는다.
	 - 메소드의 매개변수의 갯수 또는 타입에 따라서 메소드를 구분하는 메소드 오버로딩은 생성자에도 적용이 된다. 이를 생성자 오버로딩이라고 부른다.
	 - 생성자 오버로딩이란 같은 이름의 생성자를 매개변수의 갯수나 타입에 따라 여러 개 정의하는 것.(호출 시, 순서만 다르다면 컴파일러는 이를 구분하지 못함.)
	 - 매개변수가 있는 생성자가 1개라도 정의되어 있으면 java는 기본생성자를 만들어주지 않는다. 따라서 직접 명식적으로 기본생성자를 적어줘야한다.
	 - 그래야만 new 키워드로 객체를 생성할 수 있다.
	 */
	
	public Book() {}//기본생성자 - 매개변수가 없는 생성자
	
	public Book(String title, String genre, String author) {
		this.title = title; //내가가진(this) title에 넘겨받은 title을 넣는다.
		this.genre = genre;
		this.author = author;
	}
	
	public Book(String title, String genre, String author, int maxPage) {
		this.title = title; //내가가진(this) title에 넘겨받은 title을 넣는다.
		this.genre = genre;
		this.author = author;
		this.maxPage = maxPage;
	}
	
	
	//메소드(getter/setter)//toString메서드 오버라이딩
	public String toString() {
		/*
		 this -> 인스턴스 객체(메모리를 사용중인 객체) 자기 자신을 의미
		 1. 자기 자신의 메모리를 가르킨다.
		 2. 생성자에서 다른 생성자를 호출할 수 있다.
		 3. 자기 자신의 주소를 반환할 수 있다.
		 */
		return "제목 :" + this.title + "\n장르 :" + this.genre + "\n저자 :" + 
		 		this.author + "\n총 페이지 :" + this.maxPage;  
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
}
