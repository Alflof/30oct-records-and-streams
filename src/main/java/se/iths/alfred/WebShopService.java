package se.iths.alfred;

import se.iths.alfred.model.Computer;

import java.util.List;

public class WebShopService {


    public Computer findMostExpensiveComputer(List<Computer> computerList) {
        Computer computer = computerList.stream()
                .sorted((a, b) -> Double.compare(b.price(), a.price()))
                .findFirst()
                .orElseThrow(); //NoSuchElementException kastas här (unchecked)
        return computer;
    }
}
