package himedia.myportal.exception;

// 구체적인 (사용자 정희) 예외 클래스
public class MainControllerException extends RuntimeException {
	public MainControllerException() {
		super("MainControllerException occurs!");
	}
	
	public MainControllerException(String message) {
		super(message);
	}

}
