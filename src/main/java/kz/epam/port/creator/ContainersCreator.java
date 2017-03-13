package main.java.kz.epam.port.creator;


import main.java.kz.epam.port.entity.Container;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ContainersCreator {
    public static List<Container> createContainers(int numberOfContainers) {
        List<Container> containers = new ArrayList<>(numberOfContainers);
        for (int i = 0; i < numberOfContainers; i++) {
            containers.add(new Container(new Random(100).nextInt(500)));
        }
        return containers;
    }
}
