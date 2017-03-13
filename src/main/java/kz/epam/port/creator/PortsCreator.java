package main.java.kz.epam.port.creator;


import main.java.kz.epam.port.entity.Port;
import main.java.kz.epam.port.entity.Storage;
import java.util.ArrayList;


public class PortsCreator {
    public static ArrayList<Port> createPorts() {
        Storage storage1 = new Storage(6);

        ArrayList<Port> ports = new ArrayList<>();
        ports.add(new Port("Kaspi", 6, storage1));

        return ports;
    }
}
