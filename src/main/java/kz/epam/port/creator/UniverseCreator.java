package main.java.kz.epam.port.creator;


import main.java.kz.epam.port.entity.Port;
import main.java.kz.epam.port.entity.Ship;
import main.java.kz.epam.port.entity.Universe;

import java.util.ArrayList;


public class UniverseCreator {
    public static Universe createUniverse() {
        Universe universe = Universe.getUniverse();
        ArrayList<Port> ports = PortsCreator.createPorts();
        ArrayList<Ship> ships = ShipsCreator.createShips(ports);
        universe.setPorts(ports);
        universe.setShips(ships);
        return universe;
    }

}
