package SOLID.dependencyInversionPrinciple;

import javax.management.monitor.Monitor;

public class WindowsMachine {
    public final Keyboard keyboard;
    public final Monitor monitor;

    public WindowsMachine( Keyboard keyboard, Monitor monitor) {
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

}
