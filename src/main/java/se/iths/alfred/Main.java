package se.iths.alfred;

import se.iths.alfred.model.Computer;
import se.iths.alfred.model.Monitor;
import se.iths.alfred.model.Phone;

import java.util.List;

public class Main {
    static void main() {
        Computer computer = new Computer("Macbook", 100);
        Computer pc = new Computer("PC", 10);
        Phone mobile = new Phone("Samsung X22", 300);
        Phone mobile2 = new Phone("Apple X22", 200);
        Monitor monitor = new Monitor("MSI", 32);
        Monitor monitor2 = new Monitor("Boo", 42);

        List<Computer> computerList = List.of(computer, pc);
        List<Phone> phoneList = List.of(mobile, mobile2);
        List<Monitor> monitors = List.of(monitor, monitor2);

        WebShopService webShopService = new WebShopService();

//        Optional<Computer> mostExpensive = webShopService.findMostExpensiveComputer(computerList);
//
//        if (mostExpensive.isPresent()) {
//            IO.println(mostExpensive.get());
//        }

        IO.println(webShopService.findMostExpensiveComputer(computerList));

        IO.println(webShopService.findFirstPhoneUnderPrice(phoneList, 500));

        IO.println(webShopService.findFirstMonitorTitleByMinSize(monitors, 40));

//        System.out.printf("Dator med title %s och pris %s", computer.title(), computer.price());
    }

}