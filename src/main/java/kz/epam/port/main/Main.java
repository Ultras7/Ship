package main.java.kz.epam.port.main;


import main.java.kz.epam.port.action.UniverseStarter;
import main.java.kz.epam.port.creator.UniverseCreator;
import main.java.kz.epam.port.entity.Universe;

public class Main {


    public static void main(String[] args) {
        Universe universe = UniverseCreator.createUniverse();
        UniverseStarter.startUniverse(universe);
    }
}
