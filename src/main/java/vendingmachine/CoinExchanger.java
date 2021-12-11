package vendingmachine;

public class CoinExchanger {

	private static final String MONEY_MUST_BE_NUMBER = "[0-9]+";

	public CoinPocket randomExchange(String money) {
		validate(money);
	}

	private void validate(String money) {
		// 숫자인지 체크
		isNumeric(money);
		// 10원 단위인지 체크
		int intMoney = Integer.parseInt(money);
		isFactorOfTen(intMoney);
		// 0원 인지 체크
	}

	private void isFactorOfTen(int intMoney) {
		if (intMoney % 10 != 0) {
			throw new MoneyMustBeNumberException();
		}
	}

	private void isNumeric(String money) {
		if (money.matches(MONEY_MUST_BE_NUMBER)) {
			throw new MoneyMustBeNumberException();
		}
	}
}
