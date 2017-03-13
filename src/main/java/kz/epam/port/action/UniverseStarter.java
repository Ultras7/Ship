package main.java.kz.epam.port.action;


import main.java.kz.epam.port.entity.Ship;
import main.java.kz.epam.port.entity.Universe;

public class UniverseStarter {
    public static void startUniverse(Universe universe) {
        for (Ship ship : universe.getShips()) {
            Thread thread = new Thread(ship);
            thread.start();
        }
    }
}
