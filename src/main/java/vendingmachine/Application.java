package vendingmachine;

import vendingmachine.io.ConsolePrinter;
import vendingmachine.io.ConsoleReader;
import vendingmachine.service.VendingMachine;

public class Application {
    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();
        ConsoleReader reader = new ConsoleReader(printer);
        String holdingMoney = reader.readHoldingMoney();
        CoinExchanger exchanger = new CoinExchanger();
        CoinPocket holdingCoin = new CoinPocket();
        VendingMachine machine = new VendingMachine();
    }
}
