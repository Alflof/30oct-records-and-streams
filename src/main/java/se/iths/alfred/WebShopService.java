package se.iths.alfred;

import se.iths.alfred.model.*;
import se.iths.alfred.model.Computer;
import se.iths.alfred.model.Headset;
import se.iths.alfred.model.Monitor;
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

    public String findFirstHeadsetTitleUnderPrice(
            List<Headset> headsets, double maxPrice){
        return headsets.stream()
                .filter(headset -> headset.price() < maxPrice)
                .map(headset -> headset.title())
                .findFirst()
                .orElseThrow();
    }

    public String findFirstMonitorTitleByMinSize(
            List<Monitor> monitors, int minInches) {
        return monitors.stream()
                .filter(monitor -> monitor.inches() >= minInches)
                .map(monitor -> monitor.title())
                .findFirst()
                .orElseThrow();
    }

    public Keyboard findFirstKeyboardByWireless(
            List<Keyboard> keyboards, boolean wireless) {
        return keyboards.stream()
                .filter(keyboard -> keyboard.wireless() == wireless)
                .findFirst()
                .orElseThrow();
    }
}
