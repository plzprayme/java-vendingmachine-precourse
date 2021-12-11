package vendingmachine;

import vendingmachine.io.ConsolePrinter;
import vendingmachine.io.ConsoleReader;
import vendingmachine.service.VendingMachine;

public class Application {
    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();
        ConsoleReader reader = new ConsoleReader(printer);
        String holdingMoney = reader.readHoldingMoney();
        VendingMachine machine = new VendingMachine();
    }
}
