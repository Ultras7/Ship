package main.java.kz.epam.port.creator;


import main.java.kz.epam.port.entity.Port;
import main.java.kz.epam.port.entity.Ship;
import java.util.ArrayList;


public class ShipsCreator {
    public static ArrayList<Ship> createShips(ArrayList<Port> ports) {
        ArrayList<Ship> ships = new ArrayList<>();
        for(int i=0; i<10; i++){
            ships.add(new Ship(i+1, 10*(i+1), ports));
        }
        return ships;
    }
}
