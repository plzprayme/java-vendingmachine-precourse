package vendingmachine;

public class MoneyMustBeNumberException extends IllegalArgumentException {

	private static final String message =  "[ERROR] 금액은 숫자여야 합니다."

	public MoneyMustBeNumberException() {
		super(message);
	}
}
