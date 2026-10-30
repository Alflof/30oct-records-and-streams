package se.iths.alfred;

import se.iths.alfred.model.Computer;
import se.iths.alfred.model.Mouse;
import se.iths.alfred.model.Phone;

import java.util.List;

public class WebShopService {


    public Computer findMostExpensiveComputer(List<Computer> computerList) {
        Computer computer = computerList.stream()
                .sorted((a, b) -> Double.compare(b.price(), a.price()))
                .findFirst()
                .orElseThrow(); //NoSuchElementException kastas här (unchecked)
        return computer;

    }

    public Mouse findFirstMouseByMinDpi(List<Mouse> mice, int minDpi) {
        return mice.stream()
                .filter(mouse -> mouse.dpi() >= minDpi)
                .findFirst()
                .orElseThrow();
    }

    public Phone findFirstPhoneUnderPrice(
            List<Phone> phones, double maxPrice) {
        return phones.stream()
                .filter(phone -> phone.price() < maxPrice)
                .findFirst()
                .orElseThrow();
    }
}
