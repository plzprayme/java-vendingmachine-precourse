package vendingmachine.io;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleReader {

	private static final String INPUT_INIT_MONEY_SYSTEM_MESSAGE = "자판기가 보유하고 있는 금액을 입력해 주세요.";

	private final ConsolePrinter printer;

	public ConsoleReader(ConsolePrinter printer) {
		this.printer = printer;
	}

	public String readHoldingMoney() {
		return readLine(INPUT_INIT_MONEY_SYSTEM_MESSAGE);
	}

	public String readLine(String message) {
		printer.printLine(message);
		return Console.readLine();
	}
}
