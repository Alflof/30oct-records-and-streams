package se.iths.alfred;

import se.iths.alfred.model.Computer;

import java.util.List;

public class Main {
    static void main() {
        Computer computer = new Computer("Macbook", 100);
        Computer pc = new Computer("PC", 10);

        List<Computer> computerList = List.of(computer, pc);

        WebShopService webShopService = new WebShopService();

//        Optional<Computer> mostExpensive = webShopService.findMostExpensiveComputer(computerList);
//
//        if (mostExpensive.isPresent()) {
//            IO.println(mostExpensive.get());
//        }

        IO.println(webShopService.findMostExpensiveComputer(computerList));

//        System.out.printf("Dator med title %s och pris %s", computer.title(), computer.price());
    }

}
